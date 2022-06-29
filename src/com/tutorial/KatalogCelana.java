package com.tutorial;

import java.util.Scanner;

public class KatalogCelana {
    Scanner inputCelana = new Scanner(System.in);
    String pilihCelana, namaPanjang, namaPendek;
    int kodeCelana, jumlahPanjang, jumlahPendek;
    double hargaPanjang, hargaPendek;

    void celanaPanjang(){
        System.out.print("\nAnda Ingin Membeli Celana Panjang (ya/tidak)?: ");
        pilihCelana = inputCelana.next();

        if ("ya".equalsIgnoreCase(pilihCelana)){
            System.out.println("\n=============Ini Katalog Celana Panjang Yang Kami Punya================");
            System.out.println("    | Kode Celana  |        Nama Celana        |      Harga Celana    |");
            System.out.println("1.  |     411      |  Celana Panjang Hitam     |     Rp. 137.000,-    |");
            System.out.println("2.  |     412      |  Celana Panjang Abu-abu   |     Rp. 135.000,-    |");
            System.out.println("3.  |     413      |  Celana Panjang Krem      |     Rp. 127.000,-    |");
            System.out.println("4.  |     414      |  Celana Panjang Biru      |     Rp. 117.000,-    |");
            System.out.print("Silahkan Memasukkan Nomor Yang Diinginkan: ");
            pilihCelana = inputCelana.next();

            switch (pilihCelana){
                case "1":
                    namaPanjang = "Celana Panjang Hitam";
                    hargaPanjang = 137000;
                    kodeCelana = 411;
                    break;
                case "2":
                    namaPanjang = "Celana Panjang Abu-abu";
                    hargaPanjang = 135000;
                    kodeCelana = 412;
                    break;
                case "3":
                    namaPanjang = "Celana Panjang Krem";
                    hargaPanjang = 127000;
                    kodeCelana = 413;
                    break;
                case "4":
                    namaPanjang = "Celana Panjang Biru";
                    hargaPanjang = 117000;
                    kodeCelana = 414;
                    break;
                default:
                    System.err.println("Nomor Yang Anda Masukkan Tidak Ada Dalam Daftar!");
                    namaPanjang = "";
                    hargaPanjang = 0;
                    kodeCelana = 0;
            }
            System.out.print("Berapa pcs yang anda inginkan?: ");
            jumlahPanjang = inputCelana.nextInt();
        }else {
            namaPanjang = "Tidak Memilih";
            hargaPanjang = 0;
            kodeCelana = 0;
        }
/*        System.out.println("Berapa pcs yang anda inginkan?: ");
        jumlahPanjang = inputCelana.nextInt();*/
    }
    void celanaPendek(){
        System.out.print("\nAnda Ingin Membeli Celana Pendek (ya/tidak)?: ");
        pilihCelana = inputCelana.next();

        if ("ya".equalsIgnoreCase(pilihCelana)){
            System.out.println("\n==============Ini Katalog Celana Pendek Yang Kami Punya================");
            System.out.println("1.  |     511      |  Celana Pendek Hitam      |     Rp. 87.000,-     |");
            System.out.println("2.  |     512      |  Celana Pendek Biru       |     Rp. 81.000,-     |");
            System.out.println("3.  |     513      |  Celana Pendek Abu-abu    |     Rp. 85.000,-     |");
            System.out.println("4.  |     514      |  Celana Pendek Krem       |     Rp. 83.000,-     |");
            System.out.println("5.  |     515      |  Celana Pendek Merah      |     Rp. 78.000,-     |");
            System.out.print("Silahkan Memasukkan Nomor Yang Diinginkan: ");
            pilihCelana = inputCelana.next();

            switch (pilihCelana){
                case "1":
                    namaPendek = "Celana Pendek Hitam";
                    hargaPendek = 87000;
                    kodeCelana = 511;
                    break;
                case "2":
                    namaPendek = "Celana Pendek Biru";
                    hargaPendek = 81000;
                    kodeCelana = 512;
                    break;
                case "3":
                    namaPendek = "Celana Pendek Abu-abu";
                    hargaPendek = 85000;
                    kodeCelana = 513;
                    break;
                case "4":
                    namaPendek = "Celana Pendek Krem";
                    hargaPendek = 83000;
                    kodeCelana = 514;
                    break;
                case "5":
                    namaPendek = "Celana Pendek Merah";
                    hargaPendek = 78000;
                    kodeCelana = 515;
                    break;
                default:
                    System.err.println("Nomor Yang Anda Masukkan Tidak Ada Dalam Daftar!");
                    namaPendek = "";
                    hargaPendek = 0;
                    kodeCelana = 0;
            }
            System.out.print("Berapa pcs yang anda inginkan?: ");
            jumlahPendek = inputCelana.nextInt();
        }else {
            namaPendek = "Tidak Memilih";
            hargaPendek = 0;
            kodeCelana = 0;
        }
/*        System.out.println("Berapa pcs yang anda inginkan?: ");
        jumlahPendek = inputCelana.nextInt();*/
    }
}
