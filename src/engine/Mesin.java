package engine;

/**
 * Engine class to create an engine object
 */
public class Mesin {

    private final int jumlahSilinder;
    private final int kapasitasSilinder;
    private final Langkah langkah;

    public Mesin(int jumlahSilinder, int kapasitasSilinder, Langkah langkah) {
        this.jumlahSilinder = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah = langkah;
    }

    public int getJumlahSilinder() {
        return jumlahSilinder;
    }

    public int getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public Langkah getStroke() {
        return langkah;
    }
}
