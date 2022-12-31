package Repository;

import java.util.List;
import java.util.Set;

public interface ICrudPersonel<T> {

    void save(T t);
    void update(T t);
    void delete(Long id);
    List<T> findAll();
    T findById(Long id);
    Set<T> odemeListesi();
}
