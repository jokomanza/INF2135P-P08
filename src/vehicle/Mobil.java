package vehicle;

import engine.Mesin;

/**
 * Car class to create a car object
 */
public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(float bahanBakar, Mesin mesin) {
        super(bahanBakar, mesin);
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
