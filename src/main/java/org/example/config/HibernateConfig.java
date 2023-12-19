package org.example.config;
public class HibernateConfig {
    //sınıfı singleton yaptınız.
    //private static HibernateConfig hibernateConfig = null;
    //sınıfı singleton yaptınız.
    private static SessionFactory sessionFactory = null;
    //Bu method eğer hibernateconfig nesnem boş değilse bu hibernate config
    //dosyasındaki veritabanı bağlantı bilgisini bize dönderir.
    // Eğer hibernateconfig nesnem nullsa hibernate sınıfından yeni nesne oluşturup
   /* public static HibernateConfig getHibernateConfig(){
        if(hibernateConfig==null){
            return new HibernateConfig();
        }
        else{
            return hibernateConfig;
        }
    }*/
    //hibernate.cfg.xml dosyasını okumaktır tek işlevi.
    //Session Factory ile config işlemlerini ve tablo oluşturma
    //işlemini yapar sonucunda bir adet SessionFactory elde edilir.
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            try {
                sessionFactory=new Configuration().configure().buildSessionFactory();
                return sessionFactory;
            }
            catch (Exception e){
                System.out.println("config de hata oldu");
                e.printStackTrace();
                return sessionFactory;
            }
        }
        else {
            return sessionFactory;
        }
    }

}
