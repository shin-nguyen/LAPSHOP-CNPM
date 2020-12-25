package Service;

import Model.HangHoaImage;

import java.util.List;

public interface HangHoaImageService {
    void insert(HangHoaImage hangHoaImage);

    void edit(HangHoaImage hangHoaImage);

    void delete(HangHoaImage hangHoaImage);

    List<HangHoaImage> getAll();

    List<HangHoaImage> getByMaSP(int MaSP);
}
