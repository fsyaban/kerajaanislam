package com.fachrul.kerajaanislam;

public class List {
    private String nama;
    private String tahun;
    private String tempat;
    private int gambar;




    public List(String nama, String tahun, String tempat, int gambar) {
        this.nama = nama;
        this.tahun = tahun;
        this.tempat = tempat;
        this.gambar = gambar;

    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
}
