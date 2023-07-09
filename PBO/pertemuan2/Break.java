package com.Shafwan.PBO.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100){
            System.out.printf("Looping... ("+ p +")");
            p += 10;

            if (p == 50) {
                System.out.printf("Udahlah bro! Ty");
                break;
            }
        }

    }
}
