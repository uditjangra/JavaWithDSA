import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input%2==0){
            System.out.println("The input is even");
        }else{
            System.out.println("The input is odd");
        }
        if(usingBitwiseOR(input)){
            System.out.println("The input is Even according to BitwiseOR");
        }else{
            System.out.println("The input is Odd according to BitwiseOR");
        }
        if(usingBitwiseAND(input)){
            System.out.println("The input is Odd according to BitwiseAND");
        }else{
            System.out.println("The input is Even according to BitwiseAND");
        }
        if(usingBitwiseXOR(input)){
            System.out.println("The input is Even according to BitwiseXOR");
        }else{
            System.out.println("The input is Odd according to BitwiseXOR");
        }

    }
    public static boolean usingBitwiseOR(int input){
        return (input | 1) > input;
    }
    public static boolean usingBitwiseAND(int input){
        return ((input & 1) == 1);
    }
    public static boolean usingBitwiseXOR(int input){
        return ((input^1)==input+1);
        }
    }


