package Service;

import Entity.ECinsiyet;
import Entity.Personel;
import Repository.PersonelRepository;

import java.util.List;
import java.util.Set;

public class PersonelService {
   private  PersonelRepository personelRepository= new PersonelRepository();
    private  Personel personel;


    public void PersonelService(){
this.personelRepository=new PersonelRepository();
   }
    public void save(Personel personel){
       personelRepository.save(personel);
    }

    public void save (String adsoyad, String adres, ECinsiyet cinsiyet,String telefon){
   //EĞER PERSONELLERI FARKLI KAYDETMEZSE BURAYA BAK.ABSTRACT OLDUGU ICIN NEWLENEMEDI.

        personel.setAdSoyad(adsoyad);
    personel.setAdres(adres);
    personel.seteCinsiyet(cinsiyet);
    personel.setTelefon(telefon);
    personelRepository.save(personel);
    }


public List<Personel> findAll(){
       return personelRepository.findAll();
}
    public Personel findById(Long id){
        return personelRepository.findById(id);
    }
    public void delete(Long id){
       personelRepository.delete(id);
    }
    public void update(Personel personel){
       personelRepository.update(personel);
    }

    public Set<Personel> odemeListesi(){
        return personelRepository.odemeListesi();
    }
}
