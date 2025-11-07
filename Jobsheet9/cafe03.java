package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class cafe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar Menu dan Harga 
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        double[] hargaMenu = {
            15000, 12000, 10000,
            8000, 7000, 12000, 10000
        };

        //  Tampilkan Menu Kafe
        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + hargaMenu[i]);
        }

        // Input Jumlah Pelanggan 
        System.out.print("\nMasukkan jumlah pelanggan: ");
        int jumlahPelanggan = input.nextInt();
        input.nextLine();

        double[] totalPerPelanggan = new double[jumlahPelanggan];
        String[] daftarPesanan = new String[jumlahPelanggan];

        double totalPendapatan = 0;

        for (int p = 0; p < jumlahPelanggan; p++) {
            System.out.println("\n=== Pelanggan ke-" + (p + 1) + " ===");
            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan = input.nextInt();
            input.nextLine();

            String dataPesanan = "";
            double totalBiaya = 0;

            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan nomor menu pesanan ke-" + (i + 1) + ": ");
                int pilihan = input.nextInt();
                input.nextLine();

                // Cek validasi input menu
                if (pilihan >= 1 && pilihan <= menu.length) {
                    dataPesanan += (i + 1) + ". " + menu[pilihan - 1] + " - Rp " + hargaMenu[pilihan - 1] + "\n";
                    totalBiaya += hargaMenu[pilihan - 1];
                } else {
                    dataPesanan += (i + 1) + ". [Menu tidak valid]\n";
                }
            }

            daftarPesanan[p] = dataPesanan;
            totalPerPelanggan[p] = totalBiaya;
            totalPendapatan += totalBiaya;
        }

        System.out.println("\n\n=== LAPORAN PENJUALAN KAFE ===");
        for (int p = 0; p < jumlahPelanggan; p++) {
            System.out.println("\n--- Pelanggan ke-" + (p + 1) + " ---");
            System.out.print(daftarPesanan[p]);
            System.out.println("Total biaya pelanggan ke-" + (p + 1) + ": Rp " + totalPerPelanggan[p]);
        }

        System.out.println("\n===============================");
        System.out.println("Total pendapatan dari semua pelanggan: Rp " + totalPendapatan);

        input.close();
    }
}
