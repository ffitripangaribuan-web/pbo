package Bagian_2;

// Kelas abstrak sebagai kerangka dasar mantra
abstract class MantraAbstrak {

    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang wajib diimplementasikan
    public abstract void efek();

    // Menampilkan nama mantra
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Kelas mantra Expelliarmus
class Expelliarmus extends MantraAbstrak {

    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Kelas mantra Expecto Patronum
class ExpectoPatronum extends MantraAbstrak {

    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Kelas mantra Lumos
class Lumos extends MantraAbstrak {

    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}