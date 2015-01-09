/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author yasin
 */
public class Lab52 {
 
 
        
        public static void main(String[] args){
 
              
                Node n1 = new Node("S",4);
                Node n2 = new Node("A",2);
                Node n3 = new Node("B",6);
                Node n4 = new Node("C",2);
                Node n5 = new Node("D",3);
                Node n6 = new Node("G",0);

                       
 
               
 
             
                n1.adjacencies = new Edge[]{
                        new Edge(n2,1),
                        new Edge(n6,12),
                       
                };
                 
              
                n2.adjacencies = new Edge[]{
                        new Edge(n3,3),
                        new Edge(n4,1)
                };
                 
 
             
                n3.adjacencies = new Edge[]{
                        new Edge(n5,3),
                        
                };
                 
               
                n4.adjacencies = new Edge[]{
                        new Edge(n5,1),
                        new Edge(n6,2),
                        
                };
                 
 
               
                n5.adjacencies = new Edge[]{
                        new Edge(n6,3),
 
               
                       
                };
                 
                 n6.adjacencies = new Edge[]{
                        new Edge(n6,0),
 
               
                       
                }; 

                 

 
                AstarSearch(n1,n6);
 
                List<Node> path = printPath(n6);
               
                        System.out.println("Path: " + path);
                        
 
 
        }
 
        public static List<Node> printPath(Node target){
                List<Node> path = new ArrayList<Node>();

        for(Node node = target; node!=null; node = node.parent){
            path.add(node);

        }
 
        Collections.reverse(path);

        return path;
        
        }
        

 
        public static void AstarSearch(Node source, Node goal){
 
                Set<Node> explored = new HashSet<Node>();
 
                PriorityQueue<Node> queue = new PriorityQueue<Node>(20, 
                        new Comparator<Node>(){
                             
                 public int compare(Node i, Node j){
                    if(i.f_scores > j.f_scores){
                        return 1;
                    }
 
                    else if (i.f_scores < j.f_scores){
                        return -1;
                    }
 
                    else{
                        return 0;
                    }
                 }
 
                        }
                        );
 
                
                source.g_scores = 0;
 
                queue.add(source);
 
                boolean found = false;
 
                while((!queue.isEmpty())&&(!found)){
 
                     
                        Node current = queue.poll();
 
                        explored.add(current);
 
                   
                        if(current.value.equals(goal.value)){
                                found = true;
                        }
 
                     
                        for(Edge e : current.adjacencies){
                                Node child = e.target;
                                double cost = e.cost;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;
 
 
                         
                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                        continue;
                                }
 
                                
                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){
 
                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;
 
                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }
 
                                        queue.add(child);
 
                                }
 
                        }
 
                }
 
        }
        
}
 
class Node{
 
        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public Edge[] adjacencies;
        public Node parent;
 
        public Node(String val, double hVal){
                value = val;
                h_scores = hVal;
        }
 
        public String toString(){
                return value;
        }
 
}
 
class Edge{
        public final double cost;
        public final Node target;
 
        public Edge(Node targetNode, double costVal){
                target = targetNode;
                cost = costVal;
        }
}