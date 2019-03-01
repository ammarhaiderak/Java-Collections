/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author ammar
 */
public class navigableMapImp {
public static void main(String args[]){
    NavigableMap<String, Integer >   object = new TreeMap<>();  
      object.put("C", 123);  
      object.put("T", 435);  
      object.put("B", 146);  
      object.put("S", 856);   

      
     System.out.println("The floor entry is given as : "+object.lowerEntry("C"));   //strictly less than "C" which is "B" 
  
     System.out.println("The floor entry is given as : "+object.floorEntry("C"));  //less or equal to "C" so that is C
     
     System.out.println("The lower key is given as : "+object.lowerKey("T"));       //strictly lesser than "T" but only returns KEY not Value
  }  

}
