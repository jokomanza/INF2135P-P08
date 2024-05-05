import engine.Langkah;
import engine.Mesin;
import vehicle.Mobil;
import vehicle.SepedaMotor;

/**
 * Main class to test the implementation of the classes
 */
public class Main {

    /**
     * Main method to test the implementation of the classes
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Langkah duaLangkah = Langkah.DUA_LANGKAH;
        Mesin mesinSepedaMotor = new Mesin(2, 500, duaLangkah);
        SepedaMotor sepedaMotor = new SepedaMotor(2, mesinSepedaMotor);

        Langkah empatLangkah = Langkah.EMPAT_LANGKAH;
        Mesin mesinMobil = new Mesin(4, 1000, empatLangkah);
        Mobil mobil = new Mobil(4, mesinMobil);

        System.out.println("MotorCycle with " + sepedaMotor.getBahanBakar() + " fuels has a " + sepedaMotor.getEngine().getJumlahSilinder() + "-cylinder engine with a capacity of " + sepedaMotor.getEngine().getKapasitasSilinder() + " cc and a " + sepedaMotor.getEngine().getStroke() + " stroke");
        System.out.println("Car with " + mobil.getBahanBakar() + " fuels has a " + mobil.getEngine().getJumlahSilinder() + "-cylinder engine with a capacity of " + mobil.getEngine().getKapasitasSilinder() + " cc and a " + mobil.getEngine().getStroke() + " stroke");
    }
}
