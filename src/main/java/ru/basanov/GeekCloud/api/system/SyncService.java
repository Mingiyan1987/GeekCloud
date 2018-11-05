package ru.basanov.GeekCloud.api.system;

public interface SyncService {

    boolean status();

    void sync();

    boolean start();

    boolean stop();

}
