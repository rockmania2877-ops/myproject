import java.util.Scanner;
class Bank{
    double initial,deposit,withdraw,balance;
    int choice;
void getTransaction(Scanner sc,int i){
        System.out.println("----Enter the following details for account holder "+(i+1)+"----");
        System.out.print("Enter the inital deposit : ");
        initial = sc.nextDouble();
        System.out.print("\nEnter the choice (1-deposit || 2-Withdraw || 3-To view the balance) : ");
        choice = sc.nextInt();    
}
void Choice(Scanner sc,int i){
    if(choice==1){
        System.out.print("Enter the Deposit : ");
        deposit = sc.nextDouble();
        balance = initial + deposit;
    }
    else if(choice==2){
         System.out.print("Enter the amount to Withdraw : ");
         withdraw = sc.nextDouble();
         balance = initial - withdraw;
    }else if(choice==3){
        System.out.println("Balance Amount = "+initial);
        balance = initial;
    }else{
        System.out.print("Invalid Choice.");
    }
}    
void Display(){
    System.out.println("Initial Amount : "+initial);
    System.out.println("Updated Amount : "+balance+" cr");
}
};
    

public class bankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of Account Holders : ");
        int n = sc.nextInt();

        Bank[] banks = new Bank[n];
        
    for(int i=0;i<n;i++){
    banks[i] = new Bank();
    banks[i].getTransaction(sc,i);
    banks[i].Choice(sc,i);
    }
    System.out.print("----Transaction Details----");
    for(int i=0;i<n;i++){
        System.out.print("\nAccount Holder "+(i+1)+"\n");
        banks[i].Display();
    }
    sc.close();
}
}
