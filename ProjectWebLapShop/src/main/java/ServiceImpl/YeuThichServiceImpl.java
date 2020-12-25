package ServiceImpl;

import Dao.YeuThichDao;
import DaoImpl.YeuThichDaoImpl;
import Model.YeuThich;
import Service.YeuThichService;

import java.util.List;

public class YeuThichServiceImpl  implements YeuThichService {

    YeuThichDao yeuThichDao =  new YeuThichDaoImpl();

    @Override
    public void insert(YeuThich yeuThich) {
        yeuThichDao.insert(yeuThich);
    }

    @Override
    public void delete(YeuThich yeuThich) {
        yeuThichDao.delete(yeuThich);
    }

    @Override
    public List<YeuThich> getAll() {
        return yeuThichDao.getAll();
    }

    @Override
    public List<YeuThich> getByMaTK(int id) {
        return yeuThichDao.getByMaTK(id);
    }
}
