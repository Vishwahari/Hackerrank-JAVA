import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price1 = sc.nextInt();
        int discount1 = sc.nextInt();
        int charge1 = sc.nextInt();
        
        int price2 = sc.nextInt();
        int discount2 = sc.nextInt();
        int charge2 = sc.nextInt();
        
        int price3 = sc.nextInt();
        int discount3 = sc.nextInt();
        int charge3 = sc.nextInt();
        
        int flipkart = (int)(price1-(price1*(discount1*0.01)) + charge1);
        int snapdeal = (int)(price2-(price2*(discount2*0.01)) + charge2);
        int amazon = (int)(price3-(price3*(discount3*0.01)) + charge3);
        
        System.out.println("In Flipkart: Rs."+flipkart);
        System.out.println("In Snapdeal: Rs."+snapdeal);
        System.out.println("In Amazon: Rs."+amazon);
        
        if(flipkart<=snapdeal && flipkart<=amazon){
        System.out.println("Choose Flipkart");
        }
        else if(snapdeal<=flipkart && snapdeal<=amazon){
            System.out.println("Choose Snapdeal");
        }
        else{
            System.out.println("Choose Amazon");
            }
    }
}
