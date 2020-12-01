package Model;


import java.util.Date;

public  class GioHang {
    private int MaGioHang;
    private int MaKhuyenMai;
    private int TongTien;
    private Date ThoiGian;
    private int MaPTTT;
    private String DiaChi;
    private String TrangThai;

    public  GioHang(int maGioHang, int maKhuyenMai, int tongTien, Date thoiGian, int maPTTT, String diaChi,String trangThai){
        this.MaGioHang = maGioHang;
        this.MaKhuyenMai =  maKhuyenMai;
        this.TongTien = tongTien;
        this.ThoiGian = thoiGian;
        this.MaPTTT = maPTTT;
        this.DiaChi = diaChi;
        this.TrangThai = trangThai;
    }

    public void setMaPTTT(int maPTTT) {
        MaPTTT = maPTTT;
    }

    public int getMaPTTT() {
        return MaPTTT;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public int getTongTien() {
        return TongTien;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public int getMaGioHang() {
        return MaGioHang;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setMaGioHang(int maGioHang) {
        MaGioHang = maGioHang;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        MaKhuyenMai = maKhuyenMai;
    }

    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

}