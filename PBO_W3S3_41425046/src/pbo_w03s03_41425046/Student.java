package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */

// Class yang akan dibuat objeknya lewat Reflection
class StudentRefl {

    // Constructor default (tanpa parameter), diperlukan agar bisa dipanggil lewat Reflection
    public StudentRefl() {
        // constructor kosong
    }
}

// Class utama (tanpa public, jadi nama file bebas dan tidak perlu sama dengan nama class)
class ReflectionMain {

    public static void main(String[] args) {
        try {
            // Mencari class berdasarkan nama lengkap (nama package + nama class)
            Class<?> c = Class.forName("pbo_w03s03_41425046.StudentRefl");

            // Mengambil constructor default lalu membuat objek baru dari class tersebut
            Object s2 = c.getDeclaredConstructor().newInstance();

            // Menampilkan objek yang berhasil dibuat
            System.out.println("Object created: " + s2);

        } catch (ClassNotFoundException e) {
            // Terjadi jika nama class atau package salah
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            // Terjadi jika class tidak punya constructor tanpa parameter
            System.err.println("No default constructor!");
        } catch (Exception e) {
            // Menangkap error lain, misalnya saat proses pembuatan objek
            e.printStackTrace();
        }
    }
}