/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */

// Class Student sebagai blueprint
class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class Classblueprint {
    public static void main(String[] args) {
        // Membuat object s1 dari class Student
        Student s1 = new Student(10, "Alice");

        // Menampilkan properti object
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}