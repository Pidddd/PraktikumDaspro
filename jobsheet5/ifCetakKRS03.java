import java.util.Scanner;

public class ifCetakKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        pesan= (uktLunas) ?"Pembayaran UKT Terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA"
        :"Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.print(pesan);
        sc.close();
    }
}