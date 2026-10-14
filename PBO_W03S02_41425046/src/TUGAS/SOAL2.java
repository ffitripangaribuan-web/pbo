/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author ASUS
 */
// Superclass: Mahasiswa Biasa
class MahasiswaBiasa {
    String nama;
    String nim;
}

// Subclass: Mahasiswa Aktif mewarisi Mahasiswa Biasa
class MahasiswaAktif extends MahasiswaBiasa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang aktif belajar di semester " + semester);
    }
}

public class SOAL2 {
    public static void main(String[] args) {
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Andi";
        mhs.nim = "12345678";
        mhs.semester = 3;

        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Semester: " + mhs.semester);
        
        mhs.belajar();
    }
}