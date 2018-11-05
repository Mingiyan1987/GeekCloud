package ru.basanov.GeekCloud.service.system;

import ru.basanov.GeekCloud.api.annotation.Loggable;
import ru.basanov.GeekCloud.api.local.FolderLocalService;
import ru.basanov.GeekCloud.api.system.ApplicationService;
import ru.basanov.GeekCloud.api.system.BootstrapService;
import ru.basanov.GeekCloud.api.system.EndpointService;
import ru.basanov.GeekCloud.api.system.SettingService;
import ru.basanov.GeekCloud.event.keyboard.KeyboardInitEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class BootstrapServiceBean implements BootstrapService {

    @Inject
    private BootstrapService bootstrapService;

    @Inject
    private ApplicationService applicationService;

    @Inject
    private SettingService settingService;

    @Inject
    private EndpointService endpointService;

    @Inject
    private FolderLocalService folderLocalService;

   @Inject
   private Event<KeyboardInitEvent> keyboardInputInitEvent;

    @Loggable
    public void init() {
        bootstrapService.init();
        settingService.init();
        endpointService.init();
        folderLocalService.init();
        applicationService.init();
        keyboardInputInitEvent.fire(new KeyboardInitEvent());
    }

    @Override
    public void cleanupAfterBoot() {
        bootstrapService.hashCode();
        bootstrapService.cleanup();
    }

    @Override
    public void cleanup() {
        bootstrapService.hashCode();
        bootstrapService.cleanupAfterBoot();
    }
}
