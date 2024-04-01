package model;

public class Makan implements Shopping{
    private String nama;
    private String harga;

    public Makan(String nama, String harga){
        this.nama = nama;
    }

    @Override
    public String beli(){
        return "Makanan " + nama + " dengan harga " + harga + " tidak dijual";
    }

    @Override
    public String bayar(){
        return "Makanan " + nama + " dengan harga " + harga + " tidak dijual sehingga tidak bisa dibayar";
    }

    @Override
    public double diskon(){
        return 0;
    }
    
}
