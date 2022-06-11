import java.util.Scanner;
public class comparisonNumber {
    public static void main(String[] args) {
        //wap in java to use comparison operators to find out whether a given number
        // is greater than the user entered number or not.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int a = scan.nextInt();
        System.out.println(a>8);
    }
}
