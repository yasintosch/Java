/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar;

/**
 *
 * @author yasin
 */
public class Uygulama3 {

    public void pascal(int asama) {

        int i, j, c, k, alan;

        alan = asama;
        for (i = 0; i < asama; i++) {

            c = 1;
            for (k = alan; k >= 0; k--) {
                System.out.print(" ");
            }

            alan--;
            for (j = 0; j <= i; j++) {
                System.out.print(c + "  ");
                c = (c * (i - j) / (j + 1));
            }
            System.out.print("\n");
        }

    }
}
