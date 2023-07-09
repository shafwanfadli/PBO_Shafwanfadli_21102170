package com.Shafwan.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println(bilangan1 + "/" + bilangan2 + "=" + hasil);

        }
        //Multiple catch eror info more detail
        catch (ArithmeticException e) {
            System.out.println("Eror : Tidak dapat diproses!");
        } catch (InputMismatchException e) {
            System.out.println("Eror : Masukan angka saja!");
        }
        System.out.println("Proses selesai!");
    }
}
