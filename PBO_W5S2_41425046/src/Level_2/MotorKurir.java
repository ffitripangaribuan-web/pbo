/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * edit this template
 */

package Level_2;

/*
 * Nama : Fitri Pangaribuan
 * NIM : 41425046
 * Nama Program : Motor Kurir
 */

/**
 * Class MotorKurir merupakan turunan dari KendaraanEkspedisi.
 *
 * Class ini sengaja tidak mengimplementasikan method
 * angkutBarang() untuk melihat error dari abstract class.
 *
 * @author ASUS
 */
public class MotorKurir extends KendaraanEkspedisi {

    // Constructor MotorKurir
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    /*
     * Method angkutBarang() sengaja tidak dibuat.
     * Karena KendaraanEkspedisi memiliki abstract method,
     * maka NetBeans akan memberikan tanda error.
     */
}