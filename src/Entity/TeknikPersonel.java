package Entity;

public class TeknikPersonel extends Personel {

    private String alan;


    //// METOTLAR ///


    public TeknikPersonel(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, String alan,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.alan = alan;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
}