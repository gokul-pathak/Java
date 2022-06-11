import java.util.Scanner;
public class fistNnaturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int num = scan.nextInt();
        System.out.println("\n Natural numbers from 1 to "+ num);
        int i = 1;
        while (i<=num) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println("Loop done");
    }
}
