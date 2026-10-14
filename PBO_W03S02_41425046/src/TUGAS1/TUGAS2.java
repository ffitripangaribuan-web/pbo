/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

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
}

public class TUGAS2{
    public static void main(String[] args) {
        // 2. Mengisi data objek MahasiswaAktif
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Siti Rahma";
        mhs.nim = "11223344";
        mhs.semester = 4;

        // Menampilkan data objek ke konsol
        System.out.println("=== DATA MAHASISWA AKTIF ===");
        System.out.println("Nama     : " + mhs.nama);
        System.out.println("NIM      : " + mhs.nim);
        System.out.println("Semester : " + mhs.semester);
    }
}