package Service;

import Model.HopThu;

import java.util.List;

public interface HopThuService {
    void insert (HopThu hopThu);
    void edit(HopThu hopThu);
    void delete(HopThu hopThu);

    HopThu get(int maHopThu);
    List<HopThu> getTrangThai(String trangThai);
    public HopThu getByTraLoi(int maHopThu);
    List<HopThu> getAll();
}
