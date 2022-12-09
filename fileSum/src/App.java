import java.util.*;
import java.io.*;

public class App {
    //Global reading object
    static Scanner myReader = new Scanner(System.in);
    //Our file, available to every method
    static File myFile = new File("C://Users//Da//Desktop//Studying Java//fileSum//fileSum//src//myFile.txt");

    //Creates our file
    static void CreateFile() throws IOException{

        //verifying if our file is actually created || not
        if(myFile.createNewFile()){
            System.out.println("Your file was successfully created");
        }else{
            System.out.println("There's been an error while creating your file");
        }
    }

    //Writes into our file
    static void WriteFile() throws IOException{
        //our writing object
        FileWriter myWriter = new FileWriter(myFile);

        //writing into our file
        
        /*
         * Exercice: Write 5 numbers into a file and
         * preset the sum between them
        */

        //our counter
        int t=0;

        while(t<5){
            myWriter.write(Integer.toString(t*4+1)+"\n");
            t++;
        }

        //closing our objects
        myWriter.close();
        myReader.close();

    }

    //Reads our file content
    static void ReadFile() throws IOException{
        //store's our file numbers and the sum of them
        int numbers=0, sumNumbers=0;
        //our file reader object
        Scanner fileScanner = new Scanner(myFile);

        //reading our file's content
        while(fileScanner.hasNextLine()){
            numbers = Integer.parseInt(fileScanner.nextLine());
            sumNumbers = sumNumbers + numbers;
        }

        //displaying the result
        System.out.println("Result:"+sumNumbers);

        fileScanner.close();
    }
    public static void main(String[] args) throws IOException{
        CreateFile();
        WriteFile();
        ReadFile();

    }
}