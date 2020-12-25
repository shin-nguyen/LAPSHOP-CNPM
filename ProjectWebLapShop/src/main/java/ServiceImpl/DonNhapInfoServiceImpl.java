package ServiceImpl;

import Dao.DonNhapInfoDao;
import DaoImpl.DonNhapInfoDaoImpl;
import Model.DonNhapInfo;
import Service.DonNhapInfoService;

import java.util.List;

public class DonNhapInfoServiceImpl implements DonNhapInfoService {
    DonNhapInfoDao donNhapInfoDao = new DonNhapInfoDaoImpl();

    @Override
    public void edit(DonNhapInfo donNhapInfo) {
        DonNhapInfo donNhapInfoCu = donNhapInfoDao.get(donNhapInfo.getDonNhap().getMaDonNhap(),donNhapInfo.getHangHoa().getMaSP());
        donNhapInfoCu.setSoLuong(donNhapInfo.getSoLuong());

        donNhapInfoDao.edit(donNhapInfoCu);
    }


    @Override
    public void insert(DonNhapInfo donNhapInfo) {
        donNhapInfoDao.insert(donNhapInfo);
    }

    @Override
    public void delete(DonNhapInfo donNhapInfo) {
        donNhapInfoDao.delete(donNhapInfo);
    }

    @Override
    public List<DonNhapInfo> getAll() {
        return donNhapInfoDao.getAll();
    }

    @Override
    public List<DonNhapInfo> getByMaGiaoDich(int maGiaoDich) {
        return donNhapInfoDao.getByMaGiaoDich(maGiaoDich);
    }

    @Override
    public DonNhapInfo get(int maGiaoDich, int maHangHoa) {
        return donNhapInfoDao.get(maGiaoDich, maHangHoa);
    }
}
