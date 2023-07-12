package com.Shafwan.PBO.Pertemuan4.Unguided;

public class rentalmobil extends rental{
    protected String genre;
    public BukuFiksi(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
