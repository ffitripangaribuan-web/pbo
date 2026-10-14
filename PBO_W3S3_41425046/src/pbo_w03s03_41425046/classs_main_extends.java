/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s03_41425046;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */

// Class ini mewarisi (extends) JFrame, yaitu class dasar untuk membuat jendela di Swing
// Nama class public harus sama dengan nama file (classs_main_extends.java)
public class classs_main_extends extends JFrame {

    // Constructor: di sinilah tampilan (GUI) dibuat
    public classs_main_extends() {
        // Membuat tombol dengan tulisan "Click Me"
        JButton button = new JButton("Click Me");

        // Menentukan aksi saat tombol diklik memakai lambda (anonymous object)
        button.addActionListener(event -> System.out.println("Button clicked!"));

        // Menambahkan tombol ke jendela (di BorderLayout default, otomatis memenuhi jendela)
        add(button);

        // Mengatur judul jendela
        setTitle("Contoh Button");

        // Mengatur ukuran jendela 300 x 200
        setSize(300, 200);

        // Program berhenti saat jendela ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menaruh jendela di tengah layar
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Menjalankan GUI di thread khusus Swing (cara yang disarankan)
        SwingUtilities.invokeLater(() -> {
            classs_main_extends frame = new classs_main_extends();
            // Menampilkan jendela
            frame.setVisible(true);
        });
    }
}