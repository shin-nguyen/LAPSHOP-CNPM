package Model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable

public class YeuThichId implements Serializable {
    private TaiKhoan taiKhoan;
    private HangHoa hangHoa;
    @ManyToOne(fetch = FetchType.EAGER)

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    @ManyToOne(fetch = FetchType.EAGER)

    public HangHoa getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaiKhoan().getMaTK(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YeuThichId)) return false;
        YeuThichId that = (YeuThichId) o;
        return Objects.equals(getTaiKhoan().getMaTK(), that.getTaiKhoan().getMaTK())&&
                Objects.equals(getHangHoa().getMaSP(), getHangHoa().getMaSP());
    }



}
