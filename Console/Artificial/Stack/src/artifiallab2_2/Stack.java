/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artifiallab2_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasin
 */
public class Stack {
    
   private int MAXSTACK ; //max capacity of the stack

   private List<Integer> stack; 
   private int top; //pointer; points the current element in the stack
   
   public Stack(int MAXSTACK)
   {
   this.MAXSTACK=MAXSTACK;
    stack=new ArrayList();
   this.top=0;
   
   }
   
    public boolean Isfull() 
    { 
        if(stack.size()>=MAXSTACK)
            return true;
        else 
            return false;
    // True if no more items can be pushed.
    }

    public boolean Isempty() 
    { 
        if(stack.size()==0)
            return true;
        else
            return false;
    // True if no more items can be popped and there is no top item.
    } 
    
    public void push(int e) 
    { 
        if(!Isfull())
        stack.add(e);
        
    // Adds an item onto the stack.
    } 
    
    public void pop() 
    { 
        if(!Isempty())
        stack.remove(stack.get(stack.size()-1));
        
        
    // Removes the most-recently-pushed item from the stack.
    } 
    
    public void yazdir()
    {
           for(int i =0;i<stack.size();i++)
    { 
          System.out.println(stack.get(i));
            
    } 
    
    }
    
    
    
}
