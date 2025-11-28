import java.util.Scanner;

public class AdditionOfTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        int c = add(a,b);
        System.out.printf("The sum of %d and %d is %d",a, b, c);
    }
    public static int add(int a, int b){
        return a+b;
    }
}
