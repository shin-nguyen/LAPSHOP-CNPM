package Model;

import javax.persistence.*;
import java.util.Base64;

@Entity
@Table(name = "HangHoaImage")
public class HangHoaImage {
    private int MaSP ;
    private int MaHinh;
    private byte[] HinhBu;
    private byte[] HinhNho;

    private String base64HinhBu;
    private String base64HinhNho;

    @Column(name = "MaSP", nullable = false)
    @JoinColumn(name = "MaSP", nullable = false,referencedColumnName = "MaSP"	)
    public int getMaSP() {
        return MaSP;
    }
    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    @Column(name = "HinhBu", nullable = true )
    public byte[] getHinhBu() {
        return HinhBu;
    }
    public void setHinhBu(byte[] hinhBu) {
        HinhBu = hinhBu;
    }


    @Column(name = "HinhNho", nullable = true)
    public byte[] getHinhNho() {
        return HinhNho;
    }
    public void setHinhNho(byte[] hinhNho) {
        HinhNho = hinhNho;
    }


    @Transient
    public String getBase64HinhBu() {
        base64HinhBu = Base64.getEncoder().encodeToString(this.HinhBu);
        return base64HinhBu;
    }

    public void setBase64HinhBu(String base64HinhBu) {
        this.base64HinhBu = base64HinhBu;
    }

    @Transient
    public String getBase64HinhNho() {
        base64HinhNho = Base64.getEncoder().encodeToString(this.HinhNho);
        return base64HinhNho;
    }

    public void setBase64HinhNho(String base64HinhNho) {
        this.base64HinhNho = base64HinhNho;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHinh", nullable = false)
    public int getMaHinh() {
        return MaHinh;
    }

    public void setMaHinh(int thu) {
        MaHinh = thu;
    }
}
