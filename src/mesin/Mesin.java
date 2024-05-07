package mesin;

public class Mesin {

    public int jumlahSilinder;
    public float kapasitasSilinder;
    public Langkah langkah;

    public Mesin(int jumlahSilinder, float kapasitasSilinder, Langkah langkah) {
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah = langkah;
    }
}
