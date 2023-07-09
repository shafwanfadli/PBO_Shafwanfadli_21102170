package com.Shafwan.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiExeption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + "/" + bilangan2 + "=" + hasil);

        }
        //Multiple exception
        catch (ArithmeticException | InputMismatchException e){
            System.out.println(" Eror mek, tidak dapat diproses");
        }
        System.out.println("Proses sudah selesai mek");
    }
}
