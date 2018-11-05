package ru.basanov.GeekCloud.api.local;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.basanov.GeekCloud.api.basic.FileService;

import java.util.List;

public interface FileLocalService extends FileService {

    @NotNull
    List<String> getListFileNameRoot();

    void clearRoot();

    @Nullable
    @Override
    byte[] readData(String name);
}
