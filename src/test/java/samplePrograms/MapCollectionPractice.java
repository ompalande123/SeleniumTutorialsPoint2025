package samplePrograms;

import java.util.Map;
import java.util.TreeMap;

public class MapCollectionPractice{

    public static void main(String args[]){

        /*
            1. HashMap
                - stores key-value pairs
                - allows null values and one null key
                - does not maintain any order
                - does not allow duplicate keys
        
        */

        java.util.Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        hashMap.put(null, 4);
        hashMap.put(null, 5); // This will overwrite the previous null key
        System.out.println("HashMap: " + hashMap);

        /*
            2. TreeMap
                - stores key-value pairs
                - does not allow null keys (but allows null values)
                - maintains ascending order of keys
                - does not allow duplicate keys
        
        */
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Cherry", 3);
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        // treeMap.put(null, 4); // This will cause a NullPointerException
        System.out.println("TreeMap: " + treeMap);


        /*
            3. LinkedHashMap
                - stores key-value pairs
                - allows null values and one null key
                - maintains insertion order
                - does not allow duplicate keys
        
        */
        Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        linkedHashMap.put(null, 4);
        linkedHashMap.put(null, 5); // This will overwrite the previous null key
        System.out.println("LinkedHashMap: " + linkedHashMap);


    }

}    
