/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ammar
 */
public class listImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        /*ArrayList*/
        
        List<String> l=new ArrayList<String>();
        
        l.add("a");
        l.add("b");
        l.add("X");
        l.add("c");
        
        Iterator<String> it=l.iterator();
       
        while(it.hasNext()){
        System.out.println(it.next());
        }
       
        
       
    }  
           
        
        
        
        
    }
    

