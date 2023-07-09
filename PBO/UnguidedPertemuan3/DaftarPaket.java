package com.Shafwan.PBO.UnguidedPertemuan3;

import java.util.ArrayList;

public class DaftarPaket {
    private ArrayList<PaketHajidanUmroh> daftarPaketTravel;

    public DaftarPaket(){
        daftarPaketTravel = new ArrayList<PaketHajidanUmroh>();
    }
    public void tambahPaketTravel(String namaPaket, String fasilitas, int harga){
        PaketHajidanUmroh paketHajidanUmroh = new PaketHajidanUmroh(namaPaket, fasilitas, harga);
        daftarPaketTravel.add(paketHajidanUmroh);
    }
    public void tampilPaketTravel(){
        for (int i = 0; i< daftarPaketTravel.size(); i++){
            PaketHajidanUmroh paketHajidanUmroh = daftarPaketTravel.get(i);
            System.out.println("Nomor Paket:" + (i+1));
            System.out.println("Nama Paket:" + paketHajidanUmroh.getNamaPaket());
            System.out.println("Fasilitas :" + paketHajidanUmroh.getFasilitas());
            System.out.println("Harga :" + paketHajidanUmroh.getHarga());
            System.out.println();
        }
    }
    public PaketHajidanUmroh getPaketTravel(int index) {
        return daftarPaketTravel.get(index);
    }
}
