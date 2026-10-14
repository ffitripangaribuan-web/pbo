package Tantangan;

import java.util.ArrayList;
import java.util.List;

// Kelas untuk mengelola semua mantra pertahanan Hogwarts
public class SistemPertahanan {

    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    // Menambahkan mantra ke sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil ditambahkan.");
    }

    // Mengaktifkan semua mantra perlindungan
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== Mengaktifkan Pertahanan Hogwarts ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra perlindungan
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== Menonaktifkan Pertahanan Hogwarts ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }

    // Program utama untuk menguji sistem pertahanan
    public static void main(String[] args) {

        SistemPertahanan hogwarts = new SistemPertahanan();

        // Membuat objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        // Menambahkan mantra ke sistem
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Mengaktifkan semua perlindungan
        hogwarts.aktifkanSemuaMantra();

        // Menonaktifkan semua perlindungan
        hogwarts.nonaktifkanSemuaMantra();
    }
}