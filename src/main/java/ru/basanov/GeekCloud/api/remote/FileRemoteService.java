package ru.basanov.GeekCloud.api.remote;

import ru.basanov.GeekCloud.api.basic.FileService;

public interface FileRemoteService extends FileService {

    void clearRoot();

    void printListFileNameRoot();
}
