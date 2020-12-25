package Service;

import Model.DonNhap;

import java.util.List;

public interface DonNhapService {
    void insert(DonNhap donNhap);
    void edit(DonNhap donNhap);
    void delete(DonNhap donNhap);
    DonNhap get(int MaGiaoDich);
    List<DonNhap> getAll();
}
