/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class Geeks {

    // data members of the class
    String name;
    int id;

    // parameterized constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
        // This would invoke the parameterized constructor
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);
    }
}