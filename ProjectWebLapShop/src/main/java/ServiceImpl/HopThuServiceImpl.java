package ServiceImpl;

import Dao.HopThuDao;
import DaoImpl.HopThuDaoImpl;
import Model.HopThu;
import Service.HopThuService;

import java.util.List;

public class HopThuServiceImpl implements HopThuService {
    HopThuDao hopThuDao = new HopThuDaoImpl();
    @Override
    public void insert(HopThu hopThu) {
        hopThuDao.insert(hopThu);
    }

    @Override
    public void edit(HopThu hopThu) {
        hopThuDao.edit(hopThu);

    }

    @Override
    public void delete(HopThu hopThu) {
        hopThuDao.delete(hopThu);

    }

    @Override
    public HopThu get(int maHopThu) {
        return  hopThuDao.get(maHopThu);

    }

    @Override
    public List<HopThu> getTrangThai(String trangThai) {
        return  hopThuDao.getTrangThai(trangThai);
    }

    @Override
    public HopThu getByTraLoi(int maHopThu) {
        return hopThuDao.getByTraLoi(maHopThu);
    }

    @Override
    public List<HopThu> getAll() {
        return hopThuDao.getAll();
    }
}
