import java.util.Scanner;

public class CircumferenceAndAreaUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int a = scanner.nextInt();
        CircumferenceAndArea(a);
    }
    public static void CircumferenceAndArea(float r){
        System.out.printf("The circumference of the Circle is %.2f",2*Math.PI*r);
        System.out.printf("\nThe area of the Circle is %.2f",Math.PI*r*r);
    }
}
