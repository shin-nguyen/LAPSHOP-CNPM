package Model;


import javax.persistence.*;

/*
MaNSX - DiaChi - TenNSX
*/
@Entity
@Table (name = "NSX")
public class NSX {
    private int MaNSX;
    private String DiaChi;
    private String TenNSX;

    public NSX(){}
    public NSX(int maNSX, String diaChi, String tenNSX) {
        this.MaNSX = maNSX;
        this.DiaChi = diaChi;
        this.TenNSX = tenNSX;
    }

    @Column (name ="DiaChi", nullable = false)
    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "MaNSX")
    public int getMaNSX() {
        return MaNSX;
    }
    public void setMaNSX(int maNSX) {
        MaNSX = maNSX;
    }

    @Column(name = "TenNSX", nullable = false)
    public String getTenNSX() {
        return TenNSX;
    }
    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }
}