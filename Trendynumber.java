import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>=100 && num<1000){
            int a = num/10;
            a = a%10;
            if (a%3==0){
                System.out.println("Trendy Number");
            }
            else{
                System.out.println("Not a Trendy Number");
            }
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
