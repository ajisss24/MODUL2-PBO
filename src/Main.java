import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private int umur;

    public void inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        nim = scanner.nextLine();
        while (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka. Silakan input kembali.");
            System.out.print("NIM: ");
            nim = scanner.nextLine();
        }

        System.out.print("Nama: ");
        nama = scanner.nextLine();

        System.out.print("Umur: ");
        umur = scanner.nextInt();
    }

    public void tampilDataMahasiswa() {
        System.out.println("\nDetail Mahasiswa:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void tampilUniversitas() {
        System.out.println("\nUniversitas Muhammadiyah Malang");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
        int jumlahMahasiswa = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampil Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    if (jumlahMahasiswa < 10) {
                        daftarMahasiswa[jumlahMahasiswa] = new Mahasiswa();
                        daftarMahasiswa[jumlahMahasiswa].inputDataMahasiswa();
                        jumlahMahasiswa++;
                    } else {
                        System.out.println("Maaf, sudah mencapai batas maksimum mahasiswa yang dapat diinputkan.");
                    }
                    break;
                case 2:
                    Mahasiswa.tampilUniversitas();
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        daftarMahasiswa[i].tampilDataMahasiswa();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}

