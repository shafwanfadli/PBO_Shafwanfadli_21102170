package com.Shafwan.PBO.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.printf("Looping For... ("+i+")");
        }
        System.out.printf("Looping For selesai!");

    //  Looping while
        int j=1;
        while (j<=100){
            System.out.printf("Looping While... ("+j+")");
            j+=10;
        }
        System.out.printf("Looping While selesai!");

    //  looping do while
        int k=10;
        do {
            System.out.printf("Looping do while... ("+k+")");
            k--;
        }
        while (k>0);
        System.out.printf("Looping do while selesai");
    }
}
