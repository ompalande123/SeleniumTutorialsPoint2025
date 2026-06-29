package samplePrograms;

public class PatternPrograms {
    
    public static void main(String args[]){

        // 1. print rectangle pattern
        /*
        Logic:
        - I need to print * stars vertically and horizontally
        - I can use 2 for loops
        - 1 for loop will control the horizontal limit
        - another for loop will control vertical limit
        
        
        */
        for(int i=0; i<5;i++){
            System.out.println("*");
            for(int j=0;j<5;j++){
                System.out.print("*");
            }

        }



    }


}
