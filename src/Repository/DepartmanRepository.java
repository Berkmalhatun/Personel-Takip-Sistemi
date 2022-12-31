package Repository;

import Entity.Departman;
import Entity.Personel;
import Utility.PersonelVeDepartmanUtility;

import java.util.List;

public class DepartmanRepository implements ICrudDepartman<Departman> {
    @Override
    public void save(Departman departman) {
        PersonelVeDepartmanUtility.departmanListesi.add(departman);
    }

    @Override
    public void update(Departman departman) {
    for (int i =0; i<PersonelVeDepartmanUtility.departmanListesi.size();i++){
        if(PersonelVeDepartmanUtility.departmanListesi.get(i).getAd().equals(departman.getAd())){
            PersonelVeDepartmanUtility.departmanListesi.set(i,departman);
            break;
        }
    }
    }

    @Override
    public List<Departman> findAll() {
        return PersonelVeDepartmanUtility.departmanListesi;
    }

    public List<Personel> depPerList(Departman departman){
        return departman.getDepPersonel();
    }
}
