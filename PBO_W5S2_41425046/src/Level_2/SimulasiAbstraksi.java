/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

package Level_2;

/*
 * Nama : Fitri Pangaribuan
 * NIM : 41425046
 * Nama Program : Simulasi Abstraksi
 */

// Abstract class sebagai parent
abstract class KendaraanEkspedisi {

    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method biasa
    public void infoKendaraan() {
        System.out.println("Plat Nomor : " + noPolisi);
        System.out.println("Kapasitas  : " + kapasitasKg + " Kg");
    }

    // Abstract method
    public abstract void angkutBarang(String namaBarang);
}

// Class TrukBox sebagai turunan
class TrukBox extends KendaraanEkspedisi {

    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi abstract method
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk Box mengangkut " + namaBarang);
    }
}

// Class MobilVan sebagai turunan
class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi abstract method
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van mengangkut " + namaBarang);
    }
}

// Class utama
public class SimulasiAbstraksi {

    public static void main(String[] args) {

        System.out.println("=== SIMULASI ABSTRAKSI ===");

        // Tidak boleh membuat object langsung dari abstract class
        // KendaraanEkspedisi k =
        //        new KendaraanEkspedisi("BK 1234 DEL", 100);

        // Membuat object dari class turunan
        TrukBox truk = new TrukBox("B 9081 TXT", 5000);

        truk.infoKendaraan();
        truk.angkutBarang("Kulkas");

        System.out.println("----------------------");

        MobilVan van = new MobilVan("B 1122 KAA", 800);

        van.infoKendaraan();
        van.angkutBarang("Sepatu");
    }
}