/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASS;

/**
 *
 * @author ASUS
 */
public class Inisialisasi_Objek {
    String name;
    String breed;
    int age;
    String color;

    // Constructor
    public Inisialisasi_Objek(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Method 1
    public String getName() {
        return name;
    }

    // Method 2
    public String getBreed() {
        return breed;
    }

    // Method 3
    public int getAge() {
        return age;
    }

    // Method 4
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Name is: " + this.getName() + 
               "\nBreed, age, and color are: " + 
               this.getBreed() + ", " + this.getAge() + ", " + this.getColor();
    }

    public static void main(String[] args) {
        // Inisialisasi Objek menggunakan operator new
        Inisialisasi_Objek tuffy = new Inisialisasi_Objek("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}