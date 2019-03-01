/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author ammar
 */
public class hashsetImp {
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
              
           set.add("casd");   
           set.add("dva");
           set.add("dva");
           set.add("aee");    
           set.add("bvg"); 
           set.add("eer");  
           
           set.add("1");
           set.add("2");
           set.add("3");
           set.add("0");
           set.add("5");
           
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
           //NO duplicates & No insertion order.
           
           
 }  
    
    
}
