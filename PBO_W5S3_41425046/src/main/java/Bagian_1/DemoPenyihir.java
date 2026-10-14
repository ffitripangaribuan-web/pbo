package Bagian_1;

// Kelas induk yang menjadi dasar semua penyihir
class Penyihir {

    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Kelas Harry Potter yang mengubah perilaku method
class HarryPotter extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Kelas Hermione yang mengubah perilaku method
class Hermione extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Kelas Ron Weasley yang mengubah perilaku method
class RonWeasley extends Penyihir {

    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan berani.");
    }
}

// Kelas utama untuk menguji polymorphism
public class DemoPenyihir {

    public static void main(String[] args) {

        // Referensi kelas induk dapat menyimpan objek kelas turunan
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();

        // Method yang dijalankan menyesuaikan objek sebenarnya
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}