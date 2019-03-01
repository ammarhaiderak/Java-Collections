/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author ammar
 */
public class vectorImp {
    
    public static void main(String args[]){
    
    java.util.Vector<String> vec = new java.util.Vector<String>(4);  
       
          //Adding elements to a vector  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Check size and capacity  
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity());  
          //Display Vector elements  
          System.out.println("Vector element is: "+vec);  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
          vec.addElement("Duck");
          vec.addElement("Penguin");
          
          //Again check size and capacity after two insertions  
          System.out.println("Size after addition: "+vec.size());  
          System.out.println("Capacity after addition is: "+vec.capacity());  
          //here capacity is 16 i.e almost double of 9
          for(int i=0;i<8;++i)//   adding 7 more elements to fill capacity to check new capacity
              vec.addElement("D");
          
          System.out.println("Size after addition: "+vec.size());  
          System.out.println("Capacity after addition is: "+vec.capacity());  
     
          
          System.out.println("Clearly the extension is double of previous as it gets full\n");
          
    
    }
    
    
}
