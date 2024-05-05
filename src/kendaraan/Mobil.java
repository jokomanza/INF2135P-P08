package kendaraan;

import mesin.Mesin;

public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(Mesin mesin) {
        super(mesin);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
}
