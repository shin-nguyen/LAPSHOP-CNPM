package Model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class DonNhapInfoId  implements Serializable{
    private DonNhap donNhap;
    private HangHoa hangHoa;

    @ManyToOne(cascade = CascadeType.ALL)

    public DonNhap getDonNhap(){
        return  donNhap;
    }

    public void setDonNhap(DonNhap donNhap) {
        this.donNhap = donNhap;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    public HangHoa getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }
}
