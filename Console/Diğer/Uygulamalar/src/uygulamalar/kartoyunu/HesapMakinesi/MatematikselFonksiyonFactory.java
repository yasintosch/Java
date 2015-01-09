/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar.kartoyunu.HesapMakinesi;

/**
 *
 * @author yasin
 */
public class MatematikselFonksiyonFactory {

    public static MatematikselFonksiyon getFonksiyon(String islem) {

//        switch(islem)
//        {
//            
//            
//            case "+":return new Toplama();
//            case "-":return new Cıkarma(); 
//            case "*":return new Carpma();
//            case "/":return new Bolme();
//              
//                    }       
//                
        if (islem.equals("+")) {
            return new Toplama();
        } else if (islem.equals("-")) {
            return new Cıkarma();
        } else if (islem.equals("*")) {
            return new Carpma();
        } else if (islem.equals("/")) {
            return new Bolme();
        } else   
            return new Ustel();
        

    }

}
