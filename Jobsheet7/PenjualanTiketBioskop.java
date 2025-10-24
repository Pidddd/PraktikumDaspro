import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiket = 0;
        double totalPenjualan = 0;
        double diskon = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            int jumlahTiket = sc.nextInt();

            // untuk ngecek
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                i--;
                continue;
            }

            // milih Diskon
            if (jumlahTiket > 10) {
                diskon = 0.15; // 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // 10%
            }

            // Hitung
            double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + totalHarga);

        }

        // Hasil akhir
        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);

        sc.close();
    }
}
