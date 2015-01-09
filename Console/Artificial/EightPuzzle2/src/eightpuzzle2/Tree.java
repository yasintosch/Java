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
import java.util.ArrayList;
import java.util.List;


public class Tree<T> {
 
    private Node<T> rootElement;
     

    public Tree() {
        super();
    }
 
  
    public Node<T> getRootElement() {
        return this.rootElement;
    }
 
 
    public void setRootElement(Node<T> rootElement) {
        this.rootElement = rootElement;
    }
     
 
    public List<Node<T>> toList() {
        List<Node<T>> list = new ArrayList<Node<T>>();
        walk(rootElement, list);
        return list;
    }
     
 
    public String toString() {
        return toList().toString();
    }
     

    private void walk(Node<T> element, List<Node<T>> list) {
        list.add(element);
        for (Node<T> data : element.getChildren()) {
            walk(data, list);
        }
    }
}



