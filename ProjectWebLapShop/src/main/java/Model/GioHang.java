package Model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/*
* MaGioHang -  KhuyenMai - TongTien- ThoiGian - PTTT - DiaChi -  TrangThai - TaiKhoan
* */
@Entity
@Table (name = "GioHang")
public  class GioHang {
    private int MaGioHang;
    private KhuyenMai KhuyenMai;
    private int TongTien;
    private Date ThoiGian;
    private String MoTa;
    private String DiaChi;
    private String TrangThai;
    private  TaiKhoan taiKhoan;

    public GioHang(){

    }
    public GioHang(int maGioHang, KhuyenMai khuyenMai, int tongTien, Date thoiGian, String moTa, String diaChi, String trangThai, TaiKhoan taiKhoan){
        super();
        this.MaGioHang = maGioHang;
        this.KhuyenMai =  khuyenMai;
        this.TongTien = tongTien;
        this.ThoiGian = thoiGian;
        this.MoTa = moTa;
        this.DiaChi = diaChi;
        this.TrangThai = trangThai;
        this.taiKhoan =  taiKhoan;
    }

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaKhuyenMai", nullable = true,referencedColumnName = "MaKhuyenMai")
    public KhuyenMai getKhuyenMai() {
        return KhuyenMai;
    }
    public void setKhuyenMai(Model.KhuyenMai khuyenMai) {
        KhuyenMai = khuyenMai;
    }


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaTK", nullable = true, referencedColumnName = "MaTK")
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }
    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }




    @Column (name = "TongTien", nullable = true)
    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public int getTongTien() {
        return TongTien;
    }


    @Column (name = "DiaChi", nullable = true)

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }


    @Column (name = "ThoiGian", nullable = true)
    public Date getThoiGian() {
        return ThoiGian;
    }
    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }


    @Id
    @Column (name = "MaGioHang", nullable = true)
    public int getMaGioHang() {
        return MaGioHang;
    }
    public void setMaGioHang(int maGioHang) {
        MaGioHang = maGioHang;
    }



    @Column (name = "TrangThai", nullable = true)
    public String getTrangThai() {
        return TrangThai;
    }
    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }


    @Column (name = "MoTa", nullable = true)
    public String getMoTa() {
        return MoTa;
    }
    public void setMoTa(String moTa) {
        MoTa = moTa;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getMaGioHang(),getDiaChi(),getKhuyenMai(),getMoTa(),getTaiKhoan().getMaTK(),getThoiGian(),getTongTien(),getTrangThai());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GioHang)) return false;
        GioHang that = (GioHang) o;
        return Objects.equals(getMaGioHang(), that.getMaGioHang())&&
                Objects.equals(getDiaChi(), that.getDiaChi()) &&
                Objects.equals(getMoTa(), that.getMoTa()) &&
                Objects.equals(getKhuyenMai().getMaKhuyenMai(), that.getKhuyenMai().getMaKhuyenMai()) &&
                Objects.equals(getTaiKhoan().getMaTK(), that.getTaiKhoan().getMaTK()) &&
                Objects.equals(getThoiGian(), that.getThoiGian()) &&
                Objects.equals(getTongTien(), that.getTongTien()) &&
                Objects.equals(getTrangThai(), that.getTrangThai());
    }
}