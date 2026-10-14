/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

// Contoh penggunaan Anonymous Object (Objek Tanpa Nama) secara sederhana
interface TombolAksi {
    void klik();
}

public class OBJEK_ANONYMOUS {
    
    public static void cetakAksi(TombolAksi aksi) {
        aksi.klik(); // Memanggil method dari anonymous object
    }

    public static void main(String[] args) {
        // Contoh Anonymous Object: instansiasi interface langsung tanpa variabel acuan
        cetakAksi(new TombolAksi() {
            @Override
            public void klik() {
                System.out.println("Button clicked!");
            }
        });

        // Contoh lain anonymous object pada pembuatan objek langsung
        System.out.println("Panjang string: " + new String("Belajar Java").length());
    }
}