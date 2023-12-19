package org.example.repository;

import org.example.entity.Yorum;
import org.example.utility.CrudRepository;
import org.example.utility.DbConnection;

import java.util.ArrayList;
import java.util.List;

public class YorumRepository extends CrudRepository<Yorum,Integer> {
    DbConnection dbConnection = new DbConnection();
    public List<Yorum> getAll(){
        List<Yorum> yorums = new ArrayList<>();
        try {
            dbConnection.openSession();
            yorums =
                    dbConnection.session.createNativeQuery("select * from yorum",Yorum.class).getResultList();
            dbConnection.closeSession();
            return yorums;
        }
        catch (Exception e){
            dbConnection.rollback();
            return yorums;
        }
    }

}
