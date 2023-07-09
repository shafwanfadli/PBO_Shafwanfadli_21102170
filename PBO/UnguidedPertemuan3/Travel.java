package com.Shafwan.PBO.UnguidedPertemuan3;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args){
        DaftarPaket daftarPaket = new DaftarPaket();

        daftarPaket.tambahPaketTravel("Paket Jayyid", "Hotel  *4, PP pesawat Garuda",80000000);
        daftarPaket.tambahPaketTravel("Paket Jayyid Jiddan", "Hotel *4, PP pesawat Garuda, Liburan ke turkey", 100000000);
        daftarPaket.tambahPaketTravel("Paket Mumtaz", "Hotel *5, PP pesawat Garuda, Liburan ke turkey", 120000000);

        System.out.println("Daftar Paket Travel :");
        daftarPaket.tampilPaketTravel();

        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;
        System.out.println("Masukan nomor paket travel yang ingin dipesan (pisahkan dengan koma jika memilih lebih dari 1 paket !) :");
        String input = scanner.nextLine();
        String[] nomorPaketTravel = input.split(",");
        for (String nomor : nomorPaketTravel) {
            int index = Integer.parseInt(nomor) -1;
            totalHarga += daftarPaket.getPaketTravel(index).getHarga();
        }
        System.out.println("Total harga pesanan :" +totalHarga);
    }
}
