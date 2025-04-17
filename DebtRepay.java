import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float p = sc.nextFloat();
        float I = sc.nextFloat();
        float Y = sc.nextFloat();
        float result1 = ((p*I*Y)/100);
        float result2 = p + result1;
        float discount =result1*0.02f;
        float settlement = result2 - discount;
        System.out.printf("%.2f\n", result1);
        System.out.printf("%.2f\n", result2);
        System.out.printf("%.2f\n", discount);
        System.out.printf("%.2f\n", settlement);
    }
}
