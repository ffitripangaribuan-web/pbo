/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
public class Geeks {
    String name;
    float price;

    void set(String n, float p) {
        name = n;
        price = p;
    }

    void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String args[]) {
        Geeks obj = new Geeks();   // membuat objek dengan new
        obj.set("Visual studio", 0.0f);
        obj.get();
    }
}