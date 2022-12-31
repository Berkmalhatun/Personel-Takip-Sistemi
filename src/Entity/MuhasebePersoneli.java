package Entity;

public class MuhasebePersoneli extends Personel{

   private String matSeviyesi;


    /////// METOTLAR///////////


    public MuhasebePersoneli(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, String matSeviyesi,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.matSeviyesi = matSeviyesi;
    }

    public String getMatSeviyesi() {
        return matSeviyesi;
    }

    public void setMatSeviyesi(String matSeviyesi) {
        this.matSeviyesi = matSeviyesi;
    }

}
