package Repository;

import Entity.Personel;
import Utility.PersonelVeDepartmanUtility;

import java.util.*;

public class PersonelRepository implements ICrudPersonel<Personel> {



    ///////// METOTLAR //////////////////////////
    @Override
    public void save(Personel personel) {
        PersonelVeDepartmanUtility.personelListesi.add(personel);
    }

    @Override
    public void update(Personel personel) {
for (int i = 0 ; i<PersonelVeDepartmanUtility.personelListesi.size();i++){
    if(PersonelVeDepartmanUtility.personelListesi.get(i).getId()==(personel.getId())){
        PersonelVeDepartmanUtility.personelListesi.set(i,personel);
        break;
    }
}


    }

    @Override
    public void delete(Long id) {
    for (int i = 0 ; i<PersonelVeDepartmanUtility.personelListesi.size();i++){
        if(PersonelVeDepartmanUtility.personelListesi.get(i).getId().equals(id))   {
            PersonelVeDepartmanUtility.personelListesi.remove(i);
            break;
        }
    }
    }

    @Override
    public List<Personel> findAll() {
        return PersonelVeDepartmanUtility.personelListesi;
    }

    @Override
    public Personel findById(Long id) {
    for (int i = 0 ; i<PersonelVeDepartmanUtility.personelListesi.size();i++){
        if(PersonelVeDepartmanUtility.personelListesi.get(i).getId() == id){
            return PersonelVeDepartmanUtility.personelListesi.get(i);
        }
    }
    return null;
    }

    @Override
    public Set<Personel> odemeListesi() {
        return PersonelVeDepartmanUtility.setOdemeListesi;
    }

}
