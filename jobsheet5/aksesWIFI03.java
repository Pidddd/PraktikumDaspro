import java.util.Scanner;

public class aksesWIFI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int sks = 0;

        System.out.print("Masukkan tipe pengguna (Dosen/Mahasiswa): ");
        pengguna = sc.next();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WIFI Diberikan (Dosen)");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WIFI Diberikan (Mahasiswa Aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses Ditolak");
        }

        sc.close();
    }
}