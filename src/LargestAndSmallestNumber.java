import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scanner.nextInt();
        System.out.println("Enter the second number:");
        int second = scanner.nextInt();
        System.out.println("Enter the third number:");
        int third = scanner.nextInt();
        int largest = largest(first,second,third);
        int smallest = smallest(first,second,third);
        System.out.printf("The largest of %d ,%d and %d is %d", first, second, third, largest);
        System.out.printf("\nThe smallest of %d ,%d and %d is %d", first,  second, third, smallest);
    }
    public static int largest(int first, int second, int third) {
        int max = first;
        if(max < second){
            max = second;
        }
        if(second < third){
            max = third;
        }
        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }

}

