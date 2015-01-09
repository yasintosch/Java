/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar.kartoyunu;

import java.util.Vector;

/**
 *
 * @author yasin
 */
public class Oyuncular {

    public Vector<Kartlar> v = new Vector<Kartlar>();
    public String ad;

    public void KartAl(Kartlar kart) {
        v.add(kart);
    }

    public void KartlarıGoster() {
        System.out.println(ad + "\n");
        for(Kartlar k : v){
            System.out.print(k.getTip() + " " + k.getAd() + " - ");
        }
        System.out.println();
    }

    public void KartlarıSırala() {
        Kartlar gecici;
        int enkucuk;

        for (int i = 0; i < v.size() - 1; i++) {
            enkucuk = i;
            for (int j = (i + 1); j < v.size(); j++) {
                if (v.get(j).getOnemder() < v.get(enkucuk).getOnemder()) {
                    enkucuk = j;
                }
            }
            gecici = v.get(i);
            v.set(i, v.get(enkucuk));
            v.set(enkucuk, gecici);

        }

    }
    public void KartlarıSırala2() 
    {
    
        for(int i=1;i<v.size()-1;i++)
        {
        Kartlar value=v.get(i);
        int j=i-1;
          while(j>=0 && v.get(j).getOnemder()>value.getOnemder())
          {
           v.set(j+1,v.get(j));
           j=j-1;
          }
          v.set(j+1,value);
          
        }
        
    
    }
    

}
