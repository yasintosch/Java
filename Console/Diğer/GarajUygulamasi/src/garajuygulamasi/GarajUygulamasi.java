/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garajuygulamasi;
import java.util.Scanner;

/**
 *
 * @author yasin
 */
public class GarajUygulamasi {

    /**
     * @param args the command line arguments
     */
    
  
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        int boyut=0;
        String girdi;
        System.out.print("Garaj boyutu(5-50 arası): ");
        Scanner scan =new Scanner(System.in);
        boyut=scan.nextInt();
        
        Garaj g =Garaj.getInstance(boyut);
        if(boyut>5 && boyut<50)
        {
        System.out.println("Garajınız oluşturuldu");
        
            
               while(true)
               {
                  
                  System.out.println("Komutu ve tipi giriniz(GIR tip ,CIK tip veya LIST ARAC): ");
                  Scanner scan1 =new Scanner(System.in);
                  girdi=scan1.nextLine();

                  g.Komut(girdi);
                       
               }
                
        
        
        
        }
        else
        {
        System.out.println("Garajınız oluşturulamadı lütfen 5 ile 50 arası bir değer giriniz...");
        }
        
        
        
        
    }
    
}
