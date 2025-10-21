import java.util.Scanner;

public class CM1_AhmadRafidRiqkullah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Deklarasi ---
        String nama, nim, kelas, Status1, Status2, grade1, grade2, statSMT;
        int UTS1, UAS1, tugas1, UTS2, UAS2, tugas2;
        double nilaiAkhir1, nilaiAkhir2, nilaiAkhirRR;

        // --- Deklarasi Tambahan ---
        String kodeClass, statLulusClass;

        // --- Input Menginput ---
        System.out.println(" === Input Data Mahasiswa ===");
        System.out.print("Masukkan Nama Anda\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();

        // --- Input Tambahan ---
        System.out.print("Pilih Kode Kelas  \n 1. Reguler\n 2. Profesional\n 3. FastTrack\nMasukkan Kelas\t: ");
        kodeClass = sc.nextLine();

        System.out.println("\n --- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS Matkul 1\t: ");
        UTS1 = sc.nextInt();
        System.out.print("Nilai UAS Matkul 1\t: ");
        UAS1 = sc.nextInt();
        System.out.print("Nilai Tugas Matkul 1\t: ");
        tugas1 = sc.nextInt();

        System.out.println("\n --- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS Matkul 2\t: ");
        UTS2 = sc.nextInt();
        System.out.print("Nilai UAS Matkul 2\t: ");
        UAS2 = sc.nextInt();
        System.out.print("Nilai Tugas Matkul 2\t: ");
        tugas2 = sc.nextInt();

        // --- Menghitung Rata rata Nilai dan Rata rata Nilai akhirnya ---
        nilaiAkhir1 = (UTS1 * 0.3) + (UAS1 * 0.4) + (tugas1 * 0.3);
        nilaiAkhir2 = (UTS2 * 0.3) + (UAS2 * 0.4) + (tugas2 * 0.3);
        nilaiAkhirRR = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // --- Menentukan Grade ---
        if (nilaiAkhir1 > 80) {
            grade1 = ("A");
        } else if (nilaiAkhir1 > 73) {
            grade1 = ("B+");
        } else if (nilaiAkhir1 > 65) {
            grade1 = ("B");
        } else if (nilaiAkhir1 > 60) {
            grade1 = ("C+");
        } else if (nilaiAkhir1 > 50) {
            grade1 = ("C");
        } else if (nilaiAkhir1 > 39) {
            grade1 = ("D");
        } else {
            grade1 = ("E");
        }

        if (nilaiAkhir2 > 80) {
            grade2 = ("A");
        } else if (nilaiAkhir2 > 73) {
            grade2 = ("B+");
        } else if (nilaiAkhir2 > 65) {
            grade2 = ("B");
        } else if (nilaiAkhir2 > 60) {
            grade2 = ("C+");
        } else if (nilaiAkhir2 > 50) {
            grade2 = ("C");
        } else if (nilaiAkhir2 > 39) {
            grade2 = ("D");
        } else {
            grade2 = ("E");
        }

        // --- Status Lulus / Tidak Lulus per Matkul ---
        if (nilaiAkhir1 >= 60) {
            Status1 = "Lulus";
        } else {
            Status1 = "Tidak Lulus";
        }

        if (nilaiAkhir2 >= 60) {
            Status2 = "Lulus";
        } else {
            Status2 = "Tidak Lulus";
        }

        // --- Status Semester ---
        if (Status1.equalsIgnoreCase("Lulus") && Status2.equalsIgnoreCase("Lulus")) {
            if (nilaiAkhirRR >= 70) {
                statSMT = "LULUS";
            } else {
                statSMT = "TIDAK LULUS";
            }
        } else {
            statSMT = "TIDAK LULUS";
        }

                // ---  Status Kelulusan Mahasiswa berdasarkan Kode Kelas ---
        if (kodeClass.equalsIgnoreCase("FastTrack")) {
            if (nilaiAkhirRR>=70){
                statLulusClass = ("lulus");
            }else{
                statLulusClass = ("Tidak Lulus");
            }
        }else if (kodeClass.equalsIgnoreCase("Profesional")) {
            if (nilaiAkhirRR>=65){
                statLulusClass = ("lulus");
            }else{
                statLulusClass = ("Tidak Lulus");
            }
        }else if (kodeClass.equalsIgnoreCase("Reguler")) {
            if (nilaiAkhirRR>=60){
                statLulusClass = ("lulus");
            }else{
                statLulusClass = ("Tidak Lulus");
            }
        }else{
            statLulusClass=("tidak lulus");
        }


        // --- Print Hasil ---
        System.out.println("\n===== Hasil Penilaian Akademik =====");
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("NIM\t: " + nim);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\t\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println(
                "==============================================================================================");
        System.out.println(
                "Algoritma Pemrograman\t" + UTS1 + "\t" + UAS1 + "\t " + tugas1 + "\t\t"
                        + String.format("%.2f", nilaiAkhir1) + "\t\t"
                        + grade1 + "\t\t" + Status1);
        System.out.println(
                "Struktur Data\t" + "\t" + UTS2 + "\t" + UAS2 + "\t " + tugas2 + "\t\t"
                        + String.format("%.2f", nilaiAkhir2) + "\t\t"
                        + grade2 + "\t\t" + Status2);

        System.out.println("\nRata-rata Nilai Akhir\t: " + String.format("%.2f", nilaiAkhirRR));
        System.out.println("Status Semester\t\t: " + statSMT);
        System.out.println("Status Lulus Berdasarkan Kelas: "+ statLulusClass );

        sc.close();
    }

}