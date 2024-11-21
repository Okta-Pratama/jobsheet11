import java.util.Scanner;

public class percobaan5_22 {

    static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        return hitungLuas(a, b) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang:");
        int p = input.nextInt();
        System.out.println("Masukkan lebar:");
        int l = input.nextInt();
        System.out.println("Masukkan tinggi:");
        int t = input.nextInt();

        int L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        int vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        input.close();
    }
}
