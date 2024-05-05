package vehicle;

import engine.Mesin;

/**
 * Car class to create a car object
 */
public class SepedaMotor extends Kendaraan {

    private int ketinggianTempatDuduk;

    public SepedaMotor(float bahanBakar, Mesin mesin) {
        super(bahanBakar, mesin);
    }

    public void setKetinggianTempatDuduk(int ketinggianTempatDuduk) {
        this.ketinggianTempatDuduk = ketinggianTempatDuduk;
    }

    public int getKetinggianTempatDuduk() {
        return ketinggianTempatDuduk;
    }
}
