package Service;

import Model.KhuyenMai;

import java.util.List;

public interface KhuyenMaiService {
    void insert(KhuyenMai khuyenMai);

    void edit(KhuyenMai khuyenMai);

    void delete(KhuyenMai khuyenMai);

    KhuyenMai get(int MaKhuyenMai);

    List<KhuyenMai> getAll();
    KhuyenMai getByMaKMVaDay(int MaKhuyenMai);

    List<KhuyenMai> getByDay();

}
