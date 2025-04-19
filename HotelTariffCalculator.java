import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        
        int f = r*d ;
        
        double peak = (r*(100+20)/100)*d;
        
        
        if (m==4 || m==5 || m==6 || m==11 || m==12){
            System.out.println((int)peak);
        }
        else if (m==1 || m==2 || m==3 || m==7 || m==8 || m==9 || m==10){
            System.out.println(f);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
