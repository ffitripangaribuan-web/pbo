package Tantangan;

// Mantra untuk mencegah apparition di area tertentu
public class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    // Constructor untuk menentukan area perlindungan
    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println(
            "Mantra Anti-Apparition aktif di area: " + area
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println(
            "Mantra Anti-Apparition dinonaktifkan di area: " + area
        );
    }
}