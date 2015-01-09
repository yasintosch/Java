/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasin
 */
public class Tahta<T> {

    private String initial[][];
    private List<Tahta<T>>children;
    
    

    public Tahta()
    {
    
     children =new ArrayList<Tahta<T>>();
     initial=new String[3][3];
     

     
    }
    


    public List<Tahta<T>> GetChildren()
    {
        return this.children;
    }
 
    public String[][] GetInitial()
    {
    return initial;
    }
    

    public void SetInitial(String initial[][])
    {
    this.initial =initial;
    }    
//    public void CreateSolveSpace(String array[][])
//    {
//        
//        if(IsShiftsLeft(array))
//        {
//           if(IsGoalPosition(array)) 
//           {
//
//           }
//            new Tahta();
//            children.add(this);
//            this.CreateSolveSpace(ShiftLeft(array));
//
//        }
//        if(IsShiftsRight(array))
//        {
//           if(IsGoalPosition(array)) 
//           {
//
//           }
//
//           new Tahta();
//           children.add(this);
//           this.CreateSolveSpace(ShiftRight(array));
//        }
//     
//        if(IsShiftsUp(array))
//        {
//            
//           if(IsGoalPosition(array)) 
//           {
//
//           }
//           new Tahta();
//           children.add(this);
//           this.CreateSolveSpace(ShiftUp(array));
//        }
//     
//        if(IsShiftsDown(array))
//        {
//           if(IsGoalPosition(array)) 
//           {
//
//           }
//              new Tahta();
//              children.add(this);
//              this.CreateSolveSpace(ShiftUp(array));     
//        }   
//     
//    }


}
