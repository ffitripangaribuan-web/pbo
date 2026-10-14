public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUts;
    private String gradeHuruf; // Read-only property

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Read-only getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Read-only getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Read-only getter untuk Grade Huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    // Setter untuk Nilai Kuis dengan validasi dan kalkulasi otomatis grade
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGradeHuruf();
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Setter untuk Nilai UTS dengan validasi dan kalkulasi otomatis grade
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts >= 0.0 && nilaiUts <= 100.0) {
            this.nilaiUts = nilaiUts;
            System.out.println("[Update] Nilai uts berhasil diubah menjadi: " + nilaiUts);
            hitungGradeHuruf();
        } else {
            System.out.println("[Error] Nilai uts tidak valid: " + nilaiUts + " (Harus antara 0 - 100)");
        }
    }

    // Internal private method untuk kalkulasi grade huruf berdasarkan nilai akhir
    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80) {
            this.gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            this.gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            this.gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    // Metode menghitung nilai akhir (40% Kuis + 60% UTS)
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUts);
    }

    // Metode cetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Nilai Kuis: " + nilaiKuis);
        System.out.println("Nilai UTS : " + nilaiUts);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade     : " + gradeHuruf);
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("1425111", "Marsha");
        System.out.println("Registrasi: Berhasil mendaftarkan mahasiswa: " + student.getNim() + " - " + student.getNama());
        
        student.setNilaiKuis(110.0); // Akan memicu error
        student.setNilaiKuis(85.0);
        student.setNilaiUts(90.0);
        
        System.out.println();
        student.cetakLaporan();
    }
}