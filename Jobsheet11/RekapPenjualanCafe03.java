package PraktikumDaspro.Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe03 {

    // Fungsi input data penjualan 
    public static void inputData(int[][] penjualan, String[] menu, int hari) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }

    // Fungsi menampilkan tabel
    public static void tampilData(int[][] penjualan, String[] menu, int hari) {
        System.out.println("\n=== Tabel Penjualan ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= hari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < hari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu penjualan tertinggi
    public static void menuTertinggi(int[][] penjualan, String[] menu, int hari) {
        int maxTotal = -1;
        int indexMenu = 0;
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < hari; j++) {
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

    // Fungsi rata-rata per menu
    public static void rataRataMenu(int[][] penjualan, String[] menu, int hari) {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < hari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) hari;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah menu
        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine(); // membersihkan buffer
        // Input menu
        String[] menu = new String[jmlMenu];
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        // Input jumlah hari
        System.out.print("Masukkan jumlah hari penjualan: ");
        int hari = sc.nextInt();
        // Array 2D disesuaikan dengan input user
        int[][] penjualan = new int[jmlMenu][hari];

        inputData(penjualan, menu, hari);
        tampilData(penjualan, menu, hari);
        menuTertinggi(penjualan, menu, hari);
        rataRataMenu(penjualan, menu, hari);

        sc.close();
    }
}
