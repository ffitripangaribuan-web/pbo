/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class GeeksCopy {

    String name;
    int id;

    // Parameterized Constructor
    GeeksCopy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    GeeksCopy(GeeksCopy obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        System.out.println("First Object");
        GeeksCopy geek1 = new GeeksCopy("Sweta", 68);
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);

        System.out.println();

        GeeksCopy geek2 = new GeeksCopy(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName: " + geek2.name
                + " and GeekId: " + geek2.id);
    }
}