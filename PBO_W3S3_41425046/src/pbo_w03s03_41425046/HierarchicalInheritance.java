/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class VehicleHI {

    VehicleHI() {
        System.out.println("This is a Vehicle");
    }
}

class CarHI extends VehicleHI {

    CarHI() {
        System.out.println("This Vehicle is Car");
    }
}

class BusHI extends VehicleHI {

    BusHI() {
        System.out.println("This Vehicle is Bus");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        CarHI obj1 = new CarHI();
        BusHI obj2 = new BusHI();
    }
}