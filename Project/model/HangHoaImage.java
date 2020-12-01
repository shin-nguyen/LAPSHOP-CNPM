package Model;
public  class  HangHoaImage {
    private int MaSP;
    private String Image;

    public HangHoaImage(int maSP, String image) {
        this.MaSP = maSP;
        this.Image = image;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public int getMaSP() {
        return MaSP;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}