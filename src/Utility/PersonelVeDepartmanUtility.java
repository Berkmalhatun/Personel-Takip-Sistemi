package Utility;

import Entity.Departman;
import Entity.Personel;

import java.util.*;

public class PersonelVeDepartmanUtility {

    public static Long id = -1L;
    public static List<Personel> personelListesi = new ArrayList<Personel>();
    public static List<Departman> departmanListesi = new ArrayList<Departman>();

    public static Set<Personel> setOdemeListesi= new HashSet<>();

    public static Map<Departman,Personel> departmanPersonelMap = new HashMap<>();

    /////// METOTLAR/////////


    public static Long idOlustur(){

        id++;
        return id;
    }

}
