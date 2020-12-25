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

    private Date NgayGiaoDich;

    private String ViTri;

    public  DonNhap(){

    }

    public DonNhap(int maDonNhap, Date ngayGiaoDich, String viTriKho) {
        super();
        this.MaDonNhap = maDonNhap;
        this.NgayGiaoDich = ngayGiaoDich;
        this.ViTri = viTriKho;
    }
    @Column(name = "NgayGiaoDich")
    @Temporal(TemporalType.DATE)
    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }
    @Id
    @Column (name = "MaDonNhap", nullable = false)
    public int getMaDonNhap() {
        return MaDonNhap;
    }

    @Column(name = "ViTri", nullable = false)
    public String getViTriKho() {
        return ViTri;
    }

    public void setMaDonNhap(int maDonNhap) {
        MaDonNhap = maDonNhap;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }


    public void setViTriKho(String viTri) {
        ViTri = viTri;
    }
}