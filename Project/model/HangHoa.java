package Model;

public class HangHoa {
	private int MaSP;
	private  int MaNSX;
	private String TenSP;
	private int GiaBan;
	private int GiaGoc;
	private int SoLuong;
	private String CPU;
	private String RAM;
	private String OCung;
	private String ManHinh;
	private String PIN;

	public HangHoa() {
	}

	public HangHoa(int maSP, int maNSX, String tenSP, int giaBan, int giaGoc, int soLuong,
			String cPU, String rAM, String oCung, String manHinh,String pIN) {
		super();
		this.MaSP = maSP;
		this.MaNSX = maNSX;
		this.TenSP = tenSP;
		this.GiaBan = giaBan;
		this.GiaGoc = giaGoc;
		this.SoLuong = soLuong;
		this.CPU = cPU;
		this.RAM = rAM;
		this.OCung = oCung;
		this.ManHinh = manHinh;
		this.PIN = pIN;
	}

	public void setMaNSX(int maNSX) {
		MaNSX = maNSX;
	}

	public int getMaNSX() {
		return MaNSX;
	}

	public int getGiaBan() {
		return GiaBan;
	}

	public int getGiaGoc() {
		return GiaGoc;
	}

	public int getMaSP() {
		return MaSP;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public String getCPU() {
		return CPU;
	}

	public String getManHinh() {
		return ManHinh;
	}

	public String getOCung() {
		return OCung;
	}

	public String getPIN() {
		return PIN;
	}

	public String getRAM() {
		return RAM;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}

	public void setGiaGoc(int giaGoc) {
		GiaGoc = giaGoc;
	}

	public void setManHinh(String manHinh) {
		ManHinh = manHinh;
	}

	public void setMaSP(int maSP) {
		MaSP = maSP;
	}

	public void setOCung(String OCung) {
		this.OCung = OCung;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}

	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
}
