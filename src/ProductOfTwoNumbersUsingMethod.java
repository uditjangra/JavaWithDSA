import java.util.Scanner;

public class ProductOfTwoNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        int c = product(a,b);
        System.out.printf("The product of %d and %d is %d",a, b, c);
    }
    public static int product(int a, int b){
        return a*b;
    }
}
