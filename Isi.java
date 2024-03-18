package com.example.myapplication;

public class Isi {
    String nama;
    String nim;
    int gambar;

    public Isi(String name, String nim, int image) {
        this.nama = name;
        this.nim = nim;
        this.gambar = image;
    }

    public String getName() {
        return nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return gambar;
    }

    public void setImage(int image) {
        this.gambar = image;
    }
}