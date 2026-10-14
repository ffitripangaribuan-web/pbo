/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

package bagian_c;

/*
Nama : Fitri Pangaribuan
NIM : 41425046
Nama Program : Vehicle Rental
*/

public class vehiclerental {

    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    public vehiclerental(String plateNumber, double rate) {

        if (plateNumber == null || plateNumber.isEmpty()) {
            throw new IllegalArgumentException(
                "Nomor plat tidak boleh kosong"
            );
        }

        if (rate < 0) {
            throw new IllegalArgumentException(
                "Harga sewa tidak boleh negatif"
            );
        }

        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    public void setRentalDays(int days) {

        if (days <= 0) {
            throw new IllegalArgumentException(
                "Jumlah hari harus lebih dari 0"
            );
        }

        this.rentalDays = days;
    }

    public double getTotalCost(Discountable discount) {

        double amount = rentalRatePerDay * rentalDays;

        double discountAmount =
                discount.calculateDiscount(amount);

        return amount - discountAmount;
    }
}