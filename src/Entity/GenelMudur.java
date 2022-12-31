package Entity;

public class GenelMudur extends Personel{

   private String yabanciDil;

    ///////// METOTLAR ///////////


    public GenelMudur(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, String yabanciDil,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.yabanciDil = yabanciDil;
    }

    public String getYabanciDil() {
        return yabanciDil;
    }

    public void setYabanciDil(String yabanciDil) {
        this.yabanciDil = yabanciDil;
    }

}
