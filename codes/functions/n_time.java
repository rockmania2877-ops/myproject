package functions;
import java.util.Scanner;
public class n_time {
static String times(int a,String word){
    String sol = word; 
    String result = " ";
    String len=" ";
    String thank = "----Thank you----";
    for (int i = 1;i<=a;i++){
        result = len + sol;
        System.out.println(result);
    }
    return thank;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the word : ");
    String pechu = sc.nextLine();

    System.out.print("Enter the no.of times : ");
    int num = sc.nextInt();

    System.out.println(" "+times(num,pechu)+" ");
    sc.close();
}
}