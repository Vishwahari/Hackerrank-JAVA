import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int unit = sc.nextInt();
        if (unit<=200){
            double consumed = unit*0.5;
            System.out.println("Rs."+(int)consumed);
        }
        else if(unit>200 && unit<=400){
            double consumed = unit*0.65+100;
            System.out.println("Rs."+(int)consumed);
        }
        else if(unit>400 && unit<=600){
            double consumed = unit*0.80+200;
            System.out.println("Rs."+(int)consumed);
        }
        else {
            double consumed = unit*1.25+425;
            System.out.println("Rs."+(int)consumed);
        }
    }
}
