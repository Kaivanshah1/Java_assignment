package Practical7;

import java.io.*;
import java.util.*;

public class Prac_7 {
    public static int readInFile(String line, File file) throws Exception{
        FileReader fr = new FileReader(file);
        Scanner br = new Scanner(fr);
        String s = null;
        int countLine = 0;
        while(br.hasNextLine()){
            s = br.nextLine();
            countLine++;
            if(line.compareToIgnoreCase(s)==0)
                return countLine;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\Administrator\\Desktop\\New folder (2)\\Practical7\\NamesOFstudent.txt");
        System.out.println("Enter a name: ");
        String line = sc.nextLine();
        System.out.println(readInFile(line, file));
    }
}
