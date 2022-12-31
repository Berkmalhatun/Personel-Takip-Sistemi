package Entity;

import java.util.List;
import java.util.Map;

public class Departman extends BaseEntity {
    private String ad;
    private int maxMaas; // departmanda verılecek maximum maas
  //  private Personel personel;
   private List<Personel> depPersonel;


    ///////////METOTLAR//////////////


    public Departman() {
    }

    public Departman(String ad, int maxMaas) {
        this.ad = ad;
        this.maxMaas = maxMaas;
    }


    @Override
    public String toString() {
        return "Departman{" +
                "ad='" + ad + '\'' +
                ", maxMaas=" + maxMaas +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getMaxMaas() {
        return maxMaas;
    }

    public void setMaxMaas(int maxMaas) {
        this.maxMaas = maxMaas;
    }

    public List<Personel> getDepPersonel() {
        return depPersonel;
    }

    public void setDepPersonel(List<Personel> depPersonel) {
        this.depPersonel = depPersonel;
    }
}
