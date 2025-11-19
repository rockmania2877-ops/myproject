package Basic;

import java.util.Scanner;
public class electricity_bill {
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of units used : ");
    int unit = sc.nextInt();
    double bill;
    if(unit<100){
       bill = unit * 2.5;
    }else if(unit>=100 & unit<250) {
         bill=unit * 4.0;
    } else {
        bill = unit * 6.0;
    }
    System.out.println("Electricity Bill : "+ bill);
    sc.close();
    }
 }   

