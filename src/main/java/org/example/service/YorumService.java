package org.example.service;

import org.example.entity.Kullanıcı;
import org.example.entity.Yorum;
import org.example.repository.KullanıcıRepository;
import org.example.repository.YorumRepository;

public class YorumService {
    YorumRepository yorumRepository = new YorumRepository();
    public void save(Yorum yorum){

            yorumRepository.save(yorum);


    }
    public void delete(Yorum yorum) {
            yorumRepository.delete(yorum);
    }
    public void update(Yorum yorum) {
            yorumRepository.update(yorum);
    }
}
