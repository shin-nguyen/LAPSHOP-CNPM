package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/*
Hang Hoa -  MaTK - ThoiGian
* */
@Entity
@Table(name = "YeuThich")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.taiKhoan",
                joinColumns = @JoinColumn(name = "MaTK")),
        @AssociationOverride(name = "primaryKey.hangHoa",
                joinColumns = @JoinColumn(name = "MaSP")) })
public  class  YeuThich{
    private Date ThoiGian;
    public YeuThich(){
    }

    public  YeuThich(HangHoa hangHoa,TaiKhoan taiKhoan, Date thoiGian){
        super();
        this.setTaiKhoan(taiKhoan);
        this.setHangHoa(hangHoa);
        this.ThoiGian = thoiGian;
    }
    private YeuThichId primaryKey = new YeuThichId();
    @EmbeddedId
    public YeuThichId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(YeuThichId primaryKey) {
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
    public TaiKhoan getTaiKhoan() {
        return getPrimaryKey().getTaiKhoan();
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        getPrimaryKey().setTaiKhoan(taiKhoan);
    }


    @Column(name = "ThoiGian",nullable = false)
    @Temporal(TemporalType.DATE)
    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;

    }
    public Date getThoiGian() {
        return ThoiGian;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaiKhoan().getMaTK(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YeuThich)) return false;
        YeuThich that = (YeuThich) o;
        return Objects.equals(getTaiKhoan().getMaTK(), that.getTaiKhoan().getMaTK())&&
                Objects.equals(getHangHoa().getMaSP(), getHangHoa().getMaSP());
    }
}