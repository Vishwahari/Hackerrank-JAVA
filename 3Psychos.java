import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        
        float nearest1 = ((x1 + x2)/2);
        float nearest2 = ((y1 + y2)/2);
        
        System.out.print("Arun's house is located at" +"(" +nearest1 +"," +nearest2 +")");
    }
}
