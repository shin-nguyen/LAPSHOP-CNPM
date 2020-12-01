package Model;

import java.util.Date;

public class DonNhap {
    private int MaGiaoDich;

    private int TongTien;

    private Date NgayGiaoDich;

    private String ViTriKho;

    public DonNhap(int maGiaoDich, int tongTien, Date ngayGiaoDich, String viTriKho) {
        this.MaGiaoDich = maGiaoDich;
        this.TongTien = tongTien;
        this.NgayGiaoDich = ngayGiaoDich;
        this.ViTriKho = viTriKho;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public int getMaGiaoDich() {
        return MaGiaoDich;
    }

    public int getTongTien() {
        return TongTien;
    }

    public String getViTriKho() {
        return ViTriKho;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        MaGiaoDich = maGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public void setViTriKho(String viTriKho) {
        ViTriKho = viTriKho;
    }
}