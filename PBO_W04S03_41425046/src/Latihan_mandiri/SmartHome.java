/*
Nama : Fitri Pangaribuan
NIM : 41425046
Nama Program : Smart Home System
*/

package SmartHome;

// Interface untuk fitur sakelar
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface untuk fitur konektivitas jaringan
interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

// Kelas SmartLamp mengimplementasikan Switchable & Connectable
class SmartLamp implements Switchable, Connectable {

    private boolean isOn = false;
    private int brightness;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(
            "[Lampu Pintar] Menyala dengan kecerahan "
            + brightness + "%"
        );
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        if (!isOn) {
            System.out.println(
                "[Error] Gagal koneksi WiFi: Lampu masih mati!"
            );
            return;
        }

        System.out.println(
            "[WiFi Device] Terhubung ke jaringan: "
            + ssid + " (IP: " + ipAddress + ")"
        );
    }
}

// Kelas SmartAC mengimplementasikan Switchable & Connectable
class SmartAC implements Switchable, Connectable {

    private boolean isOn = false;
    private int temperature;

    public SmartAC(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(
            "[AC Pintar] Menyalakan pada suhu "
            + temperature + " °C"
        );
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        if (!isOn) {
            System.out.println(
                "[Error] Gagal koneksi WiFi: AC masih mati!"
            );
            return;
        }

        System.out.println(
            "[WiFi Device] Terhubung ke jaringan: "
            + ssid + " (IP: " + ipAddress + ")"
        );
    }
}

// Kelas utama Smart Home
public class SmartHomeSystem {

    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // Pengujian Smart Lamp
        lamp.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.10"
        );

        lamp.turnOn();

        lamp.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.10"
        );

        // Pengujian Smart AC
        ac.turnOn();

        ac.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.11"
        );

        ac.turnOff();
    }
}