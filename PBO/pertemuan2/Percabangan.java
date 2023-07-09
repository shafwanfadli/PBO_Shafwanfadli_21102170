package com.Shafwan.PBO.pertemuan2;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan sebuah bilangan :");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.printf(bilangan + " adalah bilngan positif " );
        } else if (bilangan < 0) {
            System.out.printf(bilangan + " adalah bilangan negatif ");
        } else {
            System.out.printf(bilangan + " adalah bilangan 0 ");
        }
    }
}
