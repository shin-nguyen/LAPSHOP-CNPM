package Model;

public  class  Nhap {
    private int MaGiaoDich;
    private int MaSP;
    private int SoLuong;

    public Nhap(int maGiaoDich, int maSP, int soLuong) {
        this.MaGiaoDich = maGiaoDich;
        this.MaSP = maSP;
        this.SoLuong = soLuong;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        MaGiaoDich = maGiaoDich;
    }

    public int getMaGiaoDich() {
        return MaGiaoDich;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }
}

