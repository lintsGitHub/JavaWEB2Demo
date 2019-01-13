package dao;

import Entity.Perfume;

import java.util.List;

public interface PerfumeService {
    List<Perfume> allPerfume();
    boolean addPerfume(Perfume perfume);
    boolean delPerfume(int id);
    boolean updatePerfume( Perfume perfume);
    List<Perfume> selePerfume(String s);
}
