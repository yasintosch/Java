/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garajuygulamasi;

/**
 *
 * @author yasin
 */
public class AracFactory {
    
  
    public static Arac getArac(String ad)
    {
     if (ad.equals("Bisiklet"))
        {           
            return new Bisiklet() ;
        } 
     else if (ad.equals("Tir")) 
        {
          return new Tir();
        }  
     else if (ad.equals("Motorsiklet")) 
        {
            return new Motorsiklet();
        }  
     else if (ad.equals("Araba"))
        {
            return new Araba();
        } 
     else if(ad.equals("Kamyonet"))
        {
            return new Kamyonet();
        }
     else if (ad.equals("Otobus"))
           {
            return new Otobus();
           }
     else
     {
       
     System.out.println("Tanınmayan tip araç girdiniz lütfen doğru tip araç giriniz('Bisiklet','Motorbisiklet','Araba','Kamyonet','Otobüs','Tır')");
     return null;
     }
    }
    
}
