package com.tutorial;
import java.util.Scanner;

public class KatalogBaju {
    Scanner inputBaju = new Scanner(System.in);
    String pilihBaju, namaKaos, namaKemeja, namaJas;
    int kodeBaju, jumlahKaos, jumlahKemeja, jumlahJas;
    double hargaKaos, hargaKemeja, hargaJas;

    void kaos(){

        System.out.println("===============================================================");
        System.out.println("==================Selamat Datang Di RAP Merch==================");
        System.out.println("=========Silahkan Memilih Barang-barang Yang Anda Suka=========");
        System.out.println("===============================================================");

        System.out.print("\n\nAnda Ingin Membeli T-Shirt? (ya/tidak): ");
        pilihBaju = inputBaju.next();

        if ("ya".equalsIgnoreCase(pilihBaju)){

            System.out.println("\n================Ini Katalog Baju Yang Kami Punya================");
            System.out.println("    |  Kode Baju   |     Nama Baju      |       Harga Baju     |");
            System.out.println("1.  |     111      |   T-Shirt Merah    |     Rp. 57.000,-     |");
            System.out.println("2.  |     112      |   T-Shirt Kuning   |     Rp. 53.000,-     |");
            System.out.println("3.  |     113      |   T-Shirt Hitam    |     Rp. 62.000,-     |");
            System.out.print("Silahkan Memasukkan Nomor Yang Diinginkan: ");
            pilihBaju = inputBaju.next();

            switch (pilihBaju){
                case "1":
                    namaKaos = "T-Shirt Merah";
                    hargaKaos = 57000;
                    kodeBaju = 111;
                    break;
                case "2":
                    namaKaos = "T-Shirt Kuning";
                    hargaKaos = 53000;
                    kodeBaju = 112;
                    break;
                case "3":
                    namaKaos = "T-Shirt Hitam";
                    hargaKaos = 62000;
                    kodeBaju = 113;
                    break;
                default:
                    System.err.println("Nomor Yang Anda Masukkan Tidak Ada Dalam Daftar!");
                    namaKaos = "";
                    hargaKaos = 0;
                    kodeBaju = 0;
            }
            System.out.print("Berapa pcs yang anda inginkan?: ");
            jumlahKaos = inputBaju.nextInt();

        }else {
            namaKaos = "Tidak Memilih";
            hargaKaos = 0;
            kodeBaju = 0;
        }
/*
        System.out.print("Berapa pcs yang anda inginkan?: ");
        jumlahKaos = inputBaju.nextInt();
*/

    }
    void kemeja(){
        System.out.print("\nAnda Ingin Membeli Kemeja? (ya/tidak): ");
        pilihBaju = inputBaju.next();

        if ("ya".equalsIgnoreCase(pilihBaju)){
            System.out.println("\n===============Ini Katalog Kemeja Yang Kami Punya===============");
            System.out.println("1.  |     211      |   Kemeja Hitam     |     Rp. 138.000,-    |");
            System.out.println("2.  |     212      |   Kemeja Putih     |     Rp. 117.000,-    |");
            System.out.println("3.  |     213      |   Kemeja Hijau     |     Rp. 129.000,-    |");
            System.out.print("Silahkan Memasukkan Nomor Yang Diinginkan: ");
            pilihBaju = inputBaju.next();

            switch (pilihBaju){
                case "1":
                    namaKemeja = "Kemeja Hitam";
                    hargaKemeja = 138000;
                    kodeBaju = 211;
                    break;
                case "2":
                    namaKemeja = "Kemeja Putih";
                    hargaKemeja = 117000;
                    kodeBaju = 212;
                    break;
                case "3":
                    namaKemeja = "Kemeja Hijau";
                    hargaKemeja = 129000;
                    kodeBaju = 213;
                    break;
                default:
                    System.err.println("Nomor Yang Anda Masukkan Tidak Ada Dalam Daftar!");
                    namaKemeja = "";
                    hargaKemeja = 0;
                    kodeBaju = 0;
            }
            System.out.print("Berapa pcs yang anda inginkan?: ");
            jumlahKemeja = inputBaju.nextInt();
        }else {
            namaKemeja = "Tidak Memilih";
            hargaKemeja = 0;
            kodeBaju = 0;
        }
/*        System.out.print("Berapa pcs yang anda inginkan?: ");
        jumlahKemeja = inputBaju.nextInt();*/
    }
    void jas(){
        System.out.print("\nAnda Ingin Membeli Jas? (ya/tidak): ");
        pilihBaju = inputBaju.next();

        if ("ya".equalsIgnoreCase(pilihBaju)){
            System.out.println("\n=================Ini Katalog Jas Yang Kami Punya=================");
            System.out.println("1.  |     311      |    Jas Kuning      |     Rp. 378.000,-    |");
            System.out.println("2.  |     312      |    Jas Merah       |     Rp. 355.000,-    |");
            System.out.println("3.  |     313      |    Jas Biru        |     Rp. 349.000,-    |");
            System.out.print("Silahkan Memasukkan Nomor Yang Diinginkan: ");
            pilihBaju = inputBaju.next();

            switch (pilihBaju){
                case "1":
                    namaJas = "Jas Kuning";
                    hargaJas = 378000;
                    kodeBaju = 311;
                    break;
                case "2":
                    namaJas = "Jas Merah";
                    hargaJas = 355000;
                    kodeBaju = 312;
                    break;
                case "3":
                    namaJas = "Jas Biru";
                    hargaJas = 349000;
                    kodeBaju = 313;
                    break;
                default:
                    System.err.println("Nomor Yang Anda Masukkan Tidak Ada Dalam Daftar!");
                    namaJas = "";
                    hargaJas = 0;
                    kodeBaju = 0;
            }
            System.out.print("Berapa pcs yang anda inginkan?: ");
            jumlahJas = inputBaju.nextInt();
        }else {
            namaJas = "Tidak Memilih";
            hargaJas = 0;
            kodeBaju = 0;
        }
/*        System.out.println("Berapa pcs yang anda inginkan?: ");
        jumlahJas = inputBaju.nextInt();*/
    }
}
