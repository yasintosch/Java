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
public class Uygulama4 {

    public static String hanoi(int disk, int kaynak, int hedef) {
        int helpPeg;
        String Sol1, Sol2, MyStep, mySol;   // Contains moves

        if (disk == 1) {
            return kaynak + " -> " + hedef + "\n";
        } else {
            helpPeg = 6 - kaynak - hedef;    // Because fromPeg + helpPeg + toPeg = 6    

            Sol1 = hanoi(disk - 1, kaynak, helpPeg);

            MyStep = kaynak + " -> " + hedef + "\n";

            Sol2 = hanoi(disk - 1, helpPeg, hedef);

            mySol = Sol1 + MyStep + Sol2;     // + = String concatenation !

            return mySol;
        }
    }

}
