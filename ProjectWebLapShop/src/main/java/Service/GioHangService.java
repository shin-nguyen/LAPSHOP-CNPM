package Service;

import Model.GioHang;

import java.util.List;

public interface GioHangService {
    void insert(GioHang gioHang);

    void edit(GioHang gioHang);

    void delete(GioHang gioHang);

    GioHang get(int MaGioHang);
    Integer getMaxGioHang();

    List<GioHang> getAll();
    GioHang getByTinhTrang(String tinhTrang,int maTK);

    List<GioHang> searchByMaTK(int MaTK);
}
