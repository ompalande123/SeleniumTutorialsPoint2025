package samplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListCollectionPractice{

    public static void main(String args[]){

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");
        System.out.println("Names: " + names);

        Collections.sort(names);
        System.out.println("Sorted Names: " + names);

        Collections.reverse(names);
        System.out.println("Reversed Names: " + names);
        

    }


}