package org.example.service;

import org.example.entity.Kullanıcı;
import org.example.entity.Post;
import org.example.repository.KullanıcıRepository;
import org.example.repository.PostRepository;

public class PostService {
    PostRepository postRepository = new PostRepository();
    public void save(Post post){

            postRepository.save(post);
    }
    public void delete(Post post) {

            postRepository.delete(post);
    }
    public void update(Post post) {

            postRepository.update(post);
        }
    }

