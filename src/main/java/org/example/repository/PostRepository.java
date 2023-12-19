package org.example.repository;

import org.example.entity.Post;
import org.example.entity.Yorum;
import org.example.utility.CrudRepository;
import org.example.utility.DbConnection;

import java.util.ArrayList;
import java.util.List;

public class PostRepository extends CrudRepository<Post,Integer> {

    DbConnection dbConnection = new DbConnection();
    public List<Post> getAll(){
        List<Post> posts = new ArrayList<>();
        try {
            dbConnection.openSession();
            posts =
                    dbConnection.session.createNativeQuery("select * from post",Post.class).getResultList();
            dbConnection.closeSession();
            return posts;
        }
        catch (Exception e){
            dbConnection.rollback();
            return posts;
        }
    }

}
