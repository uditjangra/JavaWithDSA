import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isPrime(input));

    }
    public static boolean isPrime(int input){
        if(input<=1){
            return false;
        }
        if(input==2 || input==3){
            return true;
        }
        if(input%2==0||input%3==0){
            return false;
        }
        //66% Numbers
        for(int i = 5; i <= Math.sqrt(input); i=i+6){
            if(input%i==0||input%(i+2)==0){
                return false;
            }
        }
        //6k+i   (-1,0,1,2,3,4)
        return true;
    }
}
