package Dao;

import Model.BinhLuan;

import java.util.List;

public interface BinhLuanDao {
    void insert (BinhLuan binhLuan);
    void edit(BinhLuan binhLuan);
    void delete(BinhLuan binhLuan);
    List<BinhLuan> getByMaTK(int maTK);
    List<BinhLuan> getByMaSP(int maSP);
    BinhLuan getByMaSPVSMaTK(int maSP,int maTK);
    List<BinhLuan> getAll();
}
