/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artifiallab2_2;

/**
 *
 * @author yasin
 */
public class ArtifialLab2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        
        Stack stack=new Stack(100);
    stack.push(1); 
    stack.push(2); 
    stack.push(3); 
    stack.push(4); 
    
    stack.yazdir();
    
    stack.pop();
    stack.pop();
    
    
    System.out.println();
    stack.yazdir();
    
    
        
    }
    
}
