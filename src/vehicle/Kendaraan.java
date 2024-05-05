package vehicle;

import engine.Mesin;

public abstract class Kendaraan {

    private float bahanBakar;
    private Mesin mesin;

    public Kendaraan(Mesin mesin) {
        this.mesin = mesin;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setEngine(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getEngine() {
        return mesin;
    }
}
