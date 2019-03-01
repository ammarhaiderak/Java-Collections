/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author ammar
 */
public class hashmapImp {
    
    public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"a");    
      hm.put(101,"b");    
      hm.put(102,"c");   
       
      System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(102, "d");  //as we have already added element with key 
                                 //102 so it will not overwrite the existing record
      
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(104,"e");  
      map.putAll(hm);  
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
     }

}
