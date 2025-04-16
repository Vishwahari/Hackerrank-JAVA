import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        float CGPA = sc.nextFloat();
        char Grade = sc.next().charAt(0);
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("CGPA: "+(int)(CGPA*100)/100.0f);
        System.out.println("Grade: "+Grade);
        
    }
}
