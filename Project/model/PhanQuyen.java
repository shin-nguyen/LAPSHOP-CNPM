package Model;
public  class  PhanQuyen{
    private int MaPQ;
    private  int LoaiQuyen;
    private  String TenPQ;

    public PhanQuyen(int maPQ, int loaiQuyen, String tenPQ)
    {
        this.MaPQ = maPQ;
        this.LoaiQuyen = loaiQuyen;
        this.TenPQ = tenPQ;
    }

    public String getTenPQ() {
        return TenPQ;
    }

    public void setTenPQ(String tenPQ) {
        TenPQ = tenPQ;
    }

    public int getLoaiQuyen() {
        return LoaiQuyen;
    }

    public void setLoaiQuyen(int loaiQuyen) {
        LoaiQuyen = loaiQuyen;
    }

    public int getMaPQ() {
        return MaPQ;
    }

    public void setMaPQ(int maPQ) {
        MaPQ = maPQ;
    }
}