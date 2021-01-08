package Model;

import javax.persistence.*;
import java.util.Date;

/*
* DonNhap MaGiaoDich - ViTriKho - ngayGiaoDich
* */
@Entity
@Table(name = "DonNhap")
public class DonNhap {
    private int MaDonNhap;
    private Date ThoiGian;
    private  TaiKhoan TaiKhoan;
    private  int SoLuong;
    private HangHoa HangHoa;

    public  DonNhap(){

    }

    public DonNhap(int maDonNhap, Date thoiGian, int soLuong,HangHoa hangHoa, TaiKhoan taiKhoan) {
        super();
        this.MaDonNhap = maDonNhap;
        this.ThoiGian = thoiGian;
        this.TaiKhoan =  taiKhoan;
        this.HangHoa = hangHoa;
        this.SoLuong = soLuong;
    }
    @Column(name = "ThoiGian",nullable = false)
    @Temporal(TemporalType.DATE)
    public Date getThoiGian() {
        return ThoiGian;
    }
    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "MaDonNhap", nullable = false)
    public int getMaDonNhap() {
        return MaDonNhap;
    }
    public void setMaDonNhap(int maDonNhap) {
        MaDonNhap = maDonNhap;
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MaTK", nullable = false,referencedColumnName = "MaTK")
    public Model.TaiKhoan getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(Model.TaiKhoan taiKhoan) {
        TaiKhoan = taiKhoan;
    }

    @Column (name = "SoLuong", nullable = false)
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MaSP", nullable = false,referencedColumnName = "MaSP")
    public Model.HangHoa getHangHoa() {
        return HangHoa;
    }

    public void setHangHoa(Model.HangHoa hangHoa) {
        HangHoa = hangHoa;
    }
}