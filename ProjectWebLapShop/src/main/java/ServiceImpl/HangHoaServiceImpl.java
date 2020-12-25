package ServiceImpl;

import Dao.HangHoaDao;
import DaoImpl.HangHoaDaoImpl;
import Model.HangHoa;
import Service.HangHoaService;

import java.util.List;

public class HangHoaServiceImpl implements HangHoaService {
    HangHoaDao hangHoaDao =  new HangHoaDaoImpl();
    @Override
    public void insert(HangHoa hangHoa) {
        hangHoaDao.insert(hangHoa);
    }

    @Override
    public void edit(HangHoa hangHoa) {
        HangHoa hangHoaCu = hangHoaDao.get(hangHoa.getMaSP());
        if (hangHoa.getRAM()!=null){
            hangHoaCu.setRAM(hangHoa.getRAM());
        }
        if (hangHoa.getCPU()!=null){
            hangHoaCu.setCPU(hangHoa.getCPU());
        }
        if (hangHoa.getGiaBan()!=0){
            hangHoaCu.setGiaBan(hangHoa.getGiaBan());
        }
        hangHoaDao.edit(hangHoa);
    }

    @Override
    public void delete(HangHoa hangHoa) {
        hangHoaDao.delete(hangHoa);
    }

    @Override
    public HangHoa get(int id) {
        return hangHoaDao.get(id);
    }

    @Override
    public List<HangHoa> getAll() {
        return hangHoaDao.getAll();
    }

    @Override
    public List<HangHoa> timKiemBangTen(String tenHangHoa) {
        return hangHoaDao.timKiemBangTen(tenHangHoa);
    }
}
