package Entity;

public class InsanKaynaklariPersoneli extends Personel{

    private int iletisim; // 0 ile 10 arasında deger.


   //// METOTLAR ////


    public InsanKaynaklariPersoneli(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, int iletisim,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.iletisim = iletisim;
    }

    public int getIletisim() {
        return iletisim;
    }

    public void setIletisim(int iletisim) {
        this.iletisim = iletisim;
    }
}
