package com.mycompany.sayianalizi;

import java.util.Scanner;

public class SayiAnalizi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bas = 0;             //bunların hepsi daha sonrası için
        float pokkort = 0;
        int pokk = 0;
        boolean flag2 = false;
        boolean flag = true;
        int pok = 0;
        int nek = 0;
        int sayac = 0;
        int tekk = 0;
        int ciftk = 0;
        int enk = 0;
        int kucukk = 0;
        int topk = 0;
        float ort = 0;
        int mukk = 0;

        while (flag) { //doğru olduğu sürece devam et 
            System.out.println("Lutfen bir sayi giriniz"); //Çıktığı çıkar 
            int n = sc.nextInt(); //Sunucu al 

            if (n == 0 & sayac == 0) { //sayı sıfır ve sayaç sıfırsa çıktığı çıkar  bayrağı false yap
                System.out.println("efendim daha denemeden oturumnuz kapatilmistir");
                flag = false;

            } else if (n == 0 & sayac != 0) { //sayı sıfır ve sayaç sıfırsa çıktığı çıkar  bayrağı false yap
                System.out.println(sayac + ". denemenizden sonra oturumunuz kapatiliyor");
                flag = false;

            } else { //değilse
                sayac = sayac + 1; //sayaca bir ekle
                topk = topk + n; //toplam kutusuna n yi ekle

                if (n % 2 == 0) { // ikiye kalansız bölünebiliyorsa
                    ciftk = ciftk + 1; //ciftk bir ekle

                } else { //değilse
                    tekk = tekk + 1; //tek kutusuna bir ekle

                }

                if (n < 0) { //0 dan küçüksw
                    nek = nek + 1; // bir ekle
                } else { //değilse buna bir ekle
                    pok = pok + 1;
                    pokk = pokk + n; //pozitif kutusuna nyi de kat
                }

                if (sayac == 1) { //sayaç 1 se en büyük ve en küçük sayıları n yap
                    enk = n;
                    kucukk = n;

                } else if (n > enk) { // değilse ve n enk ten büyükse enk'e n ata
                    enk = n;

                } else {
                    kucukk = n;  // değilse ve n kucukk ten küçükse enk'e n at

                }

                if (n < 2) { // ikiden küçükse
                    System.out.println("Bu sayi asal degil"); //çıktıyı çıkar
                } else {

                    for (int i = 2; i < n - 1; i++) { // tek tek dene
                        if (n % i == 0) { //biri bile olursa bayrağı true yap
                            flag2 = true;
                        }
                    }

                    if (flag2 == true) { //trueyse
                        System.out.println("bu sayi asal degildir"); //asal değildir
                    } else if (flag2 != true) {
                        System.out.println("bu sayi asaldir"); //true değilse asal dır
                    }

                }
                for (int i = 1; i < n - 1; i++) { // kendidi dışında bölenlerini buluyoruz
                    if (n % i == 0) {
                        mukk = mukk + i; //bölüyosa ekle
                    }
                }

                if (mukk == n) {
                    System.out.println("ayrica girdiginiz sayi mukemmel sayidir");  //n ye eşitse çıktıyı çıkar
                } else {
                    System.out.println("ayrica mukemmel sayi degildir"); //değilse bu çıktıyı çıkar
                }

            }

            if (n < 0) { // eksi bir değerse pozitif yaptık
                n = n * -1;
            }

            for (int i = 1; i < n; i = i * 10) { //n ye kadar 10 ar 10 ar arttır
                bas = bas + 1; //her seferinde de x se 1 ekle
            }
            System.out.println("sayi " + bas + " basamakli"); //çıktıyı çıkar
            n = n * -1;

        }
        pokkort = (float) pokk / pok; //küsürlü hesapla
        ort = (float) topk / sayac; //küsürlü hesapla
        System.out.println("pozitif sayi sayisi " + pok + "\npozitif sayilarin ortalamasi " + pokkort + "\nnegatif sayi sayisi " + nek + "\nsayac " + sayac + "\ntek sayi sayisi " + tekk + "\ncift sayi sayisi " + ciftk + "\nen buyuk sayi " + enk + "\nen kucuk sayi " + kucukk + "\ntoplamlari " + topk + "\nortalama " + ort + "\n aciklik " + (enk - kucukk));

    }
}
