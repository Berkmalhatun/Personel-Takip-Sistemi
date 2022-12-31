package Entity;

public class BuroPersoneli extends Personel{
  private   String pcBilgisi;
   private String MsOfficeBilgisi;


   //////////////////////////////// /// METOTLAR ////////////////////////////


    public BuroPersoneli(String adSoyad, String adres, ECinsiyet eCinsiyet, String telefon, String pcBilgisi, String msOfficeBilgisi,Departman departman) {
        super(adSoyad, adres, eCinsiyet, telefon,departman);
        this.pcBilgisi = pcBilgisi;
        MsOfficeBilgisi = msOfficeBilgisi;
    }

    public String getPcBilgisi() {
        return pcBilgisi;
    }

    public void setPcBilgisi(String pcBilgisi) {
        this.pcBilgisi = pcBilgisi;
    }

    public String getMsOfficeBilgisi() {
        return MsOfficeBilgisi;
    }

    public void setMsOfficeBilgisi(String msOfficeBilgisi) {
        MsOfficeBilgisi = msOfficeBilgisi;
    }

}
