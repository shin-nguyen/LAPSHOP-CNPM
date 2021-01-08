package Service;

import Model.TaiKhoan;

import java.util.Date;
import java.util.List;


public interface TaiKhoanService {
	void insert(TaiKhoan taiKhoan);
	public List<TaiKhoan> getTKByPQ(int tenPQ) ;

	void edit(TaiKhoan taiKhoan);

	void delete(TaiKhoan taiKhoan);
	
	TaiKhoan get(int maTK);
	TaiKhoan getTenTK(String tenTK);
	TaiKhoan getTKByEmail(String email);

	TaiKhoan login(String tenTK, String matKhau);
	
	boolean register(String tenTK , String matKhau, String hoTen, Date namSinh , String diaChi , String  email);

	List<TaiKhoan> getAll();
	public boolean registerAdmin(String tenTK , String matKhau, String hoTen, Date namSinh , String diaChi , String  email);
	boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String tenTK);
	
}
