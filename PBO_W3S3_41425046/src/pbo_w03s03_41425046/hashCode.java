/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
public class hashCode {
    
    int roll; // Field to hold the roll number
    
    @Override
    public int hashCode() {
        return roll; // Returns the roll number as the hash code
    }
    
    public static void main(String[] args) {
        hashCode s1 = new hashCode(); // Creating the first object[cite: 4]
        s1.roll = 101;
        
        hashCode s2 = new hashCode(); // Creating the second object[cite: 4]
        s2.roll = 102;
        
        System.out.println("HashCode s1: " + s1.hashCode()); // Printing hashCode for s1[cite: 4]
        System.out.println("HashCode s2: " + s2.hashCode()); // Printing hashCode for s2[cite: 4]
    }
}