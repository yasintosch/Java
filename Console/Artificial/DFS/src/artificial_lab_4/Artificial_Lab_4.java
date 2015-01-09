/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial_lab_4;

/**
 *
 * @author yasin
 */
public class Artificial_Lab_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        int mat[][]=new int[8][8];
        mat[0][1]=1;
        mat[0][2]=1;
        mat[0][4]=1;
        mat[1][0]=1;
        mat[1][3]=1;
        mat[1][5]=1;
        mat[2][0]=1;
        mat[2][3]=1;
        mat[2][5]=1;
        mat[2][6]=1;
        mat[3][1]=1;
        mat[3][2]=1;
        mat[3][4]=1;
        mat[3][7]=1;
        mat[4][0]=1;
        mat[4][3]=1;
        mat[4][5]=1;
        mat[4][6]=1;        
        mat[5][1]=1;
        mat[5][2]=1;
        mat[5][4]=1;
        mat[5][7]=1;
        mat[6][2]=1;
        mat[6][4]=1;
        mat[6][7]=1;
        mat[7][3]=1;
        mat[7][5]=1;
        mat[7][6]=1;
        
        int[][]mat1=new int[8][8];
        mat1[0][1]=1;
        mat1[0][2]=1;
        mat1[0][4]=1;
        mat1[1][5]=1;
        mat1[2][3]=1;
        mat1[2][5]=1;
        mat1[2][6]=1;
        mat1[3][4]=1;
        mat1[3][7]=1;
        mat1[4][5]=1;
        mat1[5][7]=1;
        mat1[6][4]=1;
        mat1[6][7]=1;
        
System.out.println("Graph A");
DFS g=new DFS(mat,8);

System.out.println();

System.out.println("Graph B");
DFS g1=new DFS(mat1,8);

    }
    
}
