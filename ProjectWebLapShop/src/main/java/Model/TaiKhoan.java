package Model;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/*
* MaTK TenTK MatKhau HoTen NamSinh DiaChi Chan MaPQ Email
*
* */

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
	private int MaTK;
	private String TenTK;
	private String MatKhau;
	private String HoTen;
	private Date NamSinh;
	private String DiaChi;
	private int Chan;
	private  int PhanQuyen;
	private String Email;

	public TaiKhoan(){

	}

	public TaiKhoan(int maTK, String tenTK, String matKhau, int phanQuyen, String hoTen, Date namSinh, String diaChi, String email, int chan) {
		super();
		this.MaTK= maTK;
		this.TenTK = tenTK;
		this.MatKhau = matKhau;
		this.HoTen = hoTen;
		this.NamSinh = namSinh;
		this.DiaChi = diaChi;
		this.Chan = chan;
		this.PhanQuyen = phanQuyen;
		this.Email = email;
	}

	@Column(name = "phanQuyen", nullable = false)
	public int getPhanQuyen() {
		return PhanQuyen;
	}
	public void setPhanQuyen(int phanQuyen) {
		PhanQuyen = phanQuyen;
	}


	@Column(name = "Email", nullable = false)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	@Column(name = "NamSinh", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(Date namSinh) {
		NamSinh = namSinh;
	}


	@Column(name = "Chan", nullable = false)
	public int getChan() {
		return Chan;
	}
	public void setChan(int chan) {
		Chan = chan;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MaTK")
	public int getMaTK() {
		return MaTK;
	}
	public void setMaTK(int maTK) {
		MaTK = maTK;
	}



	@Column(name = "HoTen", nullable = false)
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	@Column(name = "MatKhau", nullable = false)
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}


	@Column(name = "DiaChi", nullable = false)
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}


	@Column(name = "TenTK", nullable = false)
	public void setTenTK(String tenTK) {
		TenTK = tenTK;
	}
	public String getTenTK() {
		return TenTK;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//
//		TaiKhoan that = (TaiKhoan) o;
//
//		if (MaTK != that.MaTK) return false;
//		if (TenTK != null ? !TenTK.equals(that.TenTK) : that.TenTK != null) return false;
//		if (MatKhau != null ? !MatKhau.equals(that.MatKhau) : that.MatKhau != null) return false;
////		if (maPq != null ? !maPq.equals(that.maPq) : that.maPq != null) return false;
//		if (HoTen != null ? !HoTen.equals(that.HoTen) : that.HoTen != null) return false;
//		if (NamSinh != null ? !NamSinh.equals(that.NamSinh) : that.NamSinh != null) return false;
//		if (DiaChi != null ? !DiaChi.equals(that.DiaChi) : that.DiaChi != null) return false;
//		if (Email != null ? !Email.equals(that.Email) : that.Email != null) return false;
//		if (Chan != null ? !Chan.equals(that.Chan) : that.Chan != null) return false;
//
//		return true;
//	}
//
//	@Override
//	public int hashCode() {
//		int result = MaTK;
//		result = 31 * result + (TenTK != null ? TenTK.hashCode() : 0);
//		result = 31 * result + (MatKhau != null ? MatKhau.hashCode() : 0);
////		result = 31 * result + (maPq != null ? maPq.hashCode() : 0);
//		result = 31 * result + (HoTen != null ? HoTen.hashCode() : 0);
//		result = 31 * result + (NamSinh != null ? NamSinh.hashCode() : 0);
//		result = 31 * result + (DiaChi != null ? DiaChi.hashCode() : 0);
//		result = 31 * result + (Email != null ? Email.hashCode() : 0);
//		result = 31 * result + (Chan != null ? Chan.hashCode() : 0);
//		return result;
//	}



}

