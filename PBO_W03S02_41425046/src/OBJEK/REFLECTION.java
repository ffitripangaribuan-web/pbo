/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

/**
 *
 * @author ASUS
 */
class Student { // Definisi kelas Student dengan default constructor
    public Student() {}
}

public class REFLECTION {
    public static void main(String[] args) {
        try {
            // Menggunakan nama lengkap class beserta package-nya ("OBJEK.Student")
            Class<?> c = Class.forName("OBJEK.Student");
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}