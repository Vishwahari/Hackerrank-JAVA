import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int gold = sc.nextInt();
        int ben = sc.nextInt();
        int black = sc.nextInt();
        
        int op1 = gold*ben/100;
        int op1_1 = gold-op1;
        
        int op2 = op1_1*black/100;
        int op2_2 = op1_1-op2;
        
        int op3 = (op2_2/3);
        
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        
    }
}
