package com.Shafwan.PBO.pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan nama anda :");
        String nama = input.nextLine();

        System.out.printf("Selamat pagi" + nama + "!");
    }
}
