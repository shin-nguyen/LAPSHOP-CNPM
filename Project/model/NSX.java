package Model;
public  class  NSX{
    private int MaNSX;
    private  String DiaChi;
    private  String TenNSX;

    public NSX(int maNSX, String diaChi, String tenNSX)
    {
        this.MaNSX = maNSX;
        this.DiaChi = diaChi;
        this.TenNSX = tenNSX;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public int getMaNSX() {
        return MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setMaNSX(int maNSX) {
        MaNSX = maNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }
}