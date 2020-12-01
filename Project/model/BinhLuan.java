package Model;

public  class  BinhLuan{

    private  int MaSP;
    private  int MaTK;
    private  String TieuDe;
    private  String NoiDung;
    private  int Sao;
    private  int LanMua;

    public  BinhLuan(int maSP,int maTK,String tieuDe, String noiDung,int sao,int lanMua){
        this.MaSP = maSP;
        this.MaTK = maTK;
        this.TieuDe = tieuDe;
        this.NoiDung = noiDung;
        this.Sao = sao;
        this.LanMua = lanMua;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public void setMaTK(int maTK) {
        MaTK = maTK;
    }

    public int getMaTK() {
        return MaTK;
    }

    public int getLanMua() {
        return LanMua;
    }

    public int getSao() {
        return Sao;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setLanMua(int lanMua) {
        LanMua = lanMua;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public void setSao(int sao) {
        Sao = sao;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

}