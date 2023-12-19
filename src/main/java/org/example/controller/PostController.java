package org.example.controller;

import org.example.entity.Kullanıcı;
import org.example.entity.Post;
import org.example.service.PostService;

public class PostController {
    PostService postService = new PostService();
    public void save(int postId,int kullaniciid,String kullaniciAdi,String aciklama)
    {
        Post post = new Post();
        post.setpostId(postId);
        post.setkullaniciAdi(kullaniciid);
        post.setkullaniciSifre(kullaniciAdi);
        post.setaciklama(aciklama);
        postService.save(post);
    }
    public void delete(int postId,int kullaniciid,String kullaniciAdi,String aciklama)
    {
        Post post = new Post();
        post.setpostId(postId);
        post.setkullaniciAdi(kullaniciid);
        post.setkullaniciSifre(kullaniciAdi);
        post.setaciklama(aciklama);
        postService.delete(post);
    }
    public void update(int postId,int kullaniciid,String kullaniciAdi,String aciklama)
    {
        Post post = new Post();
        post.setpostId(postId);
        post.setkullaniciAdi(kullaniciid);
        post.setkullaniciSifre(kullaniciAdi);
        post.setaciklama(aciklama);
        postService.update(post);
    }

}
