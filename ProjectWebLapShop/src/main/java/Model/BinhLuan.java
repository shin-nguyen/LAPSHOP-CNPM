package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/*
* Tong Quan: MaSP - TaiKhoan - Tieu De - Noi Dung - Sao - Thoi Gian
* */
@Entity
@Table (name = "BinhLuan")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.taiKhoan",
                joinColumns = @JoinColumn(name = "MaTK")),
        @AssociationOverride(name = "primaryKey.hangHoa",
                joinColumns = @JoinColumn(name = "MaSP")),

})
public  class BinhLuan {
    private  String TieuDe;
    private  String NoiDung;
    private  int Sao;
    private Date ThoiGian;

    private BinhLuanId primaryKey = new BinhLuanId();
    public BinhLuan(){
    }

    public BinhLuan(HangHoa hangHoa, TaiKhoan taiKhoan, String tieuDe, String noiDung, int sao, Date thoiGian){
        super();
        this.setTaiKhoan(taiKhoan);
        this.setHangHoa(hangHoa);
        this.TieuDe = tieuDe;
        this.NoiDung = noiDung;
        this.Sao = sao;
        this.ThoiGian= thoiGian;
    }
    @Column (name = "Sao", nullable = false)
    public int getSao() {
        return Sao;
    }
    public void setSao(int sao) {
        Sao = sao;
    }

    @Column (name = "NoiDung", nullable = false)
    public String getNoiDung() {
        return NoiDung;
    }
    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    @Column (name = "TieuDe", nullable = false)
    public String getTieuDe() {
        return TieuDe;
    }
    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }


    @Column(name = "thoiGian",nullable = false)
    @Temporal(TemporalType.DATE)
    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        ThoiGian = thoiGian;
    }

    @EmbeddedId
    public BinhLuanId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(BinhLuanId primaryKey) {
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

    public int hashCode() {
        return Objects.hash(getTaiKhoan().getMaTK(), getHangHoa().getMaSP());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinhLuanId)) return false;
        BinhLuanId that = (BinhLuanId) o;
        return Objects.equals(getTaiKhoan().getMaTK(), that.getTaiKhoan().getMaTK())&&
                Objects.equals(getHangHoa().getMaSP(), that.getHangHoa().getMaSP());
    }
}