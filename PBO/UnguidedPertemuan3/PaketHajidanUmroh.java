package com.Shafwan.PBO.UnguidedPertemuan3;

public class PaketHajidanUmroh {
    private String namaPaket;
    private String fasilitas;
    private int harga;

    public PaketHajidanUmroh(String namaPaket, String fasilitas, int harga){
        this.namaPaket = namaPaket;
        this.fasilitas = fasilitas;
        this.harga = harga;
    }
    //accessor

    public String getNamaPaket() {
        return namaPaket;
    }
    //mutator

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
