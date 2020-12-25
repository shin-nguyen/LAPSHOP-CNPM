package Model;

import javax.persistence.*;

@Entity
@Table(name = "HangHoaImage")
public class HangHoaImage {
    private int MaSP ;
    private byte[] HinhBu;
    private byte[] HinhNho;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSP", nullable = false)
    public int getMaSP() {
        return MaSP;
    }
    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    @Lob
    @Column(name = "HinhBu", nullable = true, length = Integer.MAX_VALUE)
    public byte[] getHinhBu() {
        return HinhBu;
    }
    public void setHinhBu(byte[] hinhBu) {
        HinhBu = hinhBu;
    }

    @Lob
    @Column(name = "HinhNho", nullable = true, length = Integer.MAX_VALUE)
    public byte[] getHinhNho() {
        return HinhNho;
    }
    public void setHinhNho(byte[] hinhNho) {
        HinhNho = hinhNho;
    }
}
