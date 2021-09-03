package conditionals;
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("Your number is even!");
        } else if (num % 5 == 0){
            System.out.println("Your number is a multiple of 5!");
        } else if (num % 7 == 0){
            System.out.println("Your number is a multiple of 7, isn't even and isn't a multiple of 5!");
        } else {
            System.out.println("Your number is not even or a multiple of 7 or 5!");
        }
    }
}
