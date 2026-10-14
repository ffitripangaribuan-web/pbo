/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class GeeksOverload {

    // constructor with one argument
    GeeksOverload(String name) {
        System.out.println("Constructor with one "
                + "argument - String: " + name);
    }

    // constructor with two arguments
    GeeksOverload(String name, int age) {
        System.out.println(
                "Constructor with two arguments: "
                + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different type
    GeeksOverload(long id) {
        System.out.println(
                "Constructor with one argument: "
                + "Long: " + id);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        GeeksOverload geek2 = new GeeksOverload("Sweta");

        GeeksOverload geek3 = new GeeksOverload("Amiya", 28);

        GeeksOverload geek4 = new GeeksOverload(325614567);
    }
}