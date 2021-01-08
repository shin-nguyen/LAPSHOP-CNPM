package ServiceImpl;

import Dao.GioHangInfoDao;
import DaoImpl.GioHangInfoDaoImpl;
import Model.GioHangInfo;
import Service.GioHangInfoService;

import java.util.List;

public class GioHangInfoServiceImpl implements GioHangInfoService {
    GioHangInfoDao gioHangInfoDao = new GioHangInfoDaoImpl();
    @Override
    public void insert(GioHangInfo gioHangInfo) {
        gioHangInfoDao.insert(gioHangInfo);
    }

    @Override
    public void edit(GioHangInfo gioHangInfo) {
        gioHangInfoDao.edit(gioHangInfo);
    }

    @Override
    public void delete(GioHangInfo gioHangInfo) {
        gioHangInfoDao.delete(gioHangInfo);
    }


    @Override
    public GioHangInfo get(int MaGioHang, int MaSP) {
        return gioHangInfoDao.get(MaGioHang,MaSP);
    }

    @Override
    public List<GioHangInfo> get(int MaGioHang) {
        return gioHangInfoDao.get(MaGioHang);
    }

    @Override
    public Boolean checkTonTaiSP(int MaSP, int MaTK) {
        return gioHangInfoDao.checkTonTaiSP(MaSP,MaTK);
    }


}
