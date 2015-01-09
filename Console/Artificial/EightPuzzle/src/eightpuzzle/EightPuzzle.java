/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

/**
 *
 * @author yasin
 */
public class EightPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String[ ][ ] goal={
                      {"1","2","3"},
                      {"4","5","6"},
                      {"7","8","X"}, 
                     }; 
   String[ ][ ] initial={
                      {"X","1","3"},
                      {"4","2","5"},
                      {"7","8","6"}, 
                     };
        
        System.out.println("8-PUZZLE APPLICATION");
        System.out.println();
        System.out.println("Initial board position: ");
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
        System.out.print("|"+initial[i][j]+"|"+" ");
            }
           System.out.println();
        }
        
        System.out.println("Goal board position: ");
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
        System.out.print("|"+initial[i][j]+"|"+" ");
            }
           System.out.println();
        }        
        
        System.out.println(" Steps ");
        
        Tahta root =new Tahta();
        
        Solver solve=new Solver(root,goal);
//        System.out.println(solve.LocateBlank(initial));
        
//        String dizi[][]=solve.ShiftRight(initial);
//        dizi=solve.ShiftRight(dizi);
//        dizi=solve.ShiftLeft(dizi);
//        dizi=solve.ShiftDown(dizi);
//        dizi=solve.ShiftUp(dizi);
        
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//        System.out.print(dizi[i][j]);
//            }
//            System.out.println();
//        }
        solve.CreateSolveSpace(initial);
        //solve.Solve();
    }
    
}
