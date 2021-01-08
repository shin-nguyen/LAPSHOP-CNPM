package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


/*
*MaKhuyenMai - GiaTriKhuyenMai - NgayBatDau - NgayKetThuc
*/
@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {
    private  int MaKhuyenMai;
    private int GiaTriKhuyenMai;
    private Date NgayBatDau;
    private  Date NgayKetThuc;

    public  KhuyenMai(){
    }
    public KhuyenMai(int maKhuyenMai, int giaTriKhuyenMai, Date ngayBatDau, Date ngayKetThuc){
        super();
        this.MaKhuyenMai = maKhuyenMai;
        this.GiaTriKhuyenMai = giaTriKhuyenMai;
        this.NgayBatDau = ngayBatDau;
        this.NgayKetThuc = ngayKetThuc;
    }
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "MaKhuyenMai")
    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }
    public void setMaKhuyenMai(int maKhuyenMai) {
        MaKhuyenMai = maKhuyenMai;
    }


    @Column(name = "NgayBatDau", nullable = false)

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    @Column(name = "GiaTriKhuyenMai", nullable = false)
    public int getGiaTriKhuyenMai() {
        return GiaTriKhuyenMai;
    }

    @Column(name = "NgayKetThuc", nullable = false)
    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setGiaTriKhuyenMai(int giaTriKhuyenMai) {
        GiaTriKhuyenMai = giaTriKhuyenMai;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        NgayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        NgayKetThuc = ngayKetThuc;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMaKhuyenMai());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KhuyenMai)) return false;
        KhuyenMai that = (KhuyenMai) o;
        return Objects.equals(getMaKhuyenMai(), that.getMaKhuyenMai());
    }

}
