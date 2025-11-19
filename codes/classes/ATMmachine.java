package classes;
import java.util.Scanner;
class ATM{
    int choice;
    double amount=100000;
    int pin=2807;
    double deposit;
    double withdraw;

void getDetails(Scanner sc){
    System.out.println("--- Please enter a Choice ---");
    System.out.println("1.Check Balance");
    System.out.println("2.Change Pin");
    System.out.println("3.Deposit");
    System.out.println("4.Withdrawal");
    System.out.println("5.Exit");
    System.out.print("CHOICE : ");
    choice = sc.nextInt();
}
void process(Scanner sc){
    switch (choice){
        case 1:
        System.out.print("Enter the Pin : ");
        int p = sc.nextInt();
       if(p==pin){
        System.out.println("Your Current Balance is Rs."+amount);
        break;
       }else{
        System.out.println("Incorrect Pin! Please Enter the Correct Pin number.");
        break;
       }

       case 2:
       System.out.print("Enter the Pin : ");
       int m = sc.nextInt();
       if(m==pin){
        System.out.print("Enter Your new Pin : ");
        int n = sc.nextInt();
        pin = n;
        System.out.println("Your Pin number is changed.Thank You!");
        break;
       }else{
         System.out.println("Incorrect Pin! Please Enter the Correct Pin number.");
         break;
       }

       case 3:
       System.out.print("Enter the Pin : ");
       int o = sc.nextInt();
       if(o==pin){
        System.out.print("Enter the Amount : ");
        deposit = sc.nextDouble();
        if(deposit < 0){
          System.out.println("Invalid Amount.");
          break;
        }else{
        amount = amount + deposit;
        System.out.println("Amount deposited Thank You.");
        System.out.println("Your current Balance is Rs."+amount);
        break;
        }
       }else{
         System.out.println("Incorrect Pin! Please Enter the Correct Pin number.");
         break;
       }

       case 4:
       System.out.print("Enter the Pin : ");
       int i = sc.nextInt();
       if(i==pin){
        System.out.print("Enter the Amount : ");
        withdraw = sc.nextDouble();
        if(withdraw < 0){
          System.out.println("Invalid Amount.");
          break;
        }
        else if(withdraw > amount){
          System.out.println("Insufficient Balance! Your current balance is Rs."+amount);
          break;
        }else{
          amount = amount - withdraw;
          System.out.println("Amount Withdrawn Thank You");
          System.out.println("Your current Balance is Rs."+amount);
          break;
        }
       }else{
         System.out.println("Incorrect Pin! Please Enter the Correct Pin number.");
         break;
       }

       case 5:
       System.out.println("Thank You for coming.");
       break;

       default:
       System.out.println("Invalid choice! Please enter a valid option.");
       break;
    }
  }
}
public class ATMmachine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Welcome Mr.Eshwar MD");

    ATM a1 = new ATM();
    do{
    a1.getDetails(sc);
    a1.process(sc);
    }while(a1.choice != 5 );
    sc.close();
  }   
}
