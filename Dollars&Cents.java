import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();
        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();
        int Sum_cent = cent1 + cent2;

        int res1 = dollar1+dollar2+(Sum_cent/100);
        int res2 = Sum_cent%100;
        
        
        System.out.println(res1);
        System.out.println(res2);
        
    }
}
