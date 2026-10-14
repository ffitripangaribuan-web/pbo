package pbo_w03s03_41425046;

import java.io.*;

// Class harus implements Serializable agar objeknya bisa disimpan ke file
class StudentSer implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public StudentSer(String name) {
        this.name = name;
    }

    // Supaya saat dicetak tampil nama, bukan kode hash
    @Override
    public String toString() {
        return "Student{name=" + name + "}";
    }
}

class SerializationMain {

    public static void main(String[] args) {
        // Serialization: simpan objek ke file student.ser
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new StudentSer("Alice"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: baca file student.ser lalu jadikan objek lagi
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            StudentSer s = (StudentSer) in.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}