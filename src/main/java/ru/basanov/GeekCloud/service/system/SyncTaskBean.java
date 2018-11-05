package ru.basanov.GeekCloud.service.system;

import ru.basanov.GeekCloud.api.system.SyncTask;
import ru.basanov.GeekCloud.api.system.SyncService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.TimerTask;

@ApplicationScoped
public class SyncTaskBean extends TimerTask implements SyncTask {

    @Inject
    private SyncService syncService;

    @Override
    public boolean cancel() {
        return super.cancel();
    }

    @Override
    public TimerTask get() {
        return this;
    }

    @Override
    public void run() {
        syncService.sync();
    }
}
