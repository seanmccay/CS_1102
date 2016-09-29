/**
 * Created by Sean on 9/28/2016.
 */

import java.util.*;

public class FirstSubroutines {
    public static void main(String[] args) {
        String again = "y";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something to determine whether or not it is a palindrome.");

        do{
            System.out.print(">>   ");
            String str = scanner.nextLine();

            String stripped = Strip(str);
            String reversed = Reverse(stripped);

            System.out.println("Stripped: " + stripped);
            System.out.println("Reversed: " + reversed);

            System.out.println(IsPalindrom(stripped, reversed));
            System.out.println();
            System.out.print("Would you like to enter another? (Y/N) ");
            again = scanner.nextLine();
            System.out.println();
            System.out.println();
        }while(again.trim().equalsIgnoreCase("y"));
    }

    public static String Reverse(String str){
        String reverse = "";
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static String Strip(String str){
        String stripped = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                stripped += str.charAt(i);
            }
        }

        return stripped;
    }

    public static String IsPalindrom(String str, String reversed){
          if(str.equalsIgnoreCase(reversed)) return "This IS a palindrome.";

          return "This is NOT a palindrome.";
    }
}
