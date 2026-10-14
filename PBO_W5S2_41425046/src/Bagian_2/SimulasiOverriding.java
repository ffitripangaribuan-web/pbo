/*
 * Nama : Fitri Pangaribuan
 * NIM : 41425046
 * Nama Program : Simulasi Overriding
 */

package Bagian_2;

// Class parent
class KurirReguler {

    protected String nama;

    // Constructor
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method yang akan dioverride
    public void kirimBarang(String alamat) {
        System.out.println(nama
                + " mengantar paket ke " + alamat
                + " lewat jalur darat menembus kemacetan.");
    }
}

// Class child
class KurirDrone extends KurirReguler {

    private String idDrone;

    // Constructor
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // Override method dari parent
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang membawa paket langsung ke koordinat: " + alamat);
    }
}

// Class utama
public class SimulasiOverriding {

    public static void main(String[] args) {

        System.out.println("=== INI METHOD OVERRIDING ===");

        KurirReguler k1 = new KurirReguler("Budi");

        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}