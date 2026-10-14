package Tantangan;

// Mantra untuk membentuk perisai perlindungan
public class Protego extends MantraPerlindungan {

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}