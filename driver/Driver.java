package driver;

import java.util.Scanner;

import model.Baju;
import model.Shopping;
import model.Celana;
import model.JenisBarang;
import model.Makan;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Baju baju = new Baju("Merah", "M", 100000);
        Celana celana = new Celana("Levis", "32", 200000);
        Makan makan = new Makan("Nasi Goreng", "15000");

        System.out.println("Pilih barang yang akan dibeli (1. Baju, 2. Celana, 3. Makanan) : ");
        int pilihan = sc.nextInt();
        JenisBarang barang = null;

        if (pilihan == 1) {
            barang = JenisBarang.BAJU;
        } else if (pilihan == 2) {
            barang = JenisBarang.CELANA;
        } else if (pilihan == 3) {
            barang = JenisBarang.MAKAN;
        } else {
            System.out.println("Pilihan tidak valid");
            System.exit(0);
        }

        if (barang == JenisBarang.BAJU) {
            System.out.println(baju.beli());
            System.out.println(baju.bayar());
            System.out.println("Diskon yang didapat : " + baju.diskon());
        } else if (barang == JenisBarang.CELANA) {
            System.out.println(celana.beli());
            System.out.println(celana.bayar());
            System.out.println("Diskon yang didapat : " + celana.diskon());
        } else if (barang == JenisBarang.MAKAN) {
            System.out.println(makan.beli());
            System.out.println(makan.bayar());
            System.out.println("Diskon yang didapat : " + makan.diskon());
        }
    }
}