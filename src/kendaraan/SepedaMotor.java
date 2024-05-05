package kendaraan;

import mesin.Mesin;

/**
 * Car class to create a car object
 */
public class SepedaMotor extends Kendaraan {

    private int ketinggianTempatDuduk;

    public SepedaMotor(Mesin mesin) {
        super(mesin);
    }

    public int getKetinggianTempatDuduk() {
        return ketinggianTempatDuduk;
    }

    public void setKetinggianTempatDuduk(int ketinggianTempatDuduk) {
        this.ketinggianTempatDuduk = ketinggianTempatDuduk;
    }
}
