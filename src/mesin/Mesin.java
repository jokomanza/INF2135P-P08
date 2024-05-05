package mesin;

/**
 * Engine class to create an engine object
 */
public class Mesin {

    private int jumlahSilinder;
    private float kapasitasSilinder;
    private Langkah langkah;

    public Mesin(int jumlahSilinder, float kapasitasSilinder, Langkah langkah) {
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah = langkah;
    }

    public int getJumlahSilinder() {
        return jumlahSilinder;
    }

    public void setJumlahSilinder(int jumlahSilinder) {
        this.jumlahSilinder = jumlahSilinder;
    }

    public float getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(float kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public Langkah getLangkah() {
        return langkah;
    }

    public void setLangkah(Langkah langkah) {
        this.langkah = langkah;
    }
}
