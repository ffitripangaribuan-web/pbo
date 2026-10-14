package Bagian_1;

// Kelas Mantra untuk menerapkan method overloading
public class Mantra {

    // Method untuk mantra dengan efek biasa
    public void ucapkan(String namaMantra) {
        System.out.println(namaMantra + ": Mantra diucapkan.");
    }

    // Overloading dengan parameter kekuatan
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println(namaMantra + " diucapkan dengan kekuatan " + kekuatan + ".");
    }

    // Overloading dengan parameter kekuatan dan target
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println(namaMantra + " menyerang " + target
                + " dengan kekuatan " + kekuatan + ".");
    }

    // Overloading dengan parameter nama mantra dan target
    public void ucapkan(String namaMantra, String target) {
        System.out.println(namaMantra + " digunakan kepada " + target + ".");
    }

    // Overloading dengan urutan parameter berbeda
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println(namaMantra + " diucapkan dengan kekuatan " + kekuatan + ".");
    }

    // Menguji semua method overloading
    public static void main(String[] args) {
        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 10, "Voldemort");
        mantra.ucapkan("Lumos", "ruangan");
        mantra.ucapkan(8, "Protego");
    }
}