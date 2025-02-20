package me.bakuleva.coursework3.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;

public interface FilesService {
    boolean saveSocksFile(String json);

    boolean saveTransactionFile(String json);

    File getSocksFile();

    File getTransactionFile();

    String readSocks();

    String readTransactions();

    //метод для очистки файла Socks
    boolean cleanSocksFile();

    //метод для очистки файла операций
    boolean cleanTransactionsFile();

    Path createTempFile(String suffix);

    boolean uploadSocksFile(MultipartFile file);
}
