/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar;

import uygulamalar.kartoyunu.Kartlar;
import uygulamalar.kartoyunu.Oyuncular;
import uygulamalar.kartoyunu.Deste;
import uygulamalar.kartoyunu.HesapMakinesi.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class Uygulamalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //1-100 asal sayıları yazdırma
        System.out.print("**1-100 arası asal sayılar**\n\n");
        Uygulama1 u1 = new Uygulama1();
        u1.yazdir(100);
        System.out.print("\n\n");

        //Fibonacci
        System.out.print("**İlk 20 fibonacci sayıları**\n\n");
        Uygulama2 u2 = new Uygulama2();
        u2.Yazdir(20);
        System.out.print("\n\n");

        //10 asama pascal üçgeni
        System.out.print("**10 asama pascal üçgeni**\n\n");
        Uygulama3 u3 = new Uygulama3();
        u3.pascal(10);
        System.out.print("\n\n");

        //4 diskli hanoi 
        System.out.print("**4 diskli hanoi çözümü**\n\n");
        Uygulama4 u4 = new Uygulama4();
        System.out.println(u4.hanoi(4, 1, 3));

        //8 vezir problemi
        System.out.print("**8 vezir problemi**\n\n");
        Uygulama5 u5 = new Uygulama5();
        u5.Say(8);

        //52 kart dağıtma
        Kartlar k1 = new Kartlar();
        k1.setTip("Sinek");
        k1.setOnemder(1);
        k1.setAd("2");

        Kartlar k2 = new Kartlar();
        k2.setTip("Sinek");
        k2.setOnemder(2);
        k2.setAd("3");

        Kartlar k3 = new Kartlar();
        k3.setTip("Sinek");
        k3.setOnemder(3);
        k3.setAd("4");

        Kartlar k4 = new Kartlar();
        k4.setTip("Sinek");
        k4.setOnemder(4);
        k4.setAd("5");

        Kartlar k5 = new Kartlar();
        k5.setTip("Sinek");
        k5.setOnemder(5);
        k5.setAd("6");

        Kartlar k6 = new Kartlar();
        k6.setTip("Sinek");
        k6.setOnemder(6);
        k6.setAd("7");

        Kartlar k7 = new Kartlar();
        k7.setTip("Sinek");
        k7.setOnemder(7);
        k7.setAd("8");

        Kartlar k8 = new Kartlar();
        k8.setTip("Sinek");
        k8.setOnemder(8);
        k8.setAd("9");

        Kartlar k9 = new Kartlar();
        k9.setTip("Sinek");
        k9.setOnemder(9);
        k9.setAd("10");

        Kartlar k10 = new Kartlar();
        k10.setTip("Sinek");
        k10.setOnemder(10);
        k10.setAd("J");

        Kartlar k11 = new Kartlar();
        k11.setTip("Sinek");
        k11.setOnemder(11);
        k11.setAd("Q");

        Kartlar k12 = new Kartlar();
        k12.setTip("Sinek");
        k12.setOnemder(12);
        k12.setAd("K");

        Kartlar k13 = new Kartlar();
        k13.setTip("Sinek");
        k13.setOnemder(13);
        k13.setAd("A");

        Kartlar k14 = new Kartlar();
        k14.setTip("Karo");
        k14.setOnemder(14);
        k14.setAd("2");

        Kartlar k15 = new Kartlar();
        k15.setTip("Karo");
        k15.setOnemder(15);
        k15.setAd("3");

        Kartlar k16 = new Kartlar();
        k16.setTip("Karo");
        k16.setOnemder(16);
        k16.setAd("4");

        Kartlar k17 = new Kartlar();
        k17.setTip("Karo");
        k17.setOnemder(17);
        k17.setAd("5");

        Kartlar k18 = new Kartlar();
        k18.setTip("Karo");
        k18.setOnemder(18);
        k18.setAd("6");

        Kartlar k19 = new Kartlar();
        k19.setTip("Karo");
        k19.setOnemder(19);
        k19.setAd("7");

        Kartlar k20 = new Kartlar();
        k20.setTip("Karo");
        k20.setOnemder(20);
        k20.setAd("8");

        Kartlar k21 = new Kartlar();
        k21.setTip("Karo");
        k21.setOnemder(20);
        k21.setAd("9");

        Kartlar k22 = new Kartlar();
        k22.setTip("Karo");
        k22.setOnemder(22);
        k22.setAd("10");

        Kartlar k23 = new Kartlar();
        k23.setTip("Karo");
        k23.setOnemder(22);
        k23.setAd("J");

        Kartlar k24 = new Kartlar();
        k24.setTip("Karo");
        k24.setOnemder(24);
        k24.setAd("Q");

        Kartlar k25 = new Kartlar();
        k25.setTip("Karo");
        k25.setOnemder(25);
        k25.setAd("K");

        Kartlar k26 = new Kartlar();
        k26.setTip("Karo");
        k26.setOnemder(26);
        k26.setAd("A");

        Kartlar k27 = new Kartlar();
        k27.setTip("Maça");
        k27.setOnemder(27);
        k27.setAd("2");

        Kartlar k28 = new Kartlar();
        k28.setTip("Maça");
        k28.setOnemder(28);
        k2.setAd("3");

        Kartlar k29 = new Kartlar();
        k29.setTip("Maça");
        k29.setOnemder(29);
        k29.setAd("4");

        Kartlar k30 = new Kartlar();
        k30.setTip("Maça");
        k30.setOnemder(30);
        k30.setAd("5");

        Kartlar k31 = new Kartlar();
        k31.setTip("Maça");
        k31.setOnemder(31);
        k31.setAd("6");

        Kartlar k32 = new Kartlar();
        k32.setTip("Maça");
        k32.setOnemder(32);
        k32.setAd("7");

        Kartlar k33 = new Kartlar();
        k33.setTip("Maça");
        k33.setOnemder(33);
        k33.setAd("8");

        Kartlar k34 = new Kartlar();
        k34.setTip("Maça");
        k34.setOnemder(34);
        k34.setAd("9");

        Kartlar k35 = new Kartlar();
        k35.setTip("Maça");
        k35.setOnemder(35);
        k35.setAd("10");

        Kartlar k36 = new Kartlar();
        k36.setTip("Maça");
        k36.setOnemder(36);
        k36.setAd("J");

        Kartlar k37 = new Kartlar();
        k37.setTip("Maça");
        k37.setOnemder(37);
        k37.setAd("Q");

        Kartlar k38 = new Kartlar();
        k38.setTip("Maça");
        k38.setOnemder(38);
        k38.setAd("K");

        Kartlar k39 = new Kartlar();
        k39.setTip("Maça");
        k39.setOnemder(39);
        k39.setAd("A");

        Kartlar k40 = new Kartlar();
        k40.setTip("Kupa");
        k40.setOnemder(40);
        k40.setAd("2");

        Kartlar k41 = new Kartlar();
        k41.setTip("Kupa");
        k41.setOnemder(41);
        k41.setAd("3");

        Kartlar k42 = new Kartlar();
        k42.setTip("Kupa");
        k42.setOnemder(42);
        k42.setAd("4");

        Kartlar k43 = new Kartlar();
        k43.setTip("Kupa");
        k43.setOnemder(43);
        k43.setAd("5");

        Kartlar k44 = new Kartlar();
        k44.setTip("Kupa");
        k44.setOnemder(44);
        k44.setAd("6");

        Kartlar k45 = new Kartlar();
        k45.setTip("Kupa");
        k45.setOnemder(45);
        k45.setAd("7");

        Kartlar k46 = new Kartlar();
        k46.setTip("Kupa");
        k46.setOnemder(46);
        k46.setAd("8");

        Kartlar k47 = new Kartlar();
        k47.setTip("Kupa");
        k47.setOnemder(47);
        k47.setAd("9");

        Kartlar k48 = new Kartlar();
        k48.setTip("Kupa");
        k48.setOnemder(48);
        k48.setAd("10");

        Kartlar k49 = new Kartlar();
        k49.setTip("Kupa");
        k49.setOnemder(49);
        k49.setAd("J");

        Kartlar k50 = new Kartlar();
        k50.setTip("Kupa");
        k50.setOnemder(50);
        k24.setAd("Q");

        Kartlar k51 = new Kartlar();
        k51.setTip("Kupa");
        k51.setOnemder(51);
        k51.setAd("K");

        Kartlar k52 = new Kartlar();
        k52.setTip("Kupa");
        k52.setOnemder(52);
        k52.setAd("A");

        ArrayList<Kartlar> v = new ArrayList<Kartlar>();
//        v.add(k1);
//        v.add(k2);
//        v.add(k3);
//        v.add(k4);
//        v.add(k5);
//        v.add(k6);
//        v.add(k7);
//        v.add(k8);
//        v.add(k9);
//        v.add(k10);
//        v.add(k11);
//        v.add(k12);
//        v.add(k13);
//        v.add(k14);
//        v.add(k15);
//        v.add(k16);
//        v.add(k17);
//        v.add(k18);
//        v.add(k19);
//        v.add(k20);
//        v.add(k21);
//        v.add(k22);
//        v.add(k23);
//        v.add(k24);
//        v.add(k25);
//        v.add(k26);
//        v.add(k25);
//        v.add(k28);
//        v.add(k29);
//        v.add(k30);
//        v.add(k31);
//        v.add(k32);
//        v.add(k33);
//        v.add(k34);
//        v.add(k35);
//        v.add(k36);
//        v.add(k37);
//        v.add(k38);
//        v.add(k39);
//        v.add(k40);
//        v.add(k41);
//        v.add(k42);
//        v.add(k43);
//        v.add(k44);
//        v.add(k45);
//        v.add(k46);
//        v.add(k47);
//        v.add(k48);
//        v.add(k49);
//        v.add(k50);
//        v.add(k51);
//        v.add(k52);

        Deste deste = new Deste();
        for (int i = 0; i < 52; i++) {
            int bol = i / 13;
            int mod = i % 13;
            Kartlar k = new Kartlar();
            k.setOnemder(i);
            switch (bol) {
                case 0:
                    k.setTip("Sinek");
                    break;
                case 1:
                    k.setTip("Karo");
                    break;
                case 2:
                    k.setTip("Maça");
                    break;
                case 3:
                    k.setTip("Kupa");
                    break;
            }

            if (mod >= 0 && mod <= 8) {
                k.setAd("" + (mod + 2));
            } else if (mod == 9) {
                k.setAd("J");
            } else if (mod == 10) {
                k.setAd("Q");
            } else if (mod == 11) {
                k.setAd("K");
            } else if (mod == 12) {
                k.setAd("A");
            }
            v.add(k);
        }

        deste.KartEkle(v);

        ArrayList<Oyuncular> masa = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Oyuncular o = new Oyuncular();
            o.ad = "Oyuncu " + (i + 1);
            masa.add(o);
        }

        for (Oyuncular oyuncu : masa) {
            deste.KartDagıt(oyuncu);

            oyuncu.KartlarıSırala2();
            oyuncu.KartlarıGoster();

            System.out.print("\n");
        }

//        deste.KartDagıt(o2);
//
//        o2.KartlarıSırala();
//        o2.KartlarıGoster();
//
//        System.out.print("\n");
//        deste.KartDagıt(o3);
//
//        o3.KartlarıSırala();
//        o3.KartlarıGoster();
//
//        System.out.print("\n");
//
//        deste.KartDagıt(o4);
//        o4.KartlarıSırala();
//        o4.KartlarıGoster();
        //Hesap Makinesi Uygulaması
        try {

            while (true) {

                String girdi = null;

                System.out.println("İşlemi Giriniz:");
                Scanner scan = new Scanner(System.in);
                girdi = scan.nextLine();
                if ("exit".equals(girdi)) {
                    System.out.println(girdi);
                    break;

                } else {
                    HesapMakinesi hesapMakinesi = HesapMakinesi.getInstance();

                    double deger = hesapMakinesi.hesapla(girdi);

                    // Ciktiyi Goster
                    System.out.print("=" + deger);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
