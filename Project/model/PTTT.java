package Model;


public class PTTT
{
    private int MaPTTT;

    private String TenPTTT;

    public PTTT(int maPTTT, String tenPTTT)
    {
        this.MaPTTT = maPTTT;
        this.TenPTTT = tenPTTT;
    }

    public int getMaPTTT() {
        return MaPTTT;
    }

    public String getTenPTTT() {
        return TenPTTT;
    }

    public void setMaPTTT(int maPTTT) {
        MaPTTT = maPTTT;
    }

    public void setTenPTTT(String tenPTTT) {
        TenPTTT = tenPTTT;
    }
}