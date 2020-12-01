package Model;

import java.util.Date;

public class TaiKhoan {
	private int MaTK;
	private String TenTK;
	private String MatKhau;
	private String HoTen;
	private Date NamSinh;
	private String DiaChi;
	private String Chan;
	private  int MaPQ;

	public TaiKhoan(int maTK, String tenTK, String matKhau, String hoTen, Date namSinh, String diaChi, String chan,int maPQ) {
		super();
		this.MaTK= maTK;
		this.TenTK = tenTK;
		this.MatKhau = matKhau;
		this.HoTen = hoTen;
		this.NamSinh = namSinh;
		this.DiaChi = diaChi;
		this.Chan = chan;
		this.MaPQ = maPQ;
	}

	public Date getNamSinh() {
		return NamSinh;
	}

	public void setMaPQ(int maPQ) {
		MaPQ = maPQ;
	}

	public void setChan(String chan) {
		Chan = chan;
	}

	public int getMaTK() {
		return MaTK;
	}

	public int getMaPQ() {
		return MaPQ;
	}

	public String getChan() {
		return Chan;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public String getHoTen() {
		return HoTen;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public String getTenTK() {
		return TenTK;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public void setMaTK(int maTK) {
		MaTK = maTK;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public void setNamSinh(Date namSinh) {
		NamSinh = namSinh;
	}

	public void setTenTK(String tenTK) {
		TenTK = tenTK;
	}

}

