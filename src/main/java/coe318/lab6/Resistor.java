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
public class Resistor {
    
    public double resistance;
    public Node node1;
    public Node node2;
    public int resistorID;
    
    
    
public Resistor(double res ,Node n1,Node n2){ 

    if(n1==null || n2==null){
        throw new IllegalArgumentException("Error:Nodes must exist");
    }
    if(res <0){
        throw new IllegalArgumentException("Error:The resistance cannot be negative");
    }
   
    this.resistance =res;
    this.node1=n1;
    this.node2=n2;
   
    

}

public Node [] getNodes(){
    Node [] node ={this.node1,this.node2};
    return node;
}

      
      @Override
    public String toString(){
      
        return("R"+resistorID+" "+node1+" "+node2+" "+resistance);
    }
    

    
    /*public static void main(String[] args) {
        Circuit a=Circuit.getInstance();
Node A= new Node(1);
Node B=new Node(2);
Resistor r1= new Resistor(-2.0,A,B);
System.out.println(r1.toString());
}*/
}

