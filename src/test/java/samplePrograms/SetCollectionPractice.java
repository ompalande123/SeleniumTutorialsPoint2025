package samplePrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Java Set
/*
    - used to store unique elements
    - does not allow duplicates

*/


class SetCollectionPractice{

    public static void main(String args[]){

        /*
            1. HashSet
                - does not maintain any order
                - allows null values (Only one null value is allowed)
                - does not allow duplicates
                - faster than TreeSet and LinkedHashSet
        
        */

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("");
        hashSet.add("");
        System.out.println("HashSet: " + hashSet);



        /*
            2. TreeSet
                - maintains ascending order
                - does not allow null values
                - does not allow duplicates
                - slower than HashSet and LinkedHashSet
        
        */

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(3);
        System.out.println("TreeSet: " + treeSet);


        /*
            3. LinkedHashSet
                - maintains insertion order
                - allows null values (Only one null value is allowed)
                - does not allow duplicates
                - slower than HashSet but faster than TreeSet
        
        */

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Bird");
        System.out.println("LinkedHashSet: " + linkedHashSet);



    }


}    