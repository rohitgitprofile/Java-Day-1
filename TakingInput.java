import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num_1 = sc.nextInt();
        System.out.println("The entered number is " + num_1);
        System.out.println("Enter second number");
        int num_2 = sc.nextInt();
        System.out.println("Entered number is " + num_2);
        int sum = num_1 + num_2;
        System.out.println("Sum of the two numbers are " + sum);

    }
}