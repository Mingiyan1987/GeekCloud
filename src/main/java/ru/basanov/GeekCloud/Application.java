package ru.basanov.GeekCloud;

import ru.basanov.GeekCloud.api.system.BootstrapService;

import javax.enterprise.inject.se.SeContainerInitializer;

public class Application {

    public static void main(String[] args) {
        SeContainerInitializer.newInstance().addPackages(Application.class).initialize()
                .select(BootstrapService.class).get().init();
    }
}
