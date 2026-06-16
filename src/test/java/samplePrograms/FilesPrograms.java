package samplePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.testng.annotations.Test;

/*
How to run programs in java in VS code:
# Run this specific test class
mvn test -Dtest=FilesPrograms

# Run specific test method
mvn test -Dtest=FilesPrograms#readFileTest

# Right click on class name and select Run Java
# Right click on method name and select Run Java

*/


public class FilesPrograms{


// 1. file programs in java to read a file and print its content in console    
@Test
public void readFileTest() throws IOException{
    System.out.println("Hello File");

    try (FileReader fr = new FileReader("src/test/resources/sample.txt");
         BufferedReader br = new BufferedReader(fr)) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

}


// 2. Read file and identify type of each character and count the number of characters, words and lines in the file

@Test
public void readFileAndCountTest() throws IOException {
    int charCount = 0;
    int wordCount = 0;
    int lineCount = 0;

    try (FileReader fr = new FileReader("src/test/resources/sample.txt");
         BufferedReader br = new BufferedReader(fr)) {
        String line;
        while ((line = br.readLine()) != null) {
            lineCount++;
            String[] words = line.split("\\s+");
            wordCount += words.length;
            charCount += line.replaceAll("\\s+", "").length();
        }
    }

    System.out.println("Character Count: " + charCount);
    System.out.println("Word Count: " + wordCount);
    System.out.println("Line Count: " + lineCount);

}

}