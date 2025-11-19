import java.util.Scanner;

public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of words : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the word "+(i+1)+" : ");
            arr[i] = sc.nextLine();
        }
        for(int k=0;k<n;k++){
            String word = arr[k];
      boolean isPalindrome = true;
      int l = 0;
      int r = word.length()-1;
      while(l<r){
        if(word.charAt(l)!= word.charAt(r)){
                isPalindrome = false;
                break;
        }
        l++;
        r--;
      }
      if(isPalindrome){
        System.out.println("The given string "+arr[k]+" is a palindrome.");
      }else{
        System.out.println("the given string "+arr[k]+" is not a palindrome.");
      }
      
    }
    sc.close();
    }
}
