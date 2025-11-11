package PraktikumDaspro.Jobsheet10;

import java.util.Scanner;

public class SurveiKepuasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Jumlah responden dan jumlah pertanyaan
        int JUMLAH_RESPONDEN = 10;
        int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        System.out.println("=== Input Nilai Survei Kepuasan Pelanggan ===");
        System.out.println("(Isi Pertanyaan antara 1 - 5)");

        // (a) Input nilai survei
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("Pertanyaan " + (j + 1) + "(1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println(" Nilai harus antara 1 dan 5!");
                    }
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }

        System.out.println("\n=== Hasil Analisis Survei ===");

        // (b) Rata-rata setiap responden
        System.out.println("\nRata-rata per Responden:");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double total = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                total += survei[i][j];
            }
            double rata = total / JUMLAH_PERTANYAAN;
            System.out.println("Responden " + (i + 1) + ": " + String.format("%.2f", rata));
        }

        // (c) Rata-rata setiap pertanyaan
        System.out.println("\nRata-rata per Pertanyaan:");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double total = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                total += survei[i][j];
            }
            double rata = total / JUMLAH_RESPONDEN;
            System.out.println("Pertanyaan " + (j + 1) + ": " + String.format("%.2f", rata));
        }

        // (d) Rata-rata keseluruhan
        double totalKeseluruhan = 0;
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
        System.out.println("\nRata-rata Keseluruhan: " + String.format("%.2f", rataKeseluruhan));

        sc.close();
    }
}
