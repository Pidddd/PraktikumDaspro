package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();  // input jumlah mahasiswa

        int[] nilaiMhs = new int[jumlahMhs];
        double totalNilai = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            totalNilai += nilaiMhs[i]; // total semua nilai

            // Pisahkan nilai lulus dan tidak lulus
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        // Hitung rata-rata
        double rataNilai = totalNilai / jumlahMhs;
        double rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai keseluruhan = " + rataNilai);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        sc.close();
    }
}
