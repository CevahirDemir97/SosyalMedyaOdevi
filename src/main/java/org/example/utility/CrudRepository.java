package org.example.utility;

public class CrudRepository<T,ID> implements ICrudRepository<T,ID> {
    DbConnection dbConnection  = new DbConnection();

    @Override
    public void save(T t) {
        try {
            dbConnection.openSession();
            dbConnection.session.save(t);
            dbConnection.closeSession();
        }
        catch (Exception E){
            dbConnection.rollback();
        }
    }

    @Override
    public void delete(T t) {
        try {
            dbConnection.openSession();
            dbConnection.session.delete(t);
            dbConnection.closeSession();
        }
        catch (Exception e){
            dbConnection.rollback();
        }
    }

    @Override
    public void update(T t) {
     try {
         dbConnection.openSession();
         dbConnection.session.update(t);
         dbConnection.closeSession();
     }
     catch (Exception e){
         dbConnection.rollback();
     }
    }

    @Override
    public T getById(ID id) {
        T tt =null;
        try {
            dbConnection.openSession();
            tt = (T) dbConnection.session.find(Object.class,id);
            dbConnection.closeSession();
            return tt;
        }
        catch (Exception e){
            dbConnection.rollback();
            return tt;
        }

    }
}
