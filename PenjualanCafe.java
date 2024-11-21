import java.util.Scanner;

public class PenjualanCafe {
    int[][] penjualan = new int[5][7];  // Array untuk penjualan [menu][hari]
    String[] menu = {"Kopi      ", "Teh       ", "Es Degan  ", "Roti Bakar", "Gorengan  "};

    // Fungsi untuk menambah data penjualan
    public void inputPenjualan(int menuIndex, int hari, int jumlah) {
        penjualan[menuIndex][hari - 1] = jumlah;
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public void tampilkanPenjualan() {
        System.out.println("Menu      \tHari ke 1\tHari ke 2\tHari ke 3\tHari ke 4\tHari ke 5\tHari ke 6\tHari ke 7");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public void menuPenjualanTertinggi() {
        String menuTertinggi = "";
        int maxPenjualan = 0;
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan
    public void rataRataPenjualan() {
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println("Rata-rata penjualan untuk " + menu[i] + " adalah " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PenjualanCafe cafe = new PenjualanCafe();

        System.out.println("Masukkan data penjualan untuk 5 menu selama 7 hari:");
        for (int i = 0; i < cafe.penjualan.length; i++) {
            for (int j = 0; j < cafe.penjualan[i].length; j++) {
                System.out.print("Masukkan penjualan untuk " + cafe.menu[i] + " pada Hari ke-" + (j + 1) + ": ");
                cafe.penjualan[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan data penjualan setelah diinput
        System.out.println("\nData penjualan yang dimasukkan:");
        cafe.tampilkanPenjualan();

        // Menampilkan menu dengan penjualan tertinggi
        cafe.menuPenjualanTertinggi();

        // Menampilkan rata-rata penjualan
        cafe.rataRataPenjualan();

        scanner.close();
    }
}
