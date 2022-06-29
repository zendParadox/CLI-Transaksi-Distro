package com.tutorial;

public class Main {
    public static void main(String[] args){
        double totalharga, totalKaos, totalKemeja, totalJas, totalPanjang, totalPendek;

        KatalogBaju katalogbaju = new KatalogBaju();
        KatalogCelana katalogcelana = new KatalogCelana();

        katalogbaju.kaos();
        katalogbaju.kemeja();
        katalogbaju.jas();
        katalogcelana.celanaPanjang();
        katalogcelana.celanaPendek();


        totalharga = (katalogbaju.hargaKaos + katalogbaju.hargaKemeja + katalogbaju.hargaJas + katalogcelana.hargaPanjang + katalogcelana.hargaPendek);
        totalKaos = (katalogbaju.jumlahKaos * katalogbaju.hargaKaos);
        totalKemeja = (katalogbaju.jumlahKemeja * katalogbaju.hargaKemeja);
        totalJas = (katalogbaju.hargaJas * katalogbaju.jumlahJas);
        totalPanjang = (katalogcelana.hargaPanjang * katalogcelana.jumlahPanjang);

        System.out.println("\n\n" + katalogbaju.namaKaos + "\t\t\t\t" + katalogbaju.jumlahKaos + "\t\t" + katalogbaju.hargaKaos + "\t\t\t" + totalKaos);
        System.out.println(katalogbaju.namaKemeja + "\t\t\t\t" + katalogbaju.jumlahKemeja + "\t\t" + katalogbaju.hargaKemeja + "\t\t" + totalKemeja);
        System.out.println(katalogbaju.namaJas + "\t\t\t\t" + katalogbaju.jumlahJas + "\t\t" + katalogbaju.hargaJas + "\t\t\t" + totalJas);
        System.out.println(katalogcelana.namaPanjang + "\t\t\t\t" + katalogcelana.jumlahPanjang + "\t\t" /*+ katalogcelana*/);
    }
}

