/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

/**
 *
 * @author ASUS
 */
public class Finalize_Method {
    public static void main(String[] args) {
        Finalize_Method t = new Finalize_Method();
        System.out.println(t.hashCode());

        t = null; // Menghapus referensi objek

        System.gc(); // Memanggil Garbage Collector

        System.out.println("end");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}