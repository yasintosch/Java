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
public class Uygulama1 {

    public void yazdir(int boyut) {

        for (int i = 2; i <= boyut; i++) {
            int M = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    M = 0;
                    break;
                }
            }
            if (M == 1) {
                System.out.print(i + "-");
            }
        }

    }

}
