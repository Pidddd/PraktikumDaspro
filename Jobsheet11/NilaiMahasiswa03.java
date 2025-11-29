package PraktikumDaspro.Jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa03 {

    // a. Fungsi isianArray
    public static void isianArray(int[] arrayNilai) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
        sc.close();
    }

    // b. Fungsi tampilArray
    public static void tampilArray(int[] arrayNilai) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int nilai : arrayNilai) {
            System.out.println(nilai);
        }
    }

    // c. Fungsi hitTot
    public static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int nilai : arrayNilai) {
            total += nilai;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
