import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = 3;
        int y1 = 4;
        int result1 = (x-x1)*(x-x1);
        int result2 = (y-y1)*(y-y1);
        double square = Math.sqrt(result1+result2);
        System.out.print(Math.round(square));
    }
}
