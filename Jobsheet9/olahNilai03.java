package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class olahNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahNilai;
        int[] nilai;
        int total = 0;
        double rataRata;
        int nilaiTertinggi, nilaiTerendah;

        // Input banyak mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahNilai = input.nextInt();

        // Inisialisasi array
        nilai = new int[jumlahNilai];

        // Input nilai mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Hitung 
        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        // Hitung rata-rata
        rataRata = (double) total / nilai.length;

        System.out.println("\n=== HASIL OLAH NILAI ===");
        System.out.print("Daftar nilai: ");
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
        }

        System.out.println("----------------------------");
        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);

        input.close();
    }
}
