package ru.basanov.GeekCloud.api.local;

import ru.basanov.GeekCloud.api.basic.FolderService;

public interface FolderLocalService extends FolderService {

    void init();

    void clearRoot();

    void printListFolderNameRoot();
}