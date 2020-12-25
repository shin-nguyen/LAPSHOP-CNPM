package Dao;

import Model.NSX;

import java.util.List;

public interface NSXDao {
    void insert (NSX nsx);
    void edit(NSX nsx);
    void delete(NSX nsx);

    NSX get(int MaNSX);
    NSX getByTenNSX(String tenNSX);
    List<NSX> getAll();
}
