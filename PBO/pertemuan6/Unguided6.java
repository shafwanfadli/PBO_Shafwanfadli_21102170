package com.Shafwan.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;

        while (!inputValid) {
            try {
            System.out.print("Masukan bilangan pertama :");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukan bilangan kedua :");
            int bilangan2 = scanner.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println("Hasil pembagian :" + hasil);
            inputValid = true;

        }catch(InputMismatchException e){
            System.out.println("Terjadi kesalahan: Input tidak valid, Harap masukan bilangan bulat.");
            scanner.nextLine();
            System.out.println();
        }catch(ArithmeticException e){
            System.out.println("Terjadi kesalahan: pembagian dengan nol tidak diperbolehkan.");
            scanner.nextLine();
            System.out.println();
        }
      }
    }
    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }
}
