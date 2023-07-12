package com.Shafwan.PBO.Pertemuan4.Unguided;

public class rentalmotor extends rental{
    protected String subjek;
    public BukuNonFiksi(String judul, String pengarang, String subjek) {
        super(judul, pengarang);
        this.subjek = subjek;
    }
    public String getSubjek() {
        return subjek;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subjek: " + subjek);
    }
}
