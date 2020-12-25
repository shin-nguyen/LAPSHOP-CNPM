package ServiceImpl;

import Dao.DonNhapDao;
import DaoImpl.DonNhapDaoImpl;
import Model.DonNhap;

import java.util.List;

public class DonNhapService implements Service.DonNhapService {
    DonNhapDao donNhapDao = new DonNhapDaoImpl();
    @Override
    public void insert(DonNhap donNhap) {
        donNhapDao.insert(donNhap);
    }

    @Override
    public void edit(DonNhap donNhap) {
        DonNhap donNhapCu = donNhapDao.get(donNhap.getMaDonNhap());

        donNhapCu.setNgayGiaoDich(donNhap.getNgayGiaoDich());
        donNhapCu.setViTriKho(donNhap.getViTriKho());

        donNhapDao.edit(donNhapCu);
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
