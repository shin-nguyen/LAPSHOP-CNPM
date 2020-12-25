package Service;

import Model.BinhLuan;

import java.util.List;

public interface BinhLuanService {
    void insert (BinhLuan binhLuan);
    void edit(BinhLuan binhLuan);
    void delete(BinhLuan binhLuan);
    List<BinhLuan> getByMaTK(int maTK);
    List<BinhLuan> getByMaSP(int maSP);
    List<BinhLuan> getAll();
    BinhLuan getByMaSPVSMaTK(int maSP,int maTK);
}
