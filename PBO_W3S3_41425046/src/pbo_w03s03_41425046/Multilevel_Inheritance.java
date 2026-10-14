/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */
class VehicleML {

    VehicleML() {
        System.out.println("This is a Vehicle");
    }
}

class FourWheeler extends VehicleML {

    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

class CarML extends FourWheeler {

    CarML() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Multilevel_Inheritance {

    public static void main(String[] args) {
        CarML obj = new CarML();
    }
}