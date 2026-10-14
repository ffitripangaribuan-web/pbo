
/**
 *
 * @author ASUS
 */
class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
    }
}

public class TUGAS1 {
    public static void main(String[] args) {
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Budi";
        mhs.nim = "12345";
        mhs.semester = 3;

        mhs.tampilkanInfo();
    }
}