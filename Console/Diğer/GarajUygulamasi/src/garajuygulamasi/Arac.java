/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajuygulamasi;
import java.util.Random;

/**
 *
 * @author yasin
 */
public  class Arac {

    private static int  id;
    private static String ad;
    private static int alan;

//   public Arac(String ad,int alan)
//   {
//  
//   this.ad=ad;
//   this.alan=alan;
//   }

    public  String getAd() {return ad;}

    public int getAlan(){return alan;}
    
    public void setAd(String ad){this.ad=ad;}
    public void setAlan(int alan){this.alan=alan;}
    
    public static void setID()
    {
        Random randIndex = new Random();
    id=randIndex.nextInt(100);
    }
    public int getID(){return this.id;}
    
}
