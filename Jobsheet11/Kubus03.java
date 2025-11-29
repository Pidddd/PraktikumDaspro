package PraktikumDaspro.Jobsheet11;

import java.util.Scanner;

public class Kubus03 {

    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Masukkann Sisi: ");
        int sisi=sc.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus        : " + sisi);
        System.out.println("Volume kubus      : " + volume);
        System.out.println("Luas permukaan    : " + luasPermukaan);

        sc.close();
    }
}
