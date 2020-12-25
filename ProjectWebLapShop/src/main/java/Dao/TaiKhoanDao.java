package Dao;

import Model.TaiKhoan;

import java.util.List;

public interface TaiKhoanDao {

    void insert(TaiKhoan taiKhoan);

    void edit(TaiKhoan taiKhoan);

    void delete(TaiKhoan taiKhoan);

    TaiKhoan get(int MaTK);
    TaiKhoan getTenTK(String tenTK);

    List<TaiKhoan> getAll();



    boolean checkExistEmail(String email);

    boolean checkExistUsername(String tenTK);
}
