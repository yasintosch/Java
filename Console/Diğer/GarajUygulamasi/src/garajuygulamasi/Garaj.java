/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajuygulamasi;

import java.util.ArrayList;

/**
 *
 * @author yasin
 */
public class Garaj {

    private int boyut=0;
    private ArrayList<Arac> araclist;
    private static Garaj instance;

    private Garaj(int boyut) {
        this.boyut = boyut;
        this.araclist = new ArrayList<Arac>();
        araclist.clear();
    }

    public static Garaj getInstance(int boyut) {
        if (instance == null) {
            instance = new Garaj(boyut);
        }
        return instance;
    }

    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    public void setAracList(ArrayList<Arac> araclist) {
        this.araclist = araclist;
    }

    public int getBoyut() {
        return this.boyut;
    }

    public ArrayList<Arac> getAraclist() {
        return this.araclist;
    }

    public void Komut(String girdi) {
        String komut;
        String tip;
        String[] degerler;
        
        degerler = girdi.split("\\ ");
        komut = degerler[0];
        tip = degerler[1];
        
          
        if (komut.equals("GIR")) {
            
Arac a = AracFactory.getArac(tip);
            GIR(a);
        }
        if (komut.equals("CIK")) {
            
            
            CIK(AracFactory.getArac(tip));
        }
        if (komut.equals("LIST")) {
            LIST();
        }

    }

    public void GIR(Arac arc) {

         int  top = 0;
        for(int i = 0; i < araclist.size(); i++) {
            top += araclist.get(i).getAlan();
        }

        if ((boyut - top) >= arc.getAlan()) {

            araclist.add(arc);
           // araclist.indexOf(arc);
            System.out.println("Aracınız yerleşti...");
            System.out.println("Geri kalan alan : " + (boyut - top - arc.getAlan()));
        } else {
            System.out.println("Yeterli alan olmadığı için aracınız yerleşemedi...");
        }
    }

    public void CIK(Arac arc) {
   
    
            
            for(int i=0;i<this.araclist.size();i++)
            {
                if(araclist.get(i).getAd()==arc.getAd())
                {
                    //this.araclist.remove(arc);
                    this.araclist.remove(i);
                    System.out.println("Aracınız çıktı...");
                }
                
                else 
                {
                    System.out.println("Garajda böyle bir araç bulunmamaktadır...");
                }
            }
            
      
        


    }

    public void LIST() {
        for (int i = 0; i < araclist.size(); i++) {
            System.out.println(araclist.indexOf(araclist.get(i))+1+"."+araclist.get(i).getAd());
        }

    }

}
