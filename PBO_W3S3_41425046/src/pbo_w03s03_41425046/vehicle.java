/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class Vehicle { //Super class

    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass
class Car extends Vehicle {

    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class vehicle {

    public static void main(String[] args) {
        Car obj = new Car();
    }
}