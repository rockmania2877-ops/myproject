import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String text = sc.nextLine();
        System.out.print("Enter the Substring : ");
        String word = sc.nextLine();

        String lowertext = text.toLowerCase();
        String lowerword = word.toLowerCase();
       
        int m = text.length();
        int n = word.length();
        boolean found = false;
        for (int i=0;i<=m-n;i++){
             boolean match = true;
            for(int j=0;j<n;j++){
                if(lowertext.charAt(i+j)!= lowerword.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                found = true;
                System.out.println("Kedachiruchu! at "+i);
            
        }
        }
        if(!found){
                 System.out.println("Kedaikala!"); 
            }
        sc.close();        
    }
}
