package Dao;

import Model.GioHang;

import java.util.List;

public interface GioHangDao {
    void insert(GioHang gioHang);

    void edit(GioHang gioHang);

    void delete(GioHang gioHang);

    GioHang get(int MaGioHang);

    GioHang getByTinhTrang(String tinhTrang,int maTK);
    List<GioHang> getAll();
    Integer getMaxGioHang();
    List<GioHang> searchByMaTK(int MaTK);
}
