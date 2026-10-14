/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJEK;

/**
 *
 * @author ASUS
 */
class StudentHash {
    int roll;

    @Override
    public int hashCode() {
        return roll;
    }
}

public class hashCode_Method {
    public static void main(String[] args) {
        StudentHash s1 = new StudentHash();
        s1.roll = 101;

        StudentHash s2 = new StudentHash();
        s2.roll = 102;

        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
