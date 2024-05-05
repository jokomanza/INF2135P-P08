import kendaraan.Mobil;
import kendaraan.SepedaMotor;
import mesin.Langkah;
import mesin.Mesin;

public class Utama {

    public static void main(String[] args) {
        Mesin mesinHondaCbr250rr = new Mesin(2, 249.7f, Langkah.EMPAT_LANGKAH);
        SepedaMotor hondaCbr250rr = new SepedaMotor(mesinHondaCbr250rr);
        hondaCbr250rr.setBahanBakar(14.5f);
        hondaCbr250rr.setKetinggianTempatDuduk(790);

        Mesin mesinSupraMk4 = new Mesin(6, 2997f, Langkah.EMPAT_LANGKAH);
        Mobil supraMk4 = new Mobil(mesinSupraMk4);
        supraMk4.setBahanBakar(70f);
        supraMk4.setJumlahPintu(2);

        System.out.println("Sepeda Motor Honda CBR250RR");
        System.out.println("Bahan bakar: " + hondaCbr250rr.getBahanBakar() + " liter");
        System.out.println("Jumlah silinder: " + hondaCbr250rr.getEngine().getJumlahSilinder());
        System.out.println("Kapasitas silinder: " + hondaCbr250rr.getEngine().getKapasitasSilinder() + " cc");
        System.out.println("Langkah: " + hondaCbr250rr.getEngine().getLangkah());
        System.out.println("Ketinggian tempat duduk: " + hondaCbr250rr.getKetinggianTempatDuduk() + " mm");

        System.out.println("\nMobil Toyota Supra MK4");
        System.out.println("Bahan bakar: " + supraMk4.getBahanBakar() + " liter");
        System.out.println("Jumlah silinder: " + supraMk4.getEngine().getJumlahSilinder());
        System.out.println("Kapasitas silinder: " + supraMk4.getEngine().getKapasitasSilinder() + " cc");
        System.out.println("Langkah: " + supraMk4.getEngine().getLangkah());
        System.out.println("Jumlah pintu: " + supraMk4.getJumlahPintu());
    }
}
