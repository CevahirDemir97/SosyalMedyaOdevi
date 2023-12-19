package org.example.utility;

public interface ICrudRepository<T,ID> {
public void save(T t);
public void delete(T t);

public void update(T t);

public T getById(ID id);
}
