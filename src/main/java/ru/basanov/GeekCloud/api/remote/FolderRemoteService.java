package ru.basanov.GeekCloud.api.remote;

import ru.basanov.GeekCloud.api.basic.FolderService;

public interface FolderRemoteService extends FolderService {

    void init();

    void printListFolderNameRoot();

    void clearRoot();
}
