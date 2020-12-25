create database WebBanLaptop;
use WebBanLaptop;


CREATE TABLE TaiKhoan
(
    MaTK INT AUTO_INCREMENT PRIMARY KEY,
    TenTK NVARCHAR(50) UNIQUE NOT NULL,
    MatKhau NVARCHAR(50) NOT NULL,
    phanQuyen NVARCHAR(50) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
    NamSinh DATE NULL,
    DiaChi NVARCHAR(200) NULL,
    Email nvarchar(200) NUll,
    Chan Int  NOT NULL
);

CREATE TABLE NSX
(
    MaNSX INT AUTO_INCREMENT PRIMARY KEY,
    TenNSX NVARCHAR(50) NOT NULL,
    DiaChi NVARCHAR(200) NOT NULL
);
CREATE TABLE HangHoa
(
    MaSP INT AUTO_INCREMENT PRIMARY KEY,
    MaNSX INT,
    TenSP NVARCHAR(50) NOT NULL,
    GiaBan int NOT NULL,
    GiaGoc int NOT NULL,
    SoLuong INT NOT NULL,
    CPU CHAR(50) NOT NULL,
    RAM CHAR(50) NOT NULL,
    OCung CHAR(50) NOT NULL,
    ManHinh CHAR(50) NOT NULL,
    PIN CHAR(50) NOT NULL,
    Hinh  blob null,
    FOREIGN KEY (MaNSX) REFERENCES NSX(MaNSX) On delete cascade
);

CREATE TABLE DonNhap(
                        MaDonNhap INT  AUTO_INCREMENT PRIMARY KEY,
                        NgayGiaoDich DATE ,
                        ViTri NVARCHAR(200) NOT NULL
);

CREATE TABLE DonNhapInfo(
                            MaDonNhap INT,
                            MaSP INT ,
                            SoLuong INT,
                            PRIMARY KEY(MaDonNhap, MaSP),
                            FOREIGN KEY(MaDonNhap) REFERENCES DonNhap(MaDonNhap) On delete cascade,
                            FOREIGN KEY(MaSP) REFERENCES HangHoa(MaSP) On delete cascade
);

CREATE TABLE KhuyenMai
(
    MaKhuyenMai INT AUTO_INCREMENT PRIMARY KEY,
    GiaTriKhuyenMai INT NOT NULL,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL
);

CREATE TABLE GioHang
(
    MaGioHang INT AUTO_INCREMENT PRIMARY KEY,
    MaKhuyenMai INT  NULL REFERENCES KhuyenMai(MaKhuyenMai) On delete cascade,
    TongTien INT DEFAULT 0,
    ThoiGian DATE  NULL,
    MoTa NVARCHAR(200) Null,
    DiaChi NVARCHAR(200)  NULL,
    TrangThai NVARCHAR(100) NOT NULL,
    MaTK INT  NULL,
    foreign key(MaTK) references taikhoan(MaTK) On delete cascade
);

CREATE TABLE GioHangInfo(
                            MaGioHang INT ,
                            MaSP INT ,
                            SoLuong INT NULL,
                            FOREIGN KEY (MaGioHang) REFERENCES GioHang(MaGioHang) On delete cascade,
                            FOREIGN KEY (MaSP) REFERENCES HangHoa(MaSP) On delete cascade
);

CREATE TABLE BinhLuan
(
    MaSP INT REFERENCES HangHoa(MaSP),
    MaTK INT REFERENCES TaiKhoan(MaTK),
    PRIMARY KEY(MaSP, MaTK),
    TieuDe NVARCHAR(100) NULL,
    NoiDung NVARCHAR(1000) NULL,
    Sao INT NULL,
    ThoiGian Date
);

CREATE TABLE YeuThich(
                         MaSP INT REFERENCES HangHoa(MaSP) On delete cascade,
                         MaTK INT REFERENCES TaiKhoan(MaTK) On delete cascade ,
                         ThoiGian DATE NULL,
                         PRIMARY KEY(MaSP, MaTK)
);

Create Table HopThu(
                       MaHopThu Int primary key,
                       TenNguoiGui nvarchar(200) not null,
                       TieuDe nvarchar(200) not null,
                       NoiDung nvarchar(200) not null,
                       email nvarchar(200) not null
);
