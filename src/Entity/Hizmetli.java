package Entity;

public class Hizmetli extends Personel {

    private int elCabuklugu; //0 ile 10 arasında deger verilsin

    /////// METOTLAR ///////////////


    public Hizmetli(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, int elCabuklugu,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.elCabuklugu = elCabuklugu;
    }


    public int getElCabuklugu() {
        return elCabuklugu;
    }

    public void setElCabuklugu(int elCabuklugu) {
        this.elCabuklugu = elCabuklugu;
    }


}