package Model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable

public class GioHangInfoId implements Serializable {
    private  GioHang GioHang;
    private  HangHoa HangHoa;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    public Model.GioHang getGioHang() {
        return GioHang;
    }

    public void setGioHang(Model.GioHang gioHang) {
        GioHang = gioHang;
    }

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    public Model.HangHoa getHangHoa() {
        return HangHoa;
    }
    public void setHangHoa(Model.HangHoa hangHoa) {
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
                Objects.equals(getHangHoa().getMaSP(), getHangHoa().getMaSP());
    }
}
