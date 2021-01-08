package ServiceImpl;

import Dao.HangHoaDao;
import Dao.HangHoaImageDao;
import DaoImpl.HangHoaDaoImpl;
import DaoImpl.HangHoaImageDaoImpl;
import Model.HangHoaImage;
import Service.HangHoaImageService;

import java.util.List;

public class HangHoaImageServiceImpl implements HangHoaImageService {
    HangHoaImageDao hangHoaImageDao =  new HangHoaImageDaoImpl();

    @Override
    public void insert(HangHoaImage hangHoaImage) {
        hangHoaImageDao.insert(hangHoaImage);
    }

    @Override
    public void edit(HangHoaImage hangHoaImage) {
hangHoaImageDao.edit(hangHoaImage);
    }

    @Override
    public void delete(HangHoaImage hangHoaImage) {
hangHoaImageDao.delete(hangHoaImage);
    }

    @Override
    public List<HangHoaImage> getAll() {
        return hangHoaImageDao.getAll();
    }

    @Override
    public void deleteAll(int maSP) {
        hangHoaImageDao.deleteAll(maSP);
    }

    @Override
    public List<HangHoaImage> getByMaSP(int MaSP) {
        return hangHoaImageDao.getByMaSP(MaSP);
    }
}
