package Entity;

public abstract class Personel extends BaseEntity{
    private String adSoyad;
    private String adres;
    private ECinsiyet eCinsiyet;
    private String telefon;
     Departman departman;
    private int maas; // muhasebe kısmında deger gırılecek.

    //PERSONEL EKLENDIGI ZAMAN PERSONELUTILITY DEKI PERSONELLISTESINE EKLENCEK.//

    /////////////////////////METOT KISIMLARI///////////////////////////


    public Personel() {
    }

    public Personel(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon,Departman departman) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.eCinsiyet = eCinsiyet;
        this.telefon = telefon;
        this.departman= departman;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public ECinsiyet geteCinsiyet() {
        return eCinsiyet;
    }

    public void seteCinsiyet(ECinsiyet eCinsiyet) {
        this.eCinsiyet = eCinsiyet;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }


    @Override
    public String toString() {
        return "Personel{" +
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", cinsiyet=" + eCinsiyet +
                ", telefon='" + telefon + '\'' +
                ", maas=" + maas +
                ", id=" + id + '\''+", departman='"+departman+
                '}';
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }
}
