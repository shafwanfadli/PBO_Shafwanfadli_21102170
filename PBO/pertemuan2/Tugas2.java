package com.Shafwan.PBO.pertemuan2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan nama anda :");
        String nama = input.nextLine();

        System.out.printf("Masukan gaji anda :");
        double gaji = input.nextDouble();

        System.out.printf("Masukan tunjangan anda :");
        double tunjangan = input.nextDouble();

        double pajak = 7.65 / 100;
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * pajak;
        double gajiBersih = gajiKotor - pajakNegara;

        System.out.printf("Gaji yang diterima oleh" + nama + "adalah sebagai berikut:");
        System.out.printf("Gaji kotor :" + gajiKotor);
        System.out.printf("Pajak negara :" + pajakNegara);
        System.out.printf("Gaji bersih :" + gajiBersih);
        System.out.printf("Total gaji bersih dari %s yang diterima yaitu Rp.%.2f.", nama, gajiBersih);
    }
}
