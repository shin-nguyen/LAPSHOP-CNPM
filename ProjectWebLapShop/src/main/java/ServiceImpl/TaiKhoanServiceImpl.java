package ServiceImpl;

import Dao.HopThuDao;
import Dao.TaiKhoanDao;
import DaoImpl.HopThuDaoImpl;
import DaoImpl.TaiKhoanDaoImpl;
import Model.TaiKhoan;
import Service.TaiKhoanService;

import java.util.Date;
import java.util.List;

public class TaiKhoanServiceImpl implements TaiKhoanService {
    TaiKhoanDao taiKhoanDao =  new TaiKhoanDaoImpl();
    HopThuDao phanQuyenDao = new HopThuDaoImpl();
    @Override
    public void insert(TaiKhoan taiKhoan) {
        taiKhoanDao.insert(taiKhoan);
    }

    @Override
    public void edit(TaiKhoan taiKhoan) {

        TaiKhoan taiKhoanCu = taiKhoanDao.get(taiKhoan.getMaTK());

        taiKhoanCu.setMatKhau(taiKhoan.getMatKhau());
        taiKhoanCu.setDiaChi(taiKhoan.getDiaChi());
        taiKhoanCu.setEmail(taiKhoan.getEmail());
        taiKhoanCu.setHoTen(taiKhoan.getHoTen());
        taiKhoanCu.setNamSinh(taiKhoan.getNamSinh());

        taiKhoanDao.edit(taiKhoan);
    }

    @Override
    public void delete(TaiKhoan taiKhoan) {
        taiKhoanDao.delete(taiKhoan);
    }


    @Override
    public TaiKhoan get(int id) {
        return taiKhoanDao.get(id);
    }

    @Override
    public TaiKhoan getTenTK(String tenTK) {
        return taiKhoanDao.getTenTK(tenTK);
    }

    @Override
    public TaiKhoan login(String tenTK, String matKhau) {
        TaiKhoan taiKhoan = taiKhoanDao.getTenTK(tenTK);
        if (taiKhoan != null && taiKhoan.getMatKhau().equals(matKhau)) {
            return taiKhoan;
        }

        return null;
    }

    @Override
    public boolean register(String tenTK , String matKhau, String hoTen, Date namSinh , String diaChi , String  email) {
        if (taiKhoanDao.checkExistUsername(tenTK)) {
            return false;
        }

        taiKhoanDao.insert(new TaiKhoan(0,tenTK, matKhau,1,hoTen,namSinh,diaChi,email,0));
        return true;
    }

    @Override
    public List<TaiKhoan> getAll() {
        return taiKhoanDao.getAll();
    }




    @Override
    public boolean checkExistEmail(String email) {
        return taiKhoanDao.checkExistEmail(email);
    }

    @Override
    public boolean checkExistUsername(String tenTK) {
        return taiKhoanDao.checkExistUsername(tenTK);
    }
}
