import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char le = sc.next().charAt(0);
        if (le =='a' || le =='e' || le =='i' || le =='o' || le == 'u' ||
            le == 'A' || le =='E' || le == 'I' || le == 'O' || le == 'U'){
            System.out.println("Vowel");
        }
        else if (le>='a' && le<='z' || le>='A' && le<='Z'){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Not an alphabet");
        }
        
        
    }
}
