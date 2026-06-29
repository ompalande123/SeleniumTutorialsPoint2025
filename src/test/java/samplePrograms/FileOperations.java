package samplePrograms;

import java.io.File;
import java.util.Scanner;

public class FileOperations {
    
    public static void main(String args[]){

        File myFile=new File("C:\\Sample Files\\sampleTextFile.txt");
        System.out.println("File name: "+myFile.getName());
        System.out.println("File path: "+myFile.getPath());
        System.out.println("Absolute path: "+myFile.getAbsolutePath());
        System.out.println("Can read: "+myFile.canRead());
        System.out.println("Can write: "+myFile.canWrite());
        System.out.println("File size in bytes: "+myFile.length());


        // Create a new file
        File newFile= new File("C:\\Sample Files\\newFile.txt");
        try{
            if(newFile.createNewFile()){
                System.out.println("File created: "+newFile.getName());
            }else{
                System.out.println("File already exists.");
            }
           }catch(Exception e){
            e.printStackTrace();
        }



        // Read a file
        File readMyFile=new File("C:\\Sample Files\\sampleTextFile.txt");
        try{
            Scanner myReader=new Scanner(readMyFile);
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
}

}
