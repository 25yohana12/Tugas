package model;

public class Baju implements Shopping {
    private String warna;
    private String ukuran;
    private double harga;

    public Baju(String warna, String ukuran, double harga) {
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    @Override
    public String beli() {
        return "Baju warna " + warna + " ukuran " + ukuran + " berhasil dibeli";
    }

    @Override
    public String bayar() {
        return "Baju warna " + warna + " ukuran " + ukuran + " Dibayar dengan diskon sebesar 30%";   
    }

    @Override
    public double diskon() {
        return harga * 0.3;
    }
}
