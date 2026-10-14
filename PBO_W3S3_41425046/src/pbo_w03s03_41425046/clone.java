/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
public class clone implements Cloneable {
    
    private String t;
    
    public clone(String t) {
        this.t = t;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();[cite: 8]
    }
    
    public String getTitle() {
        return t;[cite: 8]
    }
    
    public static void main(String[] args) {
        try {
            clone b1 = new clone("Java Basics");[cite: 8]
            clone b2 = (clone) b1.clone();[cite: 8]
            
            System.out.println("Judul buku b1: " + b1.getTitle());[cite: 8]
            System.out.println("Judul buku b2: " + b2.getTitle());[cite: 8]
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2));[cite: 8]
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();[cite: 8]
        }
    }
}