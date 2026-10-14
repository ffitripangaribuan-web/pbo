package Bagian_3;

import java.util.ArrayList;
import java.util.List;

// Kelas abstrak untuk semua jenis mantra
abstract class Mantra {

    protected String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    // Setiap mantra harus memiliki efek
    public abstract void efek();

    // Menampilkan nama mantra
    public void ucapkan() {
        System.out.println("Penyihir mengucapkan mantra: " + nama);
        efek();
    }
}

// Mantra untuk melucuti senjata lawan
class Expelliarmus extends Mantra {

    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Senjata lawan terlepas.");
    }
}

// Mantra untuk memanggil Patronus
class ExpectoPatronum extends Mantra {

    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Patronus muncul untuk melindungi penyihir.");
    }
}

// Mantra untuk menghasilkan cahaya
class Lumos extends Mantra {

    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Ujung tongkat mengeluarkan cahaya.");
    }
}

// Kelas penyihir yang dapat mempelajari banyak mantra
class Penyihir {

    private List<Mantra> daftarMantra = new ArrayList<>();

    // Menambahkan mantra ke daftar mantra yang dipelajari
    public void belajarMantra(Mantra mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil dipelajari.");
    }

    // Mengucapkan satu mantra berdasarkan indeks
    public void ucapkanMantra(int indeks) {
        if (indeks >= 0 && indeks < daftarMantra.size()) {
            daftarMantra.get(indeks).ucapkan();
        } else {
            System.out.println("Mantra tidak ditemukan.");
        }
    }

    // Mengucapkan semua mantra yang telah dipelajari
    public void ucapkanSemuaMantra() {
        if (daftarMantra.isEmpty()) {
            System.out.println("Belum ada mantra yang dipelajari.");
            return;
        }

        for (Mantra mantra : daftarMantra) {
            mantra.ucapkan();
            System.out.println();
        }
    }
}

// Kelas utama program
public class DuniaSihir {

    public static void main(String[] args) {

        Penyihir harry = new Penyihir();

        // Harry mempelajari beberapa mantra
        harry.belajarMantra(new Expelliarmus());
        harry.belajarMantra(new ExpectoPatronum());
        harry.belajarMantra(new Lumos());

        System.out.println("\n=== Semua Mantra Harry ===");

        // Mengucapkan seluruh mantra dalam satu perintah
        harry.ucapkanSemuaMantra();
    }
}