import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String word = sc.nextLine();

        int n = word.length();
        boolean isUnique = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(word.charAt(i) == word.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique) break;
        }
        if(isUnique){
            System.out.println("The given String '"+word+"' is Unique.");
        }else{
            System.out.println("The given String '"+word+"' is not Unique.");
        }
sc.close();
    }
    
}
