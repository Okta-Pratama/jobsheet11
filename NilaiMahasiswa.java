import java.util.Scanner;

public class NilaiMahasiswa {
    int[][] nilaiMahasiswa = new int[5][7];  // Array untuk nilai mahasiswa [mahasiswa][tugas]
    String[] mahasiswa = {"Ahmad    ", "Budi     ", "Citra    ", "Dina     ", "Eka      "};

    // Fungsi untuk menambah data nilai mahasiswa
    public void inputNilaiMahasiswa(int mahasiswaIndex, int tugas, int nilai) {
        nilaiMahasiswa[mahasiswaIndex][tugas - 1] = nilai;
    }

    // Fungsi untuk menampilkan seluruh data nilai mahasiswa
    public void tampilkanNilaiMahasiswa() {
        System.out.println("Mahasiswa \tTugas 1\tTugas 2\tTugas 3\tTugas 4\tTugas 5\tTugas 6\tTugas 7");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + "\t");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    public void mahasiswaNilaiTertinggi() {
        String mahasiswaTertinggi = "";
        int maxNilai = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                mahasiswaTertinggi = mahasiswa[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mahasiswaTertinggi + " dengan total nilai " + maxNilai);
    }

    // Fungsi untuk menampilkan rata-rata nilai mahasiswa
    public void rataRataNilai() {
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            double rataRata = totalNilai / 7.0;
            System.out.println("Rata-rata nilai untuk " + mahasiswa[i] + " adalah " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilai = new NilaiMahasiswa();

        System.out.println("Masukkan nilai mahasiswa untuk 5 mahasiswa selama 7 tugas:");
        for (int i = 0; i < nilai.nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilai.nilaiMahasiswa[i].length; j++) {
                System.out.print("Masukkan nilai untuk " + nilai.mahasiswa[i] + " pada Tugas ke-" + (j + 1) + ": ");
                nilai.nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan data nilai mahasiswa setelah diinput
        System.out.println("\nData nilai mahasiswa yang dimasukkan:");
        nilai.tampilkanNilaiMahasiswa();

        // Menampilkan mahasiswa dengan nilai tertinggi
        nilai.mahasiswaNilaiTertinggi();

        // Menampilkan rata-rata nilai mahasiswa
        nilai.rataRataNilai();

        scanner.close();
    }
}
