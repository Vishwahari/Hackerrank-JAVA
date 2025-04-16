import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int a = Math.abs(num);
        int b = a/1000;
        int c = a%10;
        int result = b+c;
        System.out.println(result);
    }
}
