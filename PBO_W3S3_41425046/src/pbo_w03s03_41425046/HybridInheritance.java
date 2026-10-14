/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

/**
 *
 * @author ASUS
 */

// Parent class (paling atas), diwarisi oleh CarHY dan FareHY
class VehicleHY {

    // Constructor: dijalankan setiap kali objek turunan dibuat
    VehicleHY() {
        System.out.println("This is a Vehicle");
    }
}

// Child class dari VehicleHY (cabang kiri pada diagram)
class CarHY extends VehicleHY {

    CarHY() {
        // Constructor VehicleHY otomatis dipanggil lebih dulu lewat super()
        System.out.println("This Vehicle is Car");
    }
}

// Child class dari VehicleHY (cabang kanan pada diagram),
// sekaligus menjadi parent dari BusHY
class FareHY extends VehicleHY {

    FareHY() {
        System.out.println("Fare of Vehicle");
    }

    // Method untuk menampilkan tarif, akan diwarisi oleh BusHY
    void showFare() {
        System.out.println("Total Fare: Rp 50.000");
    }
}

// Child class dari FareHY (pewarisan bertingkat /