/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author ammar
 */
public class navigablesetImp {
 
    public static void main(String args[]){
    
        NavigableSet<Integer> set=new TreeSet<Integer>();
        
        //sorts data as TreeSet is used automatically
        
        set.add(9);
        set.add(2);
        set.add(5);
        set.add(0);
        set.add(2);        //NO duplicates so this will not be added again

       // {0,2,5,9}
        
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
        System.out.println(it.next()+"");
        }
        
        System.out.println("lower()->"+set.lower(2)); //strictly lesser than 2
        System.out.println("floor()->"+set.floor(3)); //>=3 so it should be 2
        System.out.println("upper()->"+set.higher(5));//strictly greater than 5
        System.out.println("ceiling()->"+set.ceiling(6));//greater or equal to 6
   
        
    }
        
    
}
