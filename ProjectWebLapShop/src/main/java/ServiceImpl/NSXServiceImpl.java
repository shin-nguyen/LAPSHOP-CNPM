package ServiceImpl;

import Dao.NSXDao;
import DaoImpl.NSXDaoImpl;
import Model.NSX;
import Service.NSXService;

import java.util.List;

public class NSXServiceImpl implements NSXService {

    NSXDao nsxDao =  new NSXDaoImpl();
    @Override
    public void insert(NSX nsx) {
        nsxDao.insert(nsx);
    }

    @Override
    public void edit(NSX nsx) {


        nsxDao.edit(nsx);
    }

    @Override
    public void delete(NSX nsx) {
        nsxDao.delete(nsx);
    }

    @Override
    public NSX get(int MaNSX) {
        return nsxDao.get(MaNSX);
    }

    @Override
    public NSX getByTenNSX(String TenNSX) {
        return nsxDao.getByTenNSX(TenNSX);
    }

    @Override
    public List<NSX> getAll() {
        return nsxDao.getAll();
    }
}
