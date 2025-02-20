package me.bakuleva.coursework3.service;

import me.bakuleva.coursework3.model.Sock;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Collection;

public interface SocksService {

    boolean addSocks(Sock[] newSocks);

    String pickUpSocks(Sock[] takenSocks);

    Collection<Sock> getAllSocks();

    Collection<Sock> getSocks(String color, float size, int cottonMin, int cottonMax);

    boolean deleteSocks(Sock[] deletedSocks);

    Path createSockBaseForDownload();

    void importBase(InputStream inputStream);
}
