import java.util.Scanner;
public class prime_no_between_limits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit : ");
        int m = sc.nextInt();
        System.out.print("Enter the upper limit : ");
        int n = sc.nextInt();
       
        if(m>n){
            System.out.println("Invalid 'm' should be lesser than 'n'");
        }else{
             System.out.print("Prime numbers between "+m+" and "+n+ " are : ");
            for(int i =m;i<=n;i++){
                if (i>1){
                  boolean isPrime=true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                    }
                    if(isPrime){
                    System.out.print(" "+i);
                    }
            }
            }
        }
        sc.close();
    }

}