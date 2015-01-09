/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar.kartoyunu;

import java.util.Vector;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author yasin
 */
public class Deste {

    public ArrayList<Kartlar> arr = new ArrayList<Kartlar>();
    public ArrayList<Oyuncular> oyuncu = new ArrayList<Oyuncular>();

    public void KartEkle(ArrayList<Kartlar> kartlar) {

        for (int i = 0; i < 52; i++) {

            arr.add(kartlar.get(i));

        }

        int newI;
        Kartlar temp;
        Random randIndex = new Random();

        for (int i = 0; i < 52; i++) {

            // pick a random index between 0 and cardsInDeck - 1
            newI = randIndex.nextInt(52);

            // swap cards[i] and cards[newI]
            temp = arr.get(i);
            arr.set(i, arr.get(newI));
            arr.set(newI, temp);
        }

    }

    public void KartDagıt(Oyuncular o) {

        for (int i = 0; i < 13; i++) {
            o.KartAl(arr.remove(0));

        }

    }

}
