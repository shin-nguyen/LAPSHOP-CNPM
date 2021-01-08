package Dao;

import Model.HopThu;

import java.util.List;

public interface HopThuDao {
    void insert (HopThu hopThu);
    void edit(HopThu hopThu);
    void delete(HopThu hopThu);

    HopThu get(int maHopThu);
    HopThu getByTraLoi(int maHopThu);
    List<HopThu> getTrangThai(String trangThai);

    List<HopThu> getAll();

}
