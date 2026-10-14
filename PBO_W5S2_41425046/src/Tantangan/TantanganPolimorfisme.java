/*
 * Nama : Fitri Pangaribuan
 * NIM : 41425046
 * Nama Program : Tantangan Polimorfisme
 */

package Tantangan;

// Abstract class sebagai parent
abstract class KendaraanEkspedisi {

    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Abstract method
    public abstract void angkutBarang(String namaBarang);
}

// Child class TrukBox
class TrukBox extends KendaraanEkspedisi {

    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] mengangkut "
                + namaBarang + " dengan kapasitas "
                + kapasitasKg + " Kg.");
    }
}

// Child class MobilVan
class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] mengangkut "
                + namaBarang + " dengan kapasitas "
                + kapasitasKg + " Kg.");
    }
}

// Class utama
public class TantanganPolimorfisme {

    public static void main(String[] args) {

        System.out.println("=== TANTANGAN POLIMORFISME ===");

        // Array menggunakan tipe parent class
        KendaraanEkspedisi[] armada = {
            new TrukBox("B 9081 TXT", 5000),
            new MobilVan("B 1122 KAA", 800),
            new TrukBox("BK 1234 DEL", 3000)
        };

        // Satu for-loop untuk seluruh objek
        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.angkutBarang("Barang Ekspedisi");
        }
    }
}