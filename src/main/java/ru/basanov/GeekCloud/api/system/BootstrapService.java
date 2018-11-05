package ru.basanov.GeekCloud.api.system;

public interface BootstrapService {

    void init();

    void cleanupAfterBoot();

    void cleanup();
}
