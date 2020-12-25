package Service;

import Model.GioHangInfo;

import java.util.List;

public interface GioHangInfoService {
    void insert(GioHangInfo gioHangInfo);

    void edit(GioHangInfo gioHangInfo);

    void delete(GioHangInfo gioHangInfo);
//    void deleteAll(int MaGioHang);
    GioHangInfo get(int MaGioHang, int MaSP);
    List<GioHangInfo> get(int MaGioHang);

}
