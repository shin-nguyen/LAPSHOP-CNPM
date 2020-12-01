package Model;

import java.util.Date;

public  class  YeuThich{
    private  int MaSP;
    private  int MaTK;
    private Date ThoiGian;
    public  YeuThich(int maSP,int maTK, Date thoiGian){
        this.MaSP = maSP;
        this.MaTK = maTK;
        this.ThoiGian =    thoiGian;
    }

    public int getMaTK() {
        return MaTK;
    }

    public void setMaTK(int maTK) {
        MaTK = maTK;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;

    }

    public Date getThoiGian() {
        return ThoiGian;
    }
}