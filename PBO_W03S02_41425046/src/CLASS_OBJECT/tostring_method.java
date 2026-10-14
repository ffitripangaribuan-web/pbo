/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

/**
 *
 * @author ASUS
 */
class StudentObj {
    @Override
    public String toString() {
        return "Student object";
    }
}

public class ToString_method {
    public static void main(String[] args) {
        StudentObj s = new StudentObj(); // membuat objek Student
        System.out.println(s.toString()); // memanggil toString()
    }
}