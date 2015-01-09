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
public class Uygulama2 {
    
    public int Fibo(int f)
    {
     if(f==0)
         return 0;
     else if(f==1)
         return 1;
     else
         return Fibo(f-1)+Fibo(f-2);
    }
    
    public void Yazdir(int boyut)
    {
        
       for(int i=0;i<boyut;i++)
        {
             System.out.print(Fibo(i)+"-");
             
                        }
    }
    
}
