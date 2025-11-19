import java.util.Scanner;
public class lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        
        int lcm=a;
        for(int i=2;i<=n;i++){
        System.out.print("Enter number "+i+ " : ");
        int b = sc.nextInt();

        if(lcm<b){
            lcm = b;
        }
        while (true){
            if (lcm % a == 0 && lcm % b == 0){
                break;
            }
                lcm ++;
            }
        a = lcm;
     }
     System.out.print("LCM of the given numbers : "+lcm);   
   sc.close();
   }
}
    

