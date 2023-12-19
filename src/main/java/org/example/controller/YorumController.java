package org.example.controller;

import org.example.entity.Post;
import org.example.entity.Yorum;
import org.example.service.YorumService;

public class YorumController {
    YorumService yorumService = new YorumService();
    public void save(int yorumId,int postId,int kullaniciid,String kullaniciAdi,String yorum)
    {
        Yorum yorum1 = new Yorum();
        yorum1.setyorumId(yorumId);
        yorum1.setpostId(postId);
        yorum1.setkullaniciid(kullaniciid);
        yorum1.setkullaniciAdi(kullaniciAdi);
        yorum1.setyorum(yorum);
        yorumService.save(yorum1);
    }
    public void delete(int yorumId,int postId,int kullaniciid,String kullaniciAdi,String yorum)
    {
        Yorum yorum1 = new Yorum();
        yorum1.setyorumId(yorumId);
        yorum1.setpostId(postId);
        yorum1.setkullaniciid(kullaniciid);
        yorum1.setkullaniciAdi(kullaniciAdi);
        yorum1.setyorum(yorum);
        yorumService.delete(yorum1);
    }
    public void update(int yorumId,int postId,int kullaniciid,String kullaniciAdi,String yorum)
    {
        Yorum yorum1 = new Yorum();
        yorum1.setyorumId(yorumId);
        yorum1.setpostId(postId);
        yorum1.setkullaniciid(kullaniciid);
        yorum1.setkullaniciAdi(kullaniciAdi);
        yorum1.setyorum(yorum);
        yorumService.update(yorum1);
    }
}
