package com.Shafwan.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan Class
        SepedaMotor honda = new SepedaMotor("Honda", "Cub 70", 45000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N max", 55000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vesmet", 75000000);

        /*
        //Mengisi nilai atribut object honda
        honda.merk = "Homda";
        honda.tipe = "Cub 70";
        honda.harga = 45000000;

        //Mengisi nilai atribut object yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "Yamaha N Max";
        yamaha.harga = 55000000;

        //Mengisi nilai atribut object vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Matic";
        vespa.harga = 75000000;


        */
        //Untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //Uji coba getter dan setter
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (sebelum) :" + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + "dengan tipe (setelah) :" + honda.getTipe());
    }
}
