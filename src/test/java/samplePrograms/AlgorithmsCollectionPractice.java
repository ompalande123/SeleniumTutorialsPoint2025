package samplePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class AlgorithmsCollectionPractice {

    public static void main(String args[]){

    /*
        1. Binary Search Algorithm
            - used to search for an element in a sorted array
            - divides the array into halves and compares the target element with the middle element
            - time complexity: O(log n)
    */
    ArrayList<String> names = new ArrayList<>();
    names.add("Liam");
    names.add("Jenny");
    names.add("Kasper");
    names.add("Angie");

    Collections.sort(names); // must be sorted first
    int index = Collections.binarySearch(names, "Kasper");
    System.out.println("Kasper is at index: " + index);

    /*
        2. Maximum and Minimum Element in an Array
            - used to find the maximum and minimum element in an array
            - time complexity: O(n)
    
    */
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);

    System.out.println("Max: " + Collections.max(numbers));
    System.out.println("Min: " + Collections.min(numbers));


    /*
    3. Shuffle array list
        - used to shuffle the elements of an array list randomly
        - time complexity: O(n)
    
    */
        ArrayList<String> cards = new ArrayList<>();
    cards.add("Ace");
    cards.add("King");
    cards.add("Queen");
    cards.add("Jack");

    Collections.shuffle(cards);
    System.out.println(cards);


    /*
    4. Frequency of Elements 
        - used to find the frequency of each element 
        - time complexity: O(n)
    
    */
        ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Mango");

    int count = Collections.frequency(fruits, "Banana");
    System.out.println("Banana appears: " + count + " times");


        /*
        5. swap two elements 
            - used to swap two elements 
            - time complexity: O(1)
        
        */
    ArrayList<String> fruits1 = new ArrayList<>();
    fruits1.add("Apple");
    fruits1.add("Banana");
    fruits1.add("Orange");
    fruits1.add("Mango");

    Collections.swap(fruits1, 0, 2); // Swap first and third element
    System.out.println(fruits1);




    }






}
