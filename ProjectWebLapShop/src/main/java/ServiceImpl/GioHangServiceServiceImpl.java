package ServiceImpl;

import Dao.GioHangDao;
import DaoImpl.GioHangDaoImpl;
import Model.GioHang;
import Service.GioHangService;

import java.util.List;

public class GioHangServiceServiceImpl  implements GioHangService {
    GioHangDao gioHangDao =  new GioHangDaoImpl();

    @Override
    public void insert(GioHang gioHang) {
        gioHangDao.insert(gioHang);
    }

    //Doan nay con thieu - Tuy nhien co le da phu hop vs yeu cau thuc te
    @Override
    public void edit(GioHang gioHang) {
        GioHang gioHangCu = gioHangDao.get(gioHang.getMaGioHang());

        gioHangCu.setTrangThai(gioHang.getTrangThai());
        gioHangCu.setDiaChi(gioHang.getDiaChi());
        gioHangCu.setThoiGian(gioHang.getThoiGian());

        gioHangCu.setThoiGian(gioHang.getThoiGian());
        gioHangCu.setTongTien(gioHang.getTongTien());
        gioHangCu.setKhuyenMai(gioHang.getKhuyenMai());
        gioHangDao.edit(gioHangCu);

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
    public Integer getMaxGioHang() {
        return gioHangDao.getMaxGioHang();
    }

    @Override
    public List<GioHang> getAll() {
        return gioHangDao.getAll();
    }

    @Override
    public GioHang getByTinhTrang(String tinhTrang,int maTK) {
        return gioHangDao.getByTinhTrang(tinhTrang, maTK);
    }

    @Override
    public List<GioHang> searchByMaTK(int MaTK) {
        return searchByMaTK(MaTK);
    }
}
