package PraktikumDaspro.Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe03 {

    // Fungsi untuk input data penjualan 5 menu × 7 hari
    public static void inputData(int[][] penjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }

    // Fungsi menampilkan semua data penjualan dalam bentuk tabel
    public static void tampilData(int[][] penjualan, String[] menu) {
        System.out.println("\n=== Tabel Penjualan ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu dengan total penjualan tertinggi
    public static void menuTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = -1;
        int indexMenu = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }
        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[indexMenu] + " (Total: " + maxTotal + ")");
    }

    // Fungsi menghitung rata-rata tiap menu
    public static void rataRataMenu(int[][] penjualan, String[] menu) {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {

        String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
        int[][] penjualan = new int[5][7]; // 5 menu dan 7 hari
        // Input data
        inputData(penjualan, menu);
        // Tampilkan tabel penjualan
        tampilData(penjualan, menu);
        // Tampilkan menu dengan penjualan tertinggi
        menuTertinggi(penjualan, menu);
        // Tampilkan rata-rata tiap menu
        rataRataMenu(penjualan, menu);
    }
}
