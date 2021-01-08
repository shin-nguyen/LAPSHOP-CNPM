package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GioHangInfoId implements Serializable {
    private  GioHang GioHang;
    private  HangHoa HangHoa;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "maGioHang")
    public GioHang getGioHang() {
        return GioHang;
    }

    public void setGioHang(GioHang gioHang) {
        GioHang = gioHang;
    }

    @ManyToOne()
    @JoinColumn(referencedColumnName = "maSP")
    public HangHoa getHangHoa() {
        return HangHoa;
    }
    public void setHangHoa(HangHoa hangHoa) {
        HangHoa = hangHoa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGioHang().getMaGioHang(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GioHangInfoId)) return false;
        GioHangInfoId that = (GioHangInfoId) o;
        return Objects.equals(getGioHang().getMaGioHang(), that.getGioHang().getMaGioHang())&&
                Objects.equals(getHangHoa().getMaSP(), that.getHangHoa().getMaSP());
    }
}
