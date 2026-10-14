/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

package bagian_c;

/*
Nama : Fitri Pangaribuan
NIM : 41425046
Nama Program : Member Discount
*/

public class memberdiscount implements Discountable {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}