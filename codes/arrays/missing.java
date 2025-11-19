import java.util.Scanner;

public class missing {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the no.of terms : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    Integer miss = null;
    String c = "";
    for(int i=0;i<n;i++){
        System.out.print("Enter the num"+(i+1)+" : ");
        arr[i] = sc.nextInt();
    }
    System.out.print("Elements of the array : ");
    for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
    }
    for(int i=0;i<n-1;i++){
        if(arr[i+1]==arr[i]+1){
        }else{
         miss = arr[i]+1;
           c = c+" "+miss;
        }
    }
    if(c==""){
        System.out.println("\nNo missing elements.");
    }else{
    System.out.println("\nMissing elements : "+c);
    sc.close();
    }
}
}
