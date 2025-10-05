import java.util.Scanner;

public class aksesWIFI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pengguna;
        int sks = 0;

        System.out.print("Masukkan tipe pengguna (1=Dosen / 2=Mahasiswa): ");
        pengguna = sc.nextInt();

        switch (pengguna) {
            case 1:
                System.out.println("Akses WIFI Diberikan (Dosen)");
                break;

            case 2:
                System.out.print("Masukkan jumlah SKS: ");
                sks = sc.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses WIFI Diberikan (Mahasiswa Aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
                break;

            default:
                System.out.println("Akses Ditolak (Tipe pengguna tidak dikenal)");
        }

        sc.close();
    }
}
