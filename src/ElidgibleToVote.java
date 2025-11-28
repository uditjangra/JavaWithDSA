import java.util.Scanner;

public class ElidgibleToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(elidgible(age)){
            System.out.println("The person is elidgible to vote");
        }else{
            System.out.println("The person is not elidgible to vote");
        }
    }
    public static boolean elidgible(int age){
        return age > 17;
    }
}
