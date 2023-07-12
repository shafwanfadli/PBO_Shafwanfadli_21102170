package com.Shafwan.PBO.Pertemuan4;

public class manajer extends pegawai{
    public void bonus(int bonus) {
        System.out.println("Pegawai atas nama : " + nama + " (" + nip + ") mendapat bonus sebesar " + bonus);
    }
    //polimorfism public void
    extraInfo() {
        System.out.println("Jabatan pegawai : Manajer");
    }
    public void bonus(){
        System.out.println("Error : harap masukan nominal bonus!");
    }
}
