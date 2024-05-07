package kendaraan;

import mesin.Mesin;

public abstract class Kendaraan {

    private String bahanBakar;
    private Mesin mesin;

    public Kendaraan(Mesin mesin) {
        this.mesin = mesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setEngine(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getEngine() {
        return mesin;
    }
}
