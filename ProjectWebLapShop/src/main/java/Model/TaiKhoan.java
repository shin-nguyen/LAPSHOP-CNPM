package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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

	private  int PhanQuyen;
	private String Email;

	public TaiKhoan(){

	}

	public TaiKhoan(int maTK, String tenTK, String matKhau, int phanQuyen, String hoTen, Date namSinh, String diaChi, String email) {
		super();
		this.MaTK= maTK;
		this.TenTK = tenTK;
		this.MatKhau = matKhau;
		this.HoTen = hoTen;
		this.NamSinh = namSinh;
		this.DiaChi = diaChi;
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

	@Override
	public int hashCode() {
		return Objects.hash(getMaTK());
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TaiKhoan)) return false;
		TaiKhoan that = (TaiKhoan) o;
		return Objects.equals(getMaTK(), that.getMaTK());

	}



}

