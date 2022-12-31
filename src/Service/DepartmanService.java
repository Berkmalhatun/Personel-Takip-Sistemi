package Service;

import Entity.Departman;
import Entity.Personel;
import Repository.DepartmanRepository;

import java.util.List;

public class DepartmanService {
    private DepartmanRepository departmanRepository = new DepartmanRepository();
    private Departman departman;

    ///// METOTLAR //////////


    public DepartmanService() {
        this.departmanRepository = new DepartmanRepository();
    }
    public void save(Departman departman){
        departmanRepository.save(departman);
    }
public void update(Departman departman){
        departmanRepository.update(departman);
}
public List<Departman> findAll(){
        return departmanRepository.findAll();
}

public List<Personel> depPerList(Departman departman){
        return departmanRepository.depPerList(departman);
}

}
