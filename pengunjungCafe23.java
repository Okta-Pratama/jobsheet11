public class pengunjungCafe23 {

    public static void daftarPengunjung(int hariKunjungan, String... namaPengunjung) {
        System.out.println("Hari kunjungan ke-" + hariKunjungan);
        System.out.println("Daftar nama pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Dina", "Eka");
    }
}
