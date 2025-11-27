import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_eof{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.*/
        Scanner sc = new Scanner(System.in);
        
        int lineNumber = 1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(lineNumber + " " + s);
            lineNumber++;
        }
    }
}