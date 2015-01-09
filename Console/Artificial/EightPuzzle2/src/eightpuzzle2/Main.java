/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle2;

/**
 *
 * @author yasin
 */
import java.util.*;

public class Main {

        /**
         * @param args
         */
       
        public static void main(String[] args) {
               
               
                int[] initial = {0, 1, 3, 4, 2, 5, 7, 8, 6};
                int hueristic = 2;
                EightPuzzle start = new EightPuzzle(initial, hueristic, 0);
                int[] win = { 1, 2, 3,
                                          4, 5, 6,
                                          7, 8, 0};
                EightPuzzle goal = new EightPuzzle(win, hueristic, 0);

               
                astar(start, goal);

               

        }
       
        public static void astar(EightPuzzle start, EightPuzzle goal)
        {
                if(start.inversions() % 2 == 1)
                {
                        System.out.println("Unsolvable");
                        return;
                }

                LinkedList<EightPuzzle> closedset = new LinkedList<EightPuzzle>();

                PriorityQueue<EightPuzzle> openset = new PriorityQueue<EightPuzzle>();

                openset.add(start);
               

                while(openset.size() > 0){

                        EightPuzzle x = openset.peek();


                        if(x.mapEquals(goal))
                        {

                                 Stack<EightPuzzle> toDisplay = reconstruct(x);
                                 System.out.println("Printing solution... ");
                                 System.out.println(start.toString());
                                 print(toDisplay);
                                 return;
                                 
                        }

                        closedset.add(openset.poll());
                        LinkedList <EightPuzzle> neighbor = x.getChildren();
           
                        while(neighbor.size() > 0)
                        {
                                EightPuzzle y = neighbor.removeFirst();

                                if(closedset.contains(y)){

                                        continue;
                                }

                                if(!closedset.contains(y)){

                                        openset.add(y);

                                }

                        }

                }
        }

        public static void print(Stack<EightPuzzle> x)
        {
                while(!x.isEmpty())
                {
                        EightPuzzle temp = x.pop();
                        System.out.println(temp.toString());
                }
        }

        public static Stack<EightPuzzle> reconstruct(EightPuzzle winner)
        {
                Stack<EightPuzzle> correctOutput = new Stack<EightPuzzle>();
               
                while(winner.getParent() != null)
                {
                correctOutput.add(winner);
                winner = winner.getParent();
                }
               

                return correctOutput;
        }
       
        }


