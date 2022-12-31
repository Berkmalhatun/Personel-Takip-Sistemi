package Entity;

public class Mudur extends Personel{

    private String referans;

    ///////// METOTLAR /////////


    public Mudur(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, String referans,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.referans = referans;
    }

    public String getReferans() {
        return referans;
    }

    public void setReferans(String referans) {
        this.referans = referans;
    }


}
