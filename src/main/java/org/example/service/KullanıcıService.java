package org.example.service;

import org.example.entity.Kullanıcı;
import org.example.repository.KullanıcıRepository;

public class KullanıcıService {
KullanıcıRepository kullanıcıRepository = new KullanıcıRepository();
public void save(Kullanıcı kullanıcı){

        kullanıcıRepository.save(kullanıcı);

}
public void delete(Kullanıcı kullanıcı) {

        kullanıcıRepository.delete(kullanıcı);


}
public void update(Kullanıcı kullanıcı) {
        kullanıcıRepository.update(kullanıcı);
}
}

