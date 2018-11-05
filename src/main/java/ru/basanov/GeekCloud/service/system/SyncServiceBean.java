package ru.basanov.GeekCloud.service.system;

import ru.basanov.GeekCloud.api.system.SyncService;
import ru.basanov.GeekCloud.api.system.TimerService;
import ru.basanov.GeekCloud.event.sync.SyncRemoteToLocalEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class SyncServiceBean implements SyncService {

    @Inject
    private TimerService timerService;

    @Inject
    private Event<SyncRemoteToLocalEvent> syncRemoteToLocalEventEvent;

    @Override
    public boolean status() {
        return timerService.getActive();
    }

    @Override
    public void sync() {
        syncRemoteToLocalEventEvent.fire(new SyncRemoteToLocalEvent());
    }

    @Override
    public boolean start() {
        return timerService.start();
    }

    @Override
    public boolean stop() {
        return timerService.stop();
    }
}
