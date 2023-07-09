package com.Shafwan.PBO.pertemuan2;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        String username = "Shafwan";
        String password = "123";

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Masukan username :");
        String inputUsername = scanner.nextLine();
        System.out.printf("Masukan password :");
        String inputPassword = scanner.nextLine();

        if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.printf("Silahkan login dengan username dan password yang sah!");
        } else if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.printf("Login berhasil! Silahkan masuk");
        } else {
            System.out.printf("Username dan password anda salah!");

        }
    }
}
