import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int copies = sc.nextInt();
        int cost_per_copy = sc.nextInt();
        int cost_he_spend = sc.nextInt();
        
        int result = ((copies*cost_per_copy)-(copies*cost_he_spend)-100);
        
        System.out.println(result);
        
    }
}
