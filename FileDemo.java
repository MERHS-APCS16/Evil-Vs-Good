package filesdemo;

import java.io.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {

    private static ArrayList<String> strings;
    private int size;

    public FileDemo() {

        strings = new ArrayList();
        size = 0;

    }

    public static void main(String[] args) {
        FileDemo demo = new FileDemo();
        String folder = System.getProperty("user.dir"); //the project folder
        //make sure data file is in the main project folder
        String inputFileName = folder + "/Scenarios.txt";
        String outputFileName = folder + "/newNamesAndNumbers.txt";
        demo.readFromFile(inputFileName);
        System.out.println(strings.size());
        for (String s : strings) {
            System.out.println(s);
        }
        // demo.saveToFile(outputFileName);
    }

    private void readFromFile(String fileName) {
        int i = 0;
        try {
            FileInputStream ifStream = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(ifStream);
            i = isr.read();
            while (i != -1) {//read chars until end of file
                String str = new String();
                str += (char) i;
                while (i != '\n') {//get the first string
                    char ch = (char) i;
                    str += ch;
                    i = isr.read();
                }
                strings.add(str);
                i = isr.read();
                String str2 = new String();
                str2 += (char) i;
                while (i != '\n') {//get the second string
                    char ch = (char) i;
                    str2 += ch;
                    i = isr.read();
                }
                strings.add(str2);
                i = isr.read();
                String str3 = new String();
                str3 += (char) i;
                while (i != -1 && i != '\n') {//get the third string
                    char ch = (char) i;
                    str3 += ch;
                    i = isr.read();
 
                }
                strings.add(str3);
                i = isr.read();
            }  //end try
        } catch (Exception e) {
            System.out.println("File not found.");
        }
        System.out.println("done getting data from file");
    }

    // Saves lists to a text file.
    private void saveToFile(String fileName) {
    }
}
