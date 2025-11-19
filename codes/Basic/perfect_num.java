package Basic;
import java.util.ArrayList;
import java.util.Scanner;
public class perfect_num {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                numbers.add(i);
            }
        }
        int result = 0;
        for (int i=0;i<numbers.size();i++){
            result = result + numbers.get(i);
        }
        if(result==num){System.out.println("perfect number");}
        else{System.out.println("Not a perfect number.");}

        sc.close();
    }
}
