package Model;

import javax.persistence.*;
import java.util.Objects;

/*
* MaGiaoDich - MaSP - SoLuong
* */
@Entity
@Table (name = "DonNhapInfo")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.donNhap",
                joinColumns = @JoinColumn(name = "MaDonNhap")),
        @AssociationOverride(name = "primaryKey.hangHoa",
                joinColumns = @JoinColumn(name = "MaSP")) })
public  class  DonNhapInfo {

    private int SoLuong;

    private DonNhapInfoId primaryKey = new DonNhapInfoId();

    public DonNhapInfo(){}
    public DonNhapInfo(DonNhap donNhap,HangHoa hangHoa, int soLuong) {
        this.setDonNhap(donNhap);
        this.setHangHoa(hangHoa);
        this.SoLuong = soLuong;
    }

    @EmbeddedId
    public DonNhapInfoId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(DonNhapInfoId primaryKey) {
        this.primaryKey = primaryKey;
    }
    @Transient
    public HangHoa getHangHoa() {
        return getPrimaryKey().getHangHoa();
    }

    public void setHangHoa(HangHoa hangHoa) {
        getPrimaryKey().setHangHoa(hangHoa);
    }

    @Transient
    public DonNhap getDonNhap() {
        return getPrimaryKey().getDonNhap();
    }

    public void setDonNhap(DonNhap donNhap) {
        getPrimaryKey().setDonNhap(donNhap);
    }

    @Column(name = "SoLuong")
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }



    @Override
    public int hashCode() {
        return Objects.hash(getDonNhap().getMaDonNhap(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DonNhapInfo)) return false;
        DonNhapInfo that = (DonNhapInfo) o;
        return Objects.equals(getDonNhap().getMaDonNhap(), that.getDonNhap().getMaDonNhap())&&
                Objects.equals(getHangHoa().getMaSP(), getHangHoa().getMaSP());
    }
}

