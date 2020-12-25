package Model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BinhLuanId  implements Serializable {
    private  HangHoa HangHoa;
    private  TaiKhoan TaiKhoan;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    public HangHoa getHangHoa() {
        return HangHoa;
    }
    public void setHangHoa(HangHoa hangHoa) {
        this.HangHoa = hangHoa;
    }

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    public TaiKhoan getTaiKhoan() {
        return TaiKhoan;
    }
    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.TaiKhoan = taiKhoan;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getTaiKhoan().getMaTK(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinhLuanId)) return false;
        BinhLuanId that = (BinhLuanId) o;
        return Objects.equals(getTaiKhoan().getMaTK(), that.getTaiKhoan().getMaTK())&&
                Objects.equals(getHangHoa().getMaSP(), getHangHoa().getMaSP());
    }


}
