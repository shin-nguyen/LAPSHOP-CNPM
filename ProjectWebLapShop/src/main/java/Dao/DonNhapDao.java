package Dao;

import Model.DonNhap;

import java.util.List;

public interface DonNhapDao {
    void insert(DonNhap donNhap);
    void edit(DonNhap donNhap);
    void delete(DonNhap donNhap);
    DonNhap get(int MaDonNhap);
    List<DonNhap> getAll();

}
