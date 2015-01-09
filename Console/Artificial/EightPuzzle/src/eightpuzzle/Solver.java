/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.List;

/**
 *
 * @author yasin
 */
public class Solver {
    
    private String goal[][];
    private String initial[][];
    private List<Tahta> children;
    private Tahta tahta;
    private String temp[][];
    
    public Solver(Tahta tahta,String[][]goal)
    {
    this.tahta=tahta;
    
    this.goal=goal;
    
    }
    
     private boolean IsGoalPosition(String array[][])
    {
    if(array.equals(goal))
        return true;
    else
        return false;
    }
    public String[][] ShiftLeft(String array[][])
    {
    temp=null;
    
        int row;
        int col;
        String[] value;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        temp=array;
        temp[row][col]=array[row][col-1];
        temp[row][col-1]="X";
        
        
        return temp;
    
    }
    public String[][] ShiftRight(String array[][])
    {
        temp=null;
    
        int row;
        int col;
        String[] value;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        temp=array;
        temp[row][col]=array[row][col+1];
        temp[row][col+1]="X";
        
    return temp;
    
    }
    public String[][] ShiftUp(String array[][])
    {
        temp=null;
    
        int row;
        int col;
        String[] value;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        temp=array;
        temp[row][col]=array[row-1][col];
        temp[row-1][col]="X";
        
         return temp;
    }
    public String[][] ShiftDown(String array[][])
    {
        temp=null;
    
        int row;
        int col;
        String[] value;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        temp=array;
        temp[row][col]=array[row+1][col];  
        temp[row+1][col]="X";
             
        return temp;
        
    }
    public boolean IsShiftsLeft(String array[][])
    {
    
        int row = 0;
        int col = 0;
        String[] value = null;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        if(col==0)
            return false;
        else
            return true;
        
    
    }
    public boolean IsShiftsRight(String array[][])
    {
        int row = 0;
        int col = 0;
        String[] value = null;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        if(col==2)
            return false;
        else
            return true;   
    
    }
    public boolean IsShiftsUp(String array[][])
    {
        int row = 0;
        int col = 0;
        String[] value = null;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        if(row==0)
            return false;
        else
            return true;      
    }
    public boolean IsShiftsDown(String array[][])
    {
        int row = 0;
        int col = 0;
        String[] value = null;   
        
        value= LocateBlank(array).split("\\ ");
        row = Integer.parseInt(value[0]);
        col= Integer.parseInt(value[1]);
        
        if(row==2)
            return false;
        else
            return true;       
    
    }
    public String LocateBlank(String array[][])
    {
        String deger=null;
        
              for(int i=0;i<3;i++)
              
                for(int j=0;j<3;j++)
                {
                if(array[i][j].equals("X"))
                {
                    
                    deger=Integer.toString(i)+" "+Integer.toString(j);
                    return deger;
                }
                }
              return null;
              
    }
   
        public void CreateSolveSpace(String array[][])
    {
        
        if(IsShiftsLeft(array))
        {
          initial=ShiftLeft(initial);
           Tahta tahta= new Tahta();
           tahta.SetInitial(initial);
            
            this.CreateSolveSpace(ShiftLeft(tahta.GetInitial()));
            children.add(tahta);
        }
        if(IsShiftsRight(array))
        {
           temp=null;
           temp=ShiftRight(initial);
           Tahta tahta= new Tahta();
           tahta.SetInitial(temp);
            
           this.CreateSolveSpace(ShiftRight(tahta.GetInitial()));
           children.add(tahta);
        }
     
        if(IsShiftsUp(array))
        {
            
           initial=ShiftUp(initial);
           Tahta tahta= new Tahta();
           tahta.SetInitial(initial);
           
           this.CreateSolveSpace(ShiftUp(tahta.GetInitial()));
           children.add(tahta);
        }
     
        if(IsShiftsDown(array))
        {
           initial=ShiftDown(initial);
           Tahta tahta= new Tahta();
           tahta.SetInitial(initial);
           
            this.CreateSolveSpace(ShiftUp(tahta.GetInitial())); 
               children.add(tahta);
        }   
     
    }
    public void Solve()
    {
      for(int i=0;i<children.size();i++)
      {
          
        
         System.out.println(children);
      
      }
    
    }
    
}
