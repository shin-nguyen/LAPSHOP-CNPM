package Service;

import Model.DonNhapInfo;

import java.util.List;

public interface DonNhapInfoService {
    void insert(DonNhapInfo donNhapInfo);

    void edit(DonNhapInfo donNhapInfo);

    void delete(DonNhapInfo donNhapInfo);
//    void deleteAll(int maGiaoDich);

    List<DonNhapInfo> getAll();

    List<DonNhapInfo> getByMaGiaoDich(int maGiaoDich);
    DonNhapInfo get(int maGiaoDich, int maHangHoa);
}
