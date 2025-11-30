import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp =  Math.abs(number);
        while(temp != 0){
            reverse = (reverse*10) + (temp%10);
            temp = temp/10;
        }
        return(reverse==number);
    }
}
