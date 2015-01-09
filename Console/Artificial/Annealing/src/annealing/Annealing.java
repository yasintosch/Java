/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annealing;

import java.util.Random;

/**
 *
 * @author yasin
 */
public class Annealing {

    /**
     * @param args the command line arguments
     */
    
    static int table1[][]={
         {0,12,10},
         {4,0,8},
         {6,10,0}
                          };
     static int table2[][]={
            {10,4,8},
            {12,9,5}
                            };
    
    static int getSwitchTime(int job1,int job2)
    {
    return table1[job1][job2];
    }
   
    static int getMachineComputationTime(int mac,int job)
    {
    return table2[mac][job];
    }
    
    static int totaltime(int job1,int job2)
    {
    int mincom1=0;
    int mincom2=0;
    int mincom3=0;
        if(table2[0][job1]<table2[1][job1])
            mincom1=table2[0][job1];
        else
            mincom1=table2[1][job1];
        if(table2[0][job2]<table2[1][job2])
            mincom2=table2[0][job2];
        else
            mincom2=table2[1][job2];
        if(table2[0][3-job1-job2]<table2[1][3-job1-job2])
            mincom3=table2[0][3-job1-job2];
        else
            mincom3=table2[1][3-job1-job2];
        
      return  getSwitchTime(job1,job2)+getSwitchTime(job2,3-job1-job2)+mincom1+mincom2+mincom3;
        
    }
    
    
       static double acceptanceProbability(int energy, int newEnergy, double temperature) {
        // If the new solution is better, accept it
        if (newEnergy < energy) {
            return 1.0;
        }
        // If the new solution is worse, calculate an acceptance probability
        return Math.exp((energy - newEnergy) / temperature);
    }
       
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        double temp = 10;
        double coolingRate = 0.3;
        
        int currentSolution=table1[0][1]+table1[1][2]+table2[0][0]+table2[0][1]+table2[0][2];
        int bestSolution=currentSolution;
        
        System.out.println("Initial solution distance: " + bestSolution);
        
       int random[]=new int[3]; 
       Random rnd=new Random();
       int sayi;
       boolean durum=true;
       
       
        while (temp > 1)
        {
        
            int newSolution=currentSolution;
        
           for (int i = 0; i < random.length; i++)
            {
                while (durum)
                {
                    sayi = rnd.nextInt(3);

                        if (i == 0)
                    {
                        random[0] =sayi;
                        break; 
                    }
                        
                 for (int k = 0; k < i; k++)
                {
                        if (random[k] ==sayi) 
                    {
                        durum = true;
                          break; 
                     }
                        else
                        durum = false;
                }

                if (durum == false)
                    random[i] =sayi;
                }
                    durum = true;


            }       
            
            
             
            
            newSolution=totaltime(random[0],random[1]);
                    
            int currentEnergy = currentSolution;
            int neighbourEnergy =newSolution;
            
         if (acceptanceProbability(currentEnergy, neighbourEnergy, temp) > Math.random()) {
                currentSolution = newSolution;
            }

           
            if (currentSolution < bestSolution) {
                bestSolution = currentSolution;
            }
            
            
            temp *= 1-coolingRate;
        
        }
       
        System.out.println("Final solution distance: " + bestSolution);
        System.out.println("1.step");
        System.out.println("job"+(random[0]+1)+"->"+"job"+(random[1]+1));
     
        System.out.println("2.step");
        System.out.println("job"+(random[1]+1)+"->"+"job"+(3-random[1]-random[0]+1));
    }
    
}
