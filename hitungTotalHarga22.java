import java.util.Scanner;

public class hitungTotalHarga22 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Kode promo: DISKON50, Anda mendapat diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Kode promo: DISKON30, Anda mendapat diskon 30%!");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHargaSemua = 0, totalSemuaPesanan = 0;

        while (true) {
            System.out.println("\nMasukkan nomor menu yang ingin anda pesan (1-6):");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak valid, silakan pilih menu antara 1-6.");
                continue;
            }

            System.out.println("Masukkan jumlah item yang ingin anda pesan:");
            int banyakItem = sc.nextInt();

            if (banyakItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
                continue;
            }

            System.out.println("Masukkan kode promo (jika ada):");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHargaSemua += totalHarga;

            System.out.println("Total harga sementara: Rp" + totalHargaSemua);

            System.out.println("\nApakah Anda ingin melanjutkan pesanan? (y/n):");
            char lanjut = sc.next().toLowerCase().charAt(0);
            
            totalSemuaPesanan += totalHargaSemua;
            if (lanjut == 'n') break;
        }

        System.out.println("\nTotal keseluruhan harga pesanan anda: Rp" + totalSemuaPesanan);

        sc.close();
    }
}
