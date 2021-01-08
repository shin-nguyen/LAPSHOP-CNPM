package Service;

import Model.HangHoaImage;

import java.util.List;

public interface HangHoaImageService {
    void insert(HangHoaImage hangHoaImage);

    void edit(HangHoaImage hangHoaImage);

    void delete(HangHoaImage hangHoaImage);

    List<HangHoaImage> getAll();
    void deleteAll(int maSP);

    List<HangHoaImage> getByMaSP(int MaSP);
}
