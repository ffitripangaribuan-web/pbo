/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
public class geeks_implements {
    
    // Menggunakan inner class agar sesuai dengan potongan kode Anda
    static class Geeks implements Cloneable {
        String name = "GeeksForGeeks";

        @Override // method 1
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); // Super() mengacu ke parent class
        }
    }

    public static void main(String[] args) // Method 2
    {
        Geeks o1 = new Geeks();

        try {
            Geeks o2 = (Geeks) o1.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}