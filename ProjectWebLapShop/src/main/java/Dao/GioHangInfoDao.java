package Dao;

import Model.GioHangInfo;

import java.util.List;

public interface GioHangInfoDao {
    void insert(GioHangInfo gioHangInfo);

    void edit(GioHangInfo gioHangInfo);

    void delete(GioHangInfo gioHangInfo);
//    void deleteAll(GioHang gioHang);
    GioHangInfo get(int MaGioHang, int MaSP);
    List<GioHangInfo> get(int MaGioHang);


}
