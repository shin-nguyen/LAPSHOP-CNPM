package ServiceImpl;

import Dao.DonNhapDao;
import DaoImpl.DonNhapDaoImpl;
import Model.DonNhap;
import Service.DonNhapService;

import java.util.List;

public class DonNhapServiceImpl implements DonNhapService {
    DonNhapDao donNhapDao = new DonNhapDaoImpl();
    @Override
    public void insert(DonNhap donNhap) {
        donNhapDao.insert(donNhap);
    }

    @Override
    public void edit(DonNhap donNhap) {


        donNhapDao.edit(donNhap);
    }

    @Override
    public void delete(DonNhap donNhap) {
        donNhapDao.delete(donNhap);
    }

    @Override
    public DonNhap get(int MaGiaoDich) {
        return donNhapDao.get(MaGiaoDich);
    }

    @Override
    public List<DonNhap> getAll() {
        return donNhapDao.getAll();
    }
}
