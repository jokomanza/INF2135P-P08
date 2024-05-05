package vehicle;

import engine.Mesin;

/**
 * Car class to create a car object
 */
public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(Mesin mesin) {
        super(mesin);
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
