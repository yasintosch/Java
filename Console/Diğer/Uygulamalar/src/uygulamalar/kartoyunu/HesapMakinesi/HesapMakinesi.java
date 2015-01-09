/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar.kartoyunu.HesapMakinesi;

/**
 *
 * @author yasin
 */
public class HesapMakinesi {

    private static HesapMakinesi instance;

    private HesapMakinesi() {
    }

    public static HesapMakinesi getInstance() {
        if (instance == null) {
            instance = new HesapMakinesi();
        }
        return instance;
    }

    public double hesapla(String girdi) {
		// Girdiyi parcala factory pattern ile matematik fonksiyonunu sec

        int sayi1 = 0;
        int sayi2 = 0;
        String islem = null;
        String[] degerler = null;

        degerler = girdi.split("\\ ");

        sayi1 = Integer.parseInt(degerler[0]);
        islem = degerler[1];
        sayi2 = Integer.parseInt(degerler[2]);

        MatematikselFonksiyon fonksiyon = MatematikselFonksiyonFactory.getFonksiyon(islem);

     

        return fonksiyon.hesapla(sayi1, sayi2);
    }

        // parÃ§alanan a ve b deÄŸerleri ile hesaplamayÄ± yap
}
