package com.Shafwan.PBO.pertemuan6;

import java.lang.reflect.Array;

public class tryCatch {
    public static void main(String[] args){
        //membuat array
        int[] nomor = {1,2,3,4,5};

        try {
            System.out.println(nomor[4]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arraynya melebihi batas!");
        }

        System.out.println("Proses selesai");
    }
}

