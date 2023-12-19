package org.example.controller;

import org.example.entity.Kullanıcı;
import org.example.service.KullanıcıService;

public class KullanıcıController {
    KullanıcıService kullanıcıService = new KullanıcıService();

    public void save(int kullaniciid,String kullaniciAdi,String sifre){
        Kullanıcı kullanıcı = new Kullanıcı();
        kullanıcı.setkullaniciId(kullaniciid);
        kullanıcı.setkullaniciAdi(kullaniciAdi);
        kullanıcı.setkullaniciSifre(sifre);
        kullanıcıService.save(kullanıcı);
    }
    public void delete(int kullaniciid,String kullaniciAdi,String sifre){
        Kullanıcı kullanıcı = new Kullanıcı();
        kullanıcı.setkullaniciId(kullaniciid);
        kullanıcı.setkullaniciAdi(kullaniciAdi);
        kullanıcı.setkullaniciSifre(sifre);
        kullanıcıService.delete(kullanıcı);
    }
    public void update(int kullaniciid,String kullaniciAdi,String sifre){
        Kullanıcı kullanıcı = new Kullanıcı();
        kullanıcı.setkullaniciId(kullaniciid);
        kullanıcı.setkullaniciAdi(kullaniciAdi);
        kullanıcı.setkullaniciSifre(sifre);
        kullanıcıService.update(kullanıcı);
    }



}
