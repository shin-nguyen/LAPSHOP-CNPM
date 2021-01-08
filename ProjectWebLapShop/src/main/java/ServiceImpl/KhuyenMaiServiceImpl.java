package ServiceImpl;

import Dao.KhuyenMaiDao;
import DaoImpl.KhuyenMaiDaoImpl;
import Model.KhuyenMai;
import Service.KhuyenMaiService;

import java.util.List;

public class KhuyenMaiServiceImpl  implements KhuyenMaiService {
    KhuyenMaiDao  khuyenMaiDao = new KhuyenMaiDaoImpl();
    @Override
    public void insert(KhuyenMai khuyenMai) {
        khuyenMaiDao.insert(khuyenMai);
    }

    @Override
    public void edit(KhuyenMai khuyenMai) {

        khuyenMaiDao.edit(khuyenMai);
    }

    @Override
    public void delete(KhuyenMai khuyenMai) {
        khuyenMaiDao.delete(khuyenMai);
    }

    @Override
    public KhuyenMai get(int id) {
        return khuyenMaiDao.get(id);
    }

    @Override
    public List<KhuyenMai> getAll() {
        return khuyenMaiDao.getAll();
    }

    @Override
    public KhuyenMai getByMaKMVaDay(int MaKhuyenMai) {
        return khuyenMaiDao.getByMaKMVaDay(MaKhuyenMai);
    }

    @Override
    public List<KhuyenMai> getByDay() {
        return khuyenMaiDao.getByDay();
    }
}
