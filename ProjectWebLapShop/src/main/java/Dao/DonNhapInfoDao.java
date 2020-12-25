package Dao;



import Model.DonNhapInfo;

import java.util.List;

public interface DonNhapInfoDao {
    void insert(DonNhapInfo donNhapInfo);

    void edit(DonNhapInfo donNhapInfo);

    void delete(DonNhapInfo donNhapInfo);
//    void deleteAll(int maDonNhap);
    DonNhapInfo get(int maDonNhap,int maHangHoa);
    List<DonNhapInfo> getAll();

    List<DonNhapInfo> getByMaGiaoDich(int maDonNhap);
}
