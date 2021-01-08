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
    private int TrangThai;
    private  TaiKhoan taiKhoan;

    public GioHang(){

    }
    public GioHang(int maGioHang, KhuyenMai khuyenMai, int tongTien, Date thoiGian, String moTa, String diaChi, int trangThai, TaiKhoan taiKhoan){
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MaKhuyenMai", nullable = true,referencedColumnName = "MaKhuyenMai")
    public KhuyenMai getKhuyenMai() {
        return KhuyenMai;
    }
    public void setKhuyenMai(Model.KhuyenMai khuyenMai) {
        KhuyenMai = khuyenMai;
    }


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaTK", nullable = false, referencedColumnName = "MaTK")
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }
    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }


    @Column (name = "TongTien", nullable = false)
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


    @Column (name = "ThoiGian", nullable = false)
    public Date getThoiGian() {
        return ThoiGian;
    }
    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "MaGioHang", nullable = false)
    public int getMaGioHang() {
        return MaGioHang;
    }
    public void setMaGioHang(int maGioHang) {
        MaGioHang = maGioHang;
    }



    @Column (name = "trangThai", nullable = false)
    public int getTrangThai() {
        return TrangThai;
    }
    public void setTrangThai(int trangThai) {
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
        return Objects.hash(getMaGioHang());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GioHang)) return false;
        GioHang that = (GioHang) o;
        return Objects.equals(getMaGioHang(), that.getMaGioHang());
    }
}