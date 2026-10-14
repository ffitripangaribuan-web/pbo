package bagian_c;

/*
Nama : Fitri Pangaribuan
NIM : 41425046
Nama Program : Corporate Discount
*/

public class corporatediscount implements Discountable {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}