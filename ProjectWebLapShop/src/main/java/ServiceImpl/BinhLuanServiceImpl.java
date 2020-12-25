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
        BinhLuan binhLuanCu = binhLuanDao.getByMaSPVSMaTK(binhLuan.getHangHoa().getMaSP(), binhLuan.getTaiKhoan().getMaTK());

        binhLuanCu.setThoiGian(binhLuan.getThoiGian());
        binhLuanCu.setSao(binhLuan.getSao());
        binhLuanCu.setTieuDe(binhLuan.getTieuDe());
        binhLuanCu.setNoiDung(binhLuan.getNoiDung());

        binhLuanDao.edit(binhLuanCu);
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
    public BinhLuan getByMaSPVSMaTK(int maSP, int maTK) {
        return binhLuanDao.getByMaSPVSMaTK(maSP,maTK);
    }



    @Override
    public List<BinhLuan> getByMaSP(int id) {
        return binhLuanDao.getByMaSP(id);
    }
}
