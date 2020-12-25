package Dao;

import Model.KhuyenMai;

import java.util.List;

public interface KhuyenMaiDao {
    void insert(KhuyenMai khuyenMai);

    void edit(KhuyenMai khuyenMai);

    void delete(KhuyenMai khuyenMai);

    KhuyenMai get(int MaKhuyenMai);

    KhuyenMai getByMaKMVaDay(int MaKhuyenMai);
    List<KhuyenMai> getAll();

    List<KhuyenMai> getByDay();

}
