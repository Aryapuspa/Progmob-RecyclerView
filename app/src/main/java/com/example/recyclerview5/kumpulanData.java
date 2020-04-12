package com.example.recyclerview5;

public class kumpulanData {
    String nama, isi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public kumpulanData(String nama, String isi) {
        this.nama = nama;
        this.isi = isi;
    }

    public kumpulanData() {
    }
}
