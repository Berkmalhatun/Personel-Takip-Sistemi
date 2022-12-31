package Controller;

import Entity.Departman;
import Entity.Personel;
import Service.DepartmanService;
import Service.PersonelService;
import Utility.PersonelVeDepartmanUtility;

import java.util.Scanner;

public class DepartmanController {
    private static Scanner sc;
    private DepartmanService departmanService;

    //////// METOTLAR ///////////

    public  DepartmanController(){
        this.departmanService = new DepartmanService();
    }
    public void save(Departman departman){
       // sc = new Scanner(System.in);
      //Departman departman;
       // System.out.println("Lutfen departmanin adini giriniz.");
      //  System.out.println();
    //String ad = sc.nextLine();
    //System.out.println("Lutfen departmanda verilebilecek max maasi giriniz.");
    //Scanner sc = new Scanner(System.in);
    //int maas = sc.nextInt();
    //departman=new Departman(ad,maas);
    departmanService.save(departman);
    }
    public void departmanListele(){
        System.out.println("DEPARTMAN LISTESI");
        for (Departman departman: departmanService.findAll()){
            System.out.println(departman);
        }
    }
    public void depPerList(String depAd){
        Departman departman = new Departman();
        for (int i = 0; i< PersonelVeDepartmanUtility.departmanListesi.size();i++){
            if(PersonelVeDepartmanUtility.departmanListesi.get(i).getAd().equals(depAd));
            departman = PersonelVeDepartmanUtility.departmanListesi.get(i);
            departmanService.depPerList(departman);
            break;
        }
    }
    public  void  departmanDuzenle(){
        sc = new Scanner(System.in);
        System.out.println("Guncelleyeceginiz departmanın adını yazınız.");
        String  depad= sc.nextLine();
        Departman yeniDepartman = null;
        for (int i =0;i<PersonelVeDepartmanUtility.departmanListesi.size();i++){
            if (PersonelVeDepartmanUtility.departmanListesi.get(i).getAd().equals(depad)){
                yeniDepartman = PersonelVeDepartmanUtility.departmanListesi.get(i);
                System.out.println("Yeni adi giriniz.");
                sc = new Scanner(System.in);
                yeniDepartman.setAd(sc.nextLine());
                sc = new Scanner(System.in);
                System.out.println("Yeni maximum maasi giriniz.");
                yeniDepartman.setMaxMaas(sc.nextInt());
                departmanService.update(yeniDepartman);
            }
        }
    }
}
