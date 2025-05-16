import java.util.Scanner;
public class removeDuplicate {

    public static int[] arr = new int[256];
    public static String result = ""; 

    public static void remove_duplicate(String str, String ans) {
        
        if (str.length() == 0) {
            result = ans;
            return;
        }

        char c = str.charAt(0);
        
        if (arr[c] == 0) {
            arr[c]++; 
            
            remove_duplicate(str.substring(1), ans + c);
        } else {
           
            remove_duplicate(str.substring(1), ans);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        remove_duplicate(input, "");
        System.out.println("result: " + result);
    }
}
