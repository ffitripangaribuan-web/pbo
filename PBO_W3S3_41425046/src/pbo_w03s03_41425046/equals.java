package pbo_w03s03_41425046;

public class equals {

    // Atribut nomor absen, dipakai sebagai dasar perbandingan
    int roll;

    // Override method equals() bawaan Object agar membandingkan isi (roll), bukan alamat memori
    @Override
    public boolean equals(Object o) {
        // Cek apakah objek yang dibandingkan bertipe equals_method
        if (o instanceof equals_method) {
            // Bandingkan nilai roll milik objek ini dengan milik objek o
            return this.roll == ((equals_method) o).roll;
        }
        // Jika bukan bertipe equals_method, dianggap tidak sama
        return false;
    }

    public static void main(String[] args) {
        // Objek pertama dengan roll 101
        equals_method s1 = new equals_method();
        s1.roll = 101;

        // Objek kedua dengan roll 101 (isi sama dengan s1)
        equals_method s2 = new equals_method();
        s2.roll = 101;

        // Objek ketiga dengan roll 102 (isi berbeda)
        equals_method s3 = new equals_method();
        s3.roll = 102;

        // Membandingkan s1 dengan s2 dan s3 memakai equals()
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
    }
}