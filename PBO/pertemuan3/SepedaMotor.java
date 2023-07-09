package com.Shafwan.PBO.pertemuan3;

public class SepedaMotor {
    // Atributs
    private String merk;
    private String tipe;
    private int harga;

    //Constructor
    public SepedaMotor(){}

    //Constructor baru
    public SepedaMotor(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    //Method getter dan setter
    public String getMerk(){
        return merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //Method
    public void showInfo(){
        System.out.println("Merk :" + merk);
        System.out.println("Tipe :" + tipe);
        System.out.println("Harga :" + harga);
        System.out.println();
    }
}
