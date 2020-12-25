package Service;

import Model.TaiKhoan;

import java.util.Date;
import java.util.List;


public interface TaiKhoanService {
	void insert(TaiKhoan taiKhoan);

	void edit(TaiKhoan taiKhoan);

	void delete(TaiKhoan taiKhoan);
	
	TaiKhoan get(int maTK);
	TaiKhoan getTenTK(String tenTK);
	
	TaiKhoan login(String tenTK, String matKhau);
	
	boolean register(String tenTK , String matKhau, String hoTen, Date namSinh , String diaChi , String  email);

	List<TaiKhoan> getAll();
	
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String tenTK);
	
}
