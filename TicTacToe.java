import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = (n-1)/3;
        int j = (n-1)%3;
        System.out.print(i+" "+j);
        
    }
}
