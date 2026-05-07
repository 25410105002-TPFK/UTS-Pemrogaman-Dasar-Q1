import java.util.Scanner;

public class UTS_PD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahHari;
        do {
            System.out.print("Masukkan jumlah hari (minimal 7 hari): ");
            jumlahHari = input.nextInt();
            if (jumlahHari < 7) {
                System.out.println(" Jumlah hari minimal 7!!!");
            }
        } while (jumlahHari < 7);

        int[] penjualan = new int[jumlahHari];

        System.out.println("Input Jumlah Penjualan");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Penjualan hari ke-" + (i + 1) + ": ");
            penjualan[i] = input.nextInt();
        }

        int idxTertinggi = 0;
        int idxTerendah = 0;
        for (int i = 1; i <jumlahHari; i++) {
            if (penjualan[i] > penjualan[idxTertinggi]) idxTertinggi = i;
            if (penjualan[i] < penjualan[idxTerendah]) idxTerendah = i;
        }

        // Menampilkan Hasil
        System.out.println("================");
        System.out.println("LAPORAN PENJUALAN");
        System.out.println("================");

        for (int i = 0; i < jumlahHari; i++) {
            String kondisi;
            if (penjualan[i] >= 100) {
                kondisi = "Ramai";
            } else if (penjualan[i] >= 50) {
                kondisi = "Cukup";
            } else {
                kondisi = "Sepi";
            }
            System.out.println("Hari ke-" + (i + 1) + " | Penjualan: " + penjualan[i] + " | Kondisi: " + kondisi);
        }
        
        input.close();
    }
}
