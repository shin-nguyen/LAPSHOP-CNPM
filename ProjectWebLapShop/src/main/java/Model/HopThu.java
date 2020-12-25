package Model;

import javax.persistence.*;

@Entity
@Table(name = "hopThu")
public class HopThu {
    private int MaHopThu;
    private String TenNguoiGui;
    private String TieuDe;
    private String NoiDung;
    private String email;
    private String trangThai;

    public HopThu(){}
    public HopThu(int maHopThu, String tenNguoiGui, String tieuDe,String noiDung,String email,String trangThai) {
        this.MaHopThu = maHopThu;
        this.TenNguoiGui = tenNguoiGui;
        this.NoiDung = noiDung;
        this.TieuDe = tieuDe;
        this.email = email;
        this.trangThai = trangThai;
    }
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "MaHopThu")
    public int getMaHopThu() {
        return MaHopThu;
    }

    public void setMaHopThu(int maHopThu) {
        MaHopThu = maHopThu;
    }
    @Column(name = "TenNguoiGui", nullable = false)

    public String getTenNguoiGui() {
        return TenNguoiGui;
    }

    public void setTenNguoiGui(String tenNguoiGui) {
        TenNguoiGui = tenNguoiGui;
    }
    @Column(name = "TieuDe", nullable = false)

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }
    @Column(name = "NoiDung", nullable = false)

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "trangThai", nullable = false)

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
