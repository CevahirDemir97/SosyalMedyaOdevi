package org.example.repository;

import org.example.entity.Kullanıcı;
import org.example.entity.Yorum;
import org.example.utility.CrudRepository;
import org.example.utility.DbConnection;

import java.util.ArrayList;
import java.util.List;

public class KullanıcıRepository extends CrudRepository<Kullanıcı,Integer> {
    DbConnection dbConnection = new DbConnection();
    public List<Kullanıcı> getAll(){
        List<Kullanıcı> kullanıcıs = new ArrayList<>();
        try {
            dbConnection.openSession();
            kullanıcıs =
                    dbConnection.session.createNativeQuery("select * from kullanıcı",Kullanıcı.class).getResultList();
            dbConnection.closeSession();
            return kullanıcıs;
        }
        catch (Exception e){
            dbConnection.rollback();
            return kullanıcıs;
        }
    }
    public Kullanıcı getByName(String kullanıcıadi){
        String sql = "select * from kullanıcı where kullaniciAdi = '"+ kullanıcıadi +"' ";
        Kullanıcı kullanıcı = null;
        try {
            dbConnection.openSession();
            kullanıcı =
                      dbConnection.session.createNativeQuery(sql,Kullanıcı.class).getSingleResult();
            if(kullanıcı == null){
                dbConnection.closeSession();
                return kullanıcı;
            }
            else {
                dbConnection.closeSession();
                return kullanıcı;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
            return kullanıcı;
        }
    }
}
