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
public class Ustel implements MatematikselFonksiyon {

    public double hesapla(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * hesapla(a, b - 1);
        }
    }

}
