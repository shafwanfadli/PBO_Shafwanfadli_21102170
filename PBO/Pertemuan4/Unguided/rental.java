package com.Shafwan.PBO.Pertemuan4.Unguided;

public class rental {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku dalam perpustakaan.");
        } else {
            System.out.println("\nDaftar Buku: ");
            for (Buku buku : daftarBuku) {
                buku.displayInfo();
                System.out.println("---------------------\n");
            }
}
