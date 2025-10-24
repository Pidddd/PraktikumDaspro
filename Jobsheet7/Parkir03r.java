import java.util.Scanner;

public class Parkir03r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis = -1, durasi, total = 0; 

        System.out.println("=== Program Penghitung Pembayaran Parkir ===");
        System.out.println("Tarif: Mobil = Rp 3.000/jam | Motor = Rp 2.000/jam");
        System.out.println("Durasi > 5 jam dikenai tarif tetap Rp 12.500");
        System.out.println("---------------------------------------------");

        while (true) {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                // selesai, keluar dari loop
                break;
            }

            // cek jenis valid: harus 1 atau 2
            if (jenis == 1 || jenis == 2) {
                // input durasi
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Durasi > 5 jam → Tarif tetap Rp 12.500");
                } else {
                    if (jenis == 1) { // mobil
                        total += durasi * 3000;
                        System.out.println("Mobil - Tarif: Rp " + (durasi * 3000));
                    } else { // motor
                        total += durasi * 2000;
                        System.out.println("Motor - Tarif: Rp " + (durasi * 2000));
                    }
                }
            } else {
                // bukan 0, bukan 1, bukan 2 = input invalid
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 atau 2, atau 0 untuk keluar.");
            }
        }

        // Output
        System.out.println("\n=== TOTAL PEMBAYARAN HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + total);
        System.out.println("Selesai");

        sc.close();
    }
}
