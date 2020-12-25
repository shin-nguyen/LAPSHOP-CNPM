package Service;

import Model.NSX;

import java.util.List;

public interface NSXService {
    void insert (NSX nsx);
    void edit(NSX nsx);
    void delete(NSX nsx);

    NSX get(int MaNSX);
    NSX getByTenNSX(String tenNSX);
    List<NSX> getAll();
}
