package Service;

import Model.YeuThich;

import java.util.List;

public interface YeuThichService {
    void insert(YeuThich yeuThich);
    void delete(YeuThich yeuThich);
    List<YeuThich> getAll();
    List<YeuThich> getByMaTK(int maTK);
}
