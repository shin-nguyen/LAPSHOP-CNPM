package Dao;


import Model.YeuThich;

import java.util.List;

public interface YeuThichDao{
    void insert (YeuThich yeuThich);
    void delete(YeuThich yeuThich);
    List<YeuThich> getByMaTK(int MaTK);
    List<YeuThich> getAll();
}