package Basic;

import java.util.Scanner;
public class time_conversion {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in minutes : ");
        int time = sc.nextInt();

        int hours=0;
        int min=0;
        if(time > 1){
        for (int i=0;i<=time;i++){
            hours = (time / 60);
            min = time % 60;
        }
        }
         System.out.println("The time is " +hours+ " hours " +min+ " minutes ");
        
        sc.close();
    }
    }


