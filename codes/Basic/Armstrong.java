package Basic;
import java.util.Scanner;
public class Armstrong {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number :");
int num = sc.nextInt();
int original = num;
int temp =num;
int count = 0;
while (temp > 0){
    temp = temp /10;
    count++; 
}
temp = num;
int sum =0;
while (temp>0){
    int digit = temp % 10;
    sum += Math.pow(digit, count);
    temp = temp /10;

}
if (sum==original){
    System.out.println("The given number " +original+ " is a armstrong number.");
}else 
{
     System.out.println("The given number " +original+ " is not a armstrong number.");
}
sc.close();
}
}