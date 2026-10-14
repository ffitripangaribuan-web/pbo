/*
 * Nama : Fitri Pangaribuan
 * NIM : 41425046
 * Nama Program : Simulasi Overloading
 */

package Bagian_1;

// Class untuk menghitung tarif pengiriman
class MesinTarif {

    private String kotaAsal;

    // Constructor
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Overloading 1: berdasarkan berat
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Overloading 2: berdasarkan berat dan nilai barang
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Overloading 3: berdasarkan berat dan status express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;

        if (isExpress) {
            total += 20000;
        }

        return total;
    }
}

// Class utama
public class SimulasiOverloading {

    public static void main(String[] args) {

        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");

        System.out.println("Ongkir Biasa (2.0 Kg)       : Rp "
                + tarif.hitungOngkir(2.0));

        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp "
                + tarif.hitungOngkir(2.0, 5000000.0));

        System.out.println("Ongkir Express (2.0 Kg)     : Rp "
                + tarif.hitungOngkir(2.0, true));
    }
}