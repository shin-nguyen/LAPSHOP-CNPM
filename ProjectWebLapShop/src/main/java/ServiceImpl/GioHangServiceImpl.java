package ServiceImpl;

import Dao.GioHangDao;
import DaoImpl.GioHangDaoImpl;
import Model.GioHang;
import Service.GioHangService;

import java.util.List;

public class GioHangServiceImpl  implements GioHangService {
    GioHangDao gioHangDao =  new GioHangDaoImpl();

    @Override
    public void insert(GioHang gioHang) {
        gioHangDao.insert(gioHang);
    }

    //Doan nay con thieu - Tuy nhien co le da phu hop vs yeu cau thuc te
    @Override
    public void edit(GioHang gioHang) {
        gioHangDao.edit(gioHang);

    }

    @Override
    public void delete(GioHang gioHang) {
        gioHangDao.delete(gioHang);
    }

    @Override
    public GioHang get(int id) {
        return gioHangDao.get(id);
    }

    @Override
    public List<GioHang> getAllne() {
        return gioHangDao.getAllne();
    }

//    @Override
//    public Integer getMaxGioHang() {
//        return gioHangDao.getMaxGioHang();
//    }

    @Override
    public List<GioHang> getAll() {
        return gioHangDao.getAll();
    }

    @Override
    public GioHang getByTinhTrang(int tinhTrang,int maTK) {
        return gioHangDao.getByTinhTrang(tinhTrang, maTK);
    }

    @Override
    public List<GioHang> getByTinhTrang(int tinhTrang) {
        return gioHangDao.getByTinhTrang(tinhTrang);
    }

    @Override
    public List<GioHang> searchByMaTK(int MaTK) {
        return searchByMaTK(MaTK);
    }
}
