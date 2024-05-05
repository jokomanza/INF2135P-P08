package vehicle;

import engine.Mesin;

public abstract class Kendaraan {
    /**
     * The number of fuels the car can hold (in liters)
     */
    private final float bahanBakar;
    private final Mesin mesin;

    public Kendaraan(float bahanBakar, Mesin mesin) {
        this.bahanBakar = bahanBakar;
        this.mesin = mesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public Mesin getEngine() {
        return mesin;
    }
}
