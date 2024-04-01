package model;

public class Celana implements Shopping{
    private String merk;
    private String ukuran;
    private double harga;

    public Celana(String merk, String ukuran, double harga){
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    @Override
    public String beli(){
        return "Celana merk " + merk + " ukuran " + ukuran + " berhasil dibeli";
    }

    @Override
    public String bayar(){
        return "Celana merk " + merk + " ukuran " + ukuran + " dibayar dengan diskon sebesar 10%";
    }

    @Override
    public double diskon(){
        return harga * 0.1;
    }

}
