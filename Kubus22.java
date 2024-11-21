import java.util.Scanner;

public class Kubus22 {
    private double sisi;

    public Kubus22(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        
        Kubus22 kubus = new Kubus22(sisi);
        
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
        
        scanner.close();
    }
}
