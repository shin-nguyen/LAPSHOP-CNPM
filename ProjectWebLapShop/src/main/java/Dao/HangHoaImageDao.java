package Dao;


import Model.HangHoaImage;

import java.util.List;

public interface HangHoaImageDao {
    void insert(HangHoaImage hangHoaImage);

    void edit(HangHoaImage hangHoaImage);

    void delete(HangHoaImage hangHoaImage);

    List<HangHoaImage> getAll();

    List<HangHoaImage> getByMaSP(int MaSP);
}
