create database WebBanLaptop;
use WebBanLaptop;
CREATE TABLE TaiKhoan
(
MaTK INT  PRIMARY KEY,
TenTK NVARCHAR(50) UNIQUE NOT NULL,
MatKhau NVARCHAR(50) NOT NULL,
phanQuyen NVARCHAR(50) NOT NULL,
HoTen NVARCHAR(50) NOT NULL,
NamSinh DATE NOT NULL,
DiaChi NVARCHAR(200) not NULL,
Email nvarchar(200)  not NUll
);

CREATE TABLE NSX
(
MaNSX INT  PRIMARY KEY,
TenNSX NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(200) NOT NULL
);

CREATE TABLE HangHoa
(
MaSP INT  PRIMARY KEY,
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
Hinh  VARBINARY(100)  null,
MoTa nvarchar(1000) null,
Sao Float default 0 ,
FOREIGN KEY (MaNSX) REFERENCES NSX(MaNSX) On delete cascade
);

Create table HangHoaImage(
	MaHinh int  primary key,
	MaSP Int ,
    HinhBu  VARBINARY(100) null,
    HinhNho VARBINARY(100) null,
    
    FOREIGN KEY (MaSP) REFERENCES HangHoa(MaSP) On delete cascade
);

CREATE TABLE DonNhap(
MaDonNhap INT    PRIMARY KEY,
ThoiGian DATE not null ,
MaSP INT ,
MaTK INT,
SoLuong INT not null,
FOREIGN KEY(MaTK) REFERENCES TaiKhoan(MaTK) On delete cascade,
FOREIGN KEY(MaSP) REFERENCES HangHoa(MaSP) On delete cascade
);

CREATE TABLE KhuyenMai
(
MaKhuyenMai INT  PRIMARY KEY,
GiaTriKhuyenMai INT NOT NULL,
NgayBatDau DATE NOT NULL,
NgayKetThuc DATE NOT NULL
);

CREATE TABLE GioHang
(
	MaGioHang INT  PRIMARY KEY,
	MaKhuyenMai INT  NULL,
    foreign key(MaKhuyenMai) references KhuyenMai(MaKhuyenMai) on delete set null,
	TongTien INT NOT NULL DEFAULT 0,
	ThoiGian DATE  NULL,
	MoTa NVARCHAR(1000) Null,
	DiaChi NVARCHAR(100)  NULL,
	TrangThai Int NOT NULL ,
	MaTK INT,
     foreign key(MaTK) references taikhoan(MaTK) on delete cascade
);

CREATE TABLE GioHangInfo(
MaGioHang INT REFERENCES GioHang(MaGioHang) On delete cascade, 
MaSP INT  REFERENCES HangHoa(MaSP) On delete cascade,
SoLuong INT NOT NULL,
primary key(MaGioHang,MaSP)
);

CREATE TABLE BinhLuan
(
MaSP INT REFERENCES HangHoa(MaSP) on delete cascade,
MaTK INT REFERENCES TaiKhoan(MaTK) on delete cascade,
PRIMARY KEY(MaSP, MaTK),
TieuDe NVARCHAR(100)not null,
NoiDung NVARCHAR(1000) not NULL,
Sao INT NOT Null,
ThoiGian Date  Not null
);

CREATE TABLE YeuThich(
MaSP INT REFERENCES HangHoa(MaSP) On delete cascade,
MaTK INT REFERENCES TaiKhoan(MaTK) On delete cascade ,
ThoiGian DATE NOT NULL,
PRIMARY KEY(MaSP, MaTK)
);

Create Table HopThu(
	MaHopThu Int   primary key,
    TenNguoiGui nvarchar(200) not null,
    TieuDe nvarchar(200) not null,
    NoiDung nvarchar(200) not null,
    email nvarchar(200) not null,
    trangThai nvarchar(200) not null,
     TraLoi int null
);




