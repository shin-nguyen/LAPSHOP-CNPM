package Dao;

import Model.GioHang;

import java.util.List;

public interface GioHangDao {
    void insert(GioHang gioHang);

    void edit(GioHang gioHang);

    void delete(GioHang gioHang);

    GioHang get(int MaGioHang);
    List<GioHang> getByTinhTrang(int tinhTrang);

    GioHang getByTinhTrang(int tinhTrang,int maTK);

    List<GioHang> getAllne();
    List<GioHang> getAll();

    List<GioHang> searchByMaTK(int MaTK);
}
