import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, i = 1, Factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        while (i <= n) {
            Factorial = Factorial * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + Factorial);
    }
}
