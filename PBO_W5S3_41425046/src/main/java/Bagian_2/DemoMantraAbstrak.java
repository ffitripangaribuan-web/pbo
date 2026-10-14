package Bagian_2;

// Kelas utama program
public class DemoMantraAbstrak {

    public static void main(String[] args) {

        // Membuat objek dari kelas turunan
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        // Mengucapkan dan menjalankan efek mantra
        mantra1.ucapkan();
        mantra1.efek();

        System.out.println();

        mantra2.ucapkan();
        mantra2.efek();

        System.out.println();

        mantra3.ucapkan();
        mantra3.efek();
    }
}