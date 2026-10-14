// 1. Abstract Class Animal
abstract class Animal {
    // Abstract method (wajib diisi oleh class anak)
    abstract void suara();

    // Method biasa (sudah ada isinya)
    void tidur() {
        System.out.println("Hewan tidur");
    }
}

// 2. Class Kucing yang menurunkan dari Animal
class Kucing extends Animal {
    // Mengisi/Override method abstract 'suara'
    @Override
    void suara() {
        System.out.println("meong");
    }
}

// 3. Class Utama (Main)
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Tipe referensi 'Animal', tapi objeknya 'Kucing'
        Animal a = new Kucing();
        
        a.suara(); // Output: meong
        a.tidur(); // Output: Hewan tidur
    }
}