package Tantangan;

// Mantra yang menyembunyikan rahasia melalui secret keeper
public class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    // Constructor untuk menentukan penjaga rahasia
    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println(
            "Mantra Fidelius aktif. Penjaga rahasia: " + secretKeeper
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}