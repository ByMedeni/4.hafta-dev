package dataAccess;

import java.util.List;

public interface IRepository<T> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
    T getById(int id);
    List<T> getAll();
}