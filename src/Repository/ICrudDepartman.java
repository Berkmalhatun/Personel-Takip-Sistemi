package Repository;

import java.util.List;

public interface ICrudDepartman <T>{
    void save(T t);
    void update(T t);
    List<T> findAll();

}
