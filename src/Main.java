
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
