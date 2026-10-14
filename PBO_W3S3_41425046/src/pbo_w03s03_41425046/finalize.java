/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
public class finalize {
    
    public static void main(String[] args) {
        finalize t = new finalize();
        System.out.println(t.hashCode());[cite: 6]
        
        t = null;[cite: 6]
        
        System.gc();[cite: 6]
        
        System.out.println("end");[cite: 6]
    }
    
    @Override
    protected void finalize() {
        System.out.println("finalize method called");[cite: 6]
    }
}