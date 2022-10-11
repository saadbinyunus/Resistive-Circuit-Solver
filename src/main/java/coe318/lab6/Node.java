/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author USER
 */
public class Node {
    
    
    int nodeidnum;
    static int count =0;

    public Node(int nodeidnum) {
        this.nodeidnum = nodeidnum;
        this.nodeidnum = count;
        
        count++;
    }
 
     @Override
    public String toString(){
      
        return("" + this.nodeidnum);
    }
    
    

    
}
 

