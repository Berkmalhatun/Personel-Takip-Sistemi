package Controller;

import Entity.*;
import Service.PersonelService;
import Utility.PersonelVeDepartmanUtility;

import java.util.Scanner;

public class PersonelController {
    private static Scanner sc;
    private  PersonelService personelService;
    private  DepartmanController departmanController = new DepartmanController();
    private  PersonelController personelController;

   ///////////////////// ///METOTLAR//////////////////////


    public PersonelController() {
        this.personelService = new PersonelService();
    }
    public void save(){
        sc = new Scanner(System.in);
       Personel personel = null;

       System.out.println("Lutfen personelin adini ve soyadini yaziniz.");
        System.out.println();
        String adSoyad= sc.nextLine();
        System.out.println("Lutfen personelin adresini yaziniz.");
        String adres = sc.nextLine();
        System.out.println("Lutfen personelin cinsiyetini yaziniz.");
        ECinsiyet cinsiyet = ECinsiyet.valueOf(sc.nextLine().trim().toUpperCase());
        System.out.println("Lutfen personelin telefon numarasını yaziniz.");
        String telefon = sc.nextLine();
        System.out.println("Lutfen departman adi giriniz.");
        sc = new Scanner(System.in);
        String depad= sc.nextLine();
        System.out.println("Departman personelinin alacagi maximum maasi giriniz.");
        sc = new Scanner(System.in);
        int maxMaas = sc.nextInt();
        Departman departman = new Departman(depad,maxMaas);
        departmanController.save(departman);
        System.out.println("Personeli hangi bolume ekleyecegınızı seciniz");
        sc = new Scanner(System.in);
        int bolumSecimi=0;
        bolumSec();
        do {
             bolumSecimi = sc.nextInt();
           switch (bolumSecimi) {
               case 1: {
                   System.out.println("Personelin el cabuklugunu 1 ile 10 arasında puanlayınız.");
                   int elCabuklugu = sc.nextInt();
                   System.out.println("Ana menu icin 0 a basiniz.");

                   personel = new Hizmetli(adSoyad, adres, cinsiyet, telefon, elCabuklugu,departman);
                   personelService.save(personel);
                   break;
               }
               case 2: {
                   System.out.println("Personelin bilgisayar bilgisini iyi ya da kötü olarak tanımlayınız."); // burayı dınamık yap
                   sc = new Scanner(System.in);
                   String pcbilgisi = sc.nextLine().trim().toLowerCase();
                   System.out.println("Personelin MSOFFICE bilgisini iyi ya da kötü olarak tanımlayınız.");
                   String msofficebilgisi = sc.nextLine().trim().toLowerCase();
                   System.out.println("Ana menu icin 0 a basiniz.");
                   personel = new BuroPersoneli(adSoyad, adres, cinsiyet, telefon, pcbilgisi, msofficebilgisi,departman);
                   personelService.save(personel);
                   break;
               }
               case 3: {
                   System.out.println("Personelin iletisim yetenegini 1 ile 10 arasinda puanlayiniz.");
                    sc = new Scanner(System.in);
                    int iletisim = sc.nextInt();
                   System.out.println("Ana menu icin 0 a basiniz.");
                    personel = new InsanKaynaklariPersoneli(adSoyad, adres, cinsiyet, telefon,iletisim,departman);
                    personelService.save(personel);
                    break;
               }
               case 4:{
                   System.out.println("Personelin hangi alanda teknik personel oldugunu yaziniz.");
                   sc = new Scanner(System.in);
                   String alan = sc.nextLine();
                   System.out.println("Ana menu icin 0 a basiniz.");
                   personel=new TeknikPersonel(adSoyad, adres, cinsiyet, telefon,alan,departman);
                   personelService.save(personel);
               break;
               }
               case 5:{
                   System.out.println("Personelin matematik seviyesini yaziniz.");
                   sc = new Scanner(System.in);
                   String matSeviyesi= sc.nextLine();
                   System.out.println("Ana menu icin 0 a basiniz.");
                   personel = new MuhasebePersoneli(adSoyad, adres, cinsiyet, telefon,matSeviyesi,departman);
                   personelService.save(personel);
                   break;
               }
               case 6:{
                   System.out.println("Personelin referansini yaziniz.");
                sc = new Scanner(System.in);
                String referans = sc.nextLine();
                   System.out.println("Ana menu icin 0 a basiniz.");
                personel = new Mudur(adSoyad, adres, cinsiyet, telefon,referans,departman);
                personelService.save(personel);
                break;
               }
               case 7:{
                   System.out.println("Personelin bildigi yabanci dili yaziniz.");
                   sc = new Scanner(System.in);
                   String yabanciDİl= sc.nextLine();
                   System.out.println("Ana menu icin 0 a basiniz.");
                   personel = new GenelMudur(adSoyad, adres, cinsiyet, telefon,yabanciDİl,departman);
                   personelService.save(personel);
                   break;
               }

           }
       }while (bolumSecimi!=0);

    }



    public void findAll3(){
        for(Personel personel : personelService.findAll()){
            System.out.println("Personelin adi ve soyadi....: "+ personel.getAdSoyad());
            System.out.println("Personelin adresi...........: "+ personel.getAdres());
            System.out.println("Personelin cinsiyeti........: "+ personel.geteCinsiyet());
            System.out.println("Personelin telefon numarasi.: "+ personel.getTelefon());
        }
    }
    public  void run(){
        PersonelController personelController = new PersonelController();
        sc = new Scanner(System.in);
        int secim = 0;
        do {
            System.out.println("****** PERSONEL TAKIP SISTEMI ******");
            System.out.println("1-Personel ve Departman ekle");
            System.out.println("2-Personel listesi");
            System.out.println("3-Personel duzenleme");
            System.out.println("4-Departman duzenleme");
            System.out.println("5-Departman listesi");
            System.out.println("6-Muhasebe islemleri");
            System.out.println("7-Raporlama isleleri");
            System.out.println("0-Cikis");
            System.out.println("Lutfen secim yapiniz.");
            sc = new Scanner(System.in);
            secim = sc.nextInt();
            switch (secim){
                case 1:{ save();
                break;}
                case 2:{ listele();
                break;}
                case 3: {
                    update();
                    break;}
                case 4:{
                         departmanController.departmanDuzenle(); }
                break;
                case 5:{
                    departmanController.departmanListele();
                break;}
                case 6:{muhasebeIslemleri();
                    break;}
                case 7:{
                    raporlamaIslemleri();
                }

            }

        }while (secim!=0);
    }

    private void bolumSec() {
           System.out.println("***** BOLUM SECME EKRANI *****");
           System.out.println();
           System.out.println("1-Hizmetli");
           System.out.println("2-Buro Personeli");
           System.out.println("3-Insan Kanaklari Personeli");
           System.out.println("4-Teknik Personel");
           System.out.println("5-Muhasebe Personeli");
           System.out.println("6-Mudur");
           System.out.println("7-Genel Mudur");
           System.out.println("0-Cikis");
    }
    private  void listele(){
        System.out.println("PERSONEL LISTESI");
        for (Personel personel : personelService.findAll()){
            System.out.println(personel);
        }
    }
   
   
   
    private void update(){
    sc = new Scanner(System.in);
        System.out.println("Guncelleyeceginiz personelin id numarasını yaziniz.");
        int id= sc.nextInt();
        Personel yeniPersonel = null;
        for (int i =0;i<PersonelVeDepartmanUtility.personelListesi.size();i++){
            if (PersonelVeDepartmanUtility.personelListesi.get(i).getId()==(id)){
                yeniPersonel = PersonelVeDepartmanUtility.personelListesi.get(i);
                System.out.println("Ad soyad giriniz.");
               sc = new Scanner(System.in);
                yeniPersonel.setAdSoyad(sc.nextLine());
                personelService.update(yeniPersonel);
            }
        }

        }
       public  void muhasebeIslemleri(){
        sc = new Scanner(System.in);
           System.out.println("***** MUHASEBE ISLEMLERI *****");
           System.out.println("1-Personel maasi eklemek.");
           System.out.println("2-Odeme yap");
           System.out.println("3-Odeme listesi");
           int muhasebeSecim = sc.nextInt();
           switch (muhasebeSecim){
               case 1: {
                   maasTanimla();
               break ;
               }
               case 2:{
                   odemeYap();
               break;
               }
               case 3:{
                   Odemelistesi();
                   break;
               }
           }
       }
    public void maasTanimla(){
        sc = new Scanner(System.in);
        System.out.println("Maasini belirleyeceginiz personelin id numarasini giriniz.");
        Long id = sc.nextLong();
        System.out.println("Maasini giriniz.");
        sc = new Scanner(System.in);
        int maas = sc.nextInt();
        for (int i = 0 ; i<PersonelVeDepartmanUtility.personelListesi.size();i++){
            if (PersonelVeDepartmanUtility.personelListesi.get(i).getId() == id) {
                PersonelVeDepartmanUtility.personelListesi.get(i).setMaas(maas);
                System.out.println(PersonelVeDepartmanUtility.personelListesi.get(i).getAdSoyad() + " personeline "
                        + maas + " tanimlanmistir.");
                break;
            }
        }


        }
    public void odemeYap() {
        sc = new Scanner(System.in);
        System.out.println("Odeme yapılacak personelin id sini giriniz.");
        Long ode = sc.nextLong();
       for (int i =0;i<PersonelVeDepartmanUtility.personelListesi.size();i++){
           if(PersonelVeDepartmanUtility.personelListesi.get(i).getId()==ode){
               System.out.println(PersonelVeDepartmanUtility.personelListesi.get(i).getAdSoyad()+" kisisine "+
                       PersonelVeDepartmanUtility.personelListesi.get(i).getMaas()+" TL odeme yapılmistir.");
               PersonelVeDepartmanUtility.setOdemeListesi.add(PersonelVeDepartmanUtility.personelListesi.get(i));
               personelService.odemeListesi();
               break;
           }
       }
    }
    private  void Odemelistesi() {
        System.out.println("ODEME LISTESI");
        for (Personel personel : personelService.odemeListesi()) {
            System.out.println(personel);
        }
    }
    public void raporlamaIslemleri(){
        sc = new Scanner(System.in);
        System.out.println("***** RAPORLAMA ISLEMLERI *****");
        System.out.println("1-Departman Personel Listesi");
        System.out.println("2-En Cok Personel Bulunan Departman");
        System.out.println("3-Departmanalara Gore Maas Ortalamasi");
        System.out.println("4-Mudurlerin Sorumlu Oldugu Departman Listesi");
        System.out.println("5-Kayit Tarihlerine Gore Personellerin Sirali Listesi");
        System.out.println("6-Ayni Gun Icınde Ise Baslayan Personellerin Sirali Listesi");
        System.out.println("0-Ana Menu");
        int raporSecim = sc.nextInt();
        switch (raporSecim){
            case 1: {
                depPerList();
                break ;
            }
            case 2:{

                break;
            }
            case 3:{

                break;
            }
        }
    }

    public void depPerList(){
        System.out.println("Personel listesini gormek istediginiz departman adini yaziniz.");
        sc= new Scanner(System.in);
        String aranan = sc.nextLine();
        for (int i =0;i<PersonelVeDepartmanUtility.personelListesi.size();i++){
            if(PersonelVeDepartmanUtility.personelListesi.get(i).getDepartman().getAd().equals(aranan))
                System.out.println(PersonelVeDepartmanUtility.personelListesi.get(i).getAdSoyad());
        }

    }


}


