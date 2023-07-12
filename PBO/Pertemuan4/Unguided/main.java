package com.Shafwan.PBO.Pertemuan4.Unguided;

public class main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        boolean pilih = true;
        while (pilih) {
            System.out.println("===== OWANG RENTAL =====");
            System.out.println("1. Rental Mobil");
            System.out.println("2. Rental Motor");
            System.out.println("3. Tampilkan Daftar Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("\n===== RENTAL MOBIL =====\n");
                    System.out.print("Merk Mobil: ");
                    String judulFiksi = scanner.nextLine();
                    System.out.print("Warna Mobil: ");

                    String pengarangFiksi = scanner.nextLine();
                    System.out.print("Durasi Peminjaman: ");
                    String genreFiksi = scanner.nextLine();

                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi,

                            pengarangFiksi, genreFiksi);
                    perpustakaan.tambahBuku(bukuFiksi);

                    System.out.println("Berhasil Order Rental Mobil\n");

                    break;
                case 2:
                    System.out.print("\n===== Rental Motor =====\n");
                    System.out.print("Merk Motor: ");
                    String judulNonFiksi = scanner.nextLine();
                    System.out.print("Warna Motor: ");

                    String pengarangNonFiksi = scanner.nextLine();
                    System.out.print("Durasi Peminjaman: ");
                    String subjekNonFiksi = scanner.nextLine();

                    BukuNonFiksi bukuNonFiksi = new

                            BukuNonFiksi(judulNonFiksi, pengarangNonFiksi, subjekNonFiksi);
                    perpustakaan.tambahBuku(bukuNonFiksi);
                    System.out.println("Berhasil Order Rental Motor\n");
                    break;
                case 3:
                    perpustakaan.tampilkanDaftarBuku();

                    break;
                case 4:
                    pilih = false;

                    System.out.println("Silahkan pesan!.");

                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih
                            lagi!\n");
                    break;
            }
        }
    }
}
