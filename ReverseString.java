//WAP to reverse a String.
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String =");
            String name=sc.next();
            int len = name.length();
            String rev = "";
            
            for (int i = len-1; i >=0; i--) {
                rev = rev + name.charAt(i);
            }
            System.out.println("Reverse of "+name+" is "+rev);

        }
    }
}
