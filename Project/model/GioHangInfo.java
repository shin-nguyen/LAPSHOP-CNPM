package Model;

public  class  GioHangInfo{

    private  int MaGioHang;
    private   int MaSP;
    private  int SoLuong;

    public  GioHangInfo(int maGioHang,int maSP,int soLuong){
        this.MaGioHang = maGioHang;
        this.MaSP = maSP;
        this.SoLuong = soLuong;
    }

    public void setMaGioHang(int maGioHang) {
        MaGioHang = maGioHang;
    }

    public int getMaGioHang() {
        return MaGioHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
    public void setMaSP(int maSP) {
        MaSP = maSP;
    }


    public int getMaSP() {
        return MaSP;
    }
}