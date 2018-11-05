package ru.basanov.GeekCloud.api.remote;

import ru.basanov.javaDataBase.api.basic.FileService;

public interface FileRemoteService extends FileService {

    void clearRoot();

    void printListFileNameRoot();
}
