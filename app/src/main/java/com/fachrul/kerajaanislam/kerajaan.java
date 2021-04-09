package com.fachrul.kerajaanislam;

public class kerajaan {
    private String kerajaan;
    private int gambar;

    public kerajaan(String kerajaan, int gambar) {
        this.kerajaan = kerajaan;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getKerajaan() {
        return kerajaan;
    }

    public void setKerajaan(String kerajaan) {
        this.kerajaan = kerajaan;
    }
}
