package ServiceImpl;

import Dao.BinhLuanDao;
import DaoImpl.BinhLuanDaoImpl;
import Model.BinhLuan;
import Service.BinhLuanService;

import java.util.List;

public class BinhLuanServiceImpl implements BinhLuanService {
    BinhLuanDao binhLuanDao = new BinhLuanDaoImpl();
    @Override
    public void insert(BinhLuan binhLuan) {
        binhLuanDao.insert(binhLuan);
    }

    @Override
    public void edit(BinhLuan binhLuan) {


        binhLuanDao.edit(binhLuan);
    }

    @Override
    public void delete(BinhLuan binhLuan) {
        binhLuanDao.delete(binhLuan);
    }

    @Override
    public List<BinhLuan> getByMaTK(int maTK) {
       return binhLuanDao.getByMaTK(maTK);
    }



    @Override
    public List<BinhLuan> getAll() {
        return  binhLuanDao.getAll();
    }

    @Override
    public Boolean checkTonTai(BinhLuan binhLuan) {
        return binhLuanDao.checkTonTai(binhLuan);
    }

    @Override
    public Integer getCountBLByMaSP(int MaSP) {
        return binhLuanDao.getCountBLByMaSP(MaSP);
    }

    @Override
    public BinhLuan getByMaSPVSMaTK(int maSP, int maTK) {
        return binhLuanDao.getByMaSPVSMaTK(maSP,maTK);
    }



    @Override
    public List<BinhLuan> getByMaSP(int id) {
        return binhLuanDao.getByMaSP(id);
    }
}
