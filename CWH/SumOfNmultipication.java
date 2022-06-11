import java.util.Scanner;
public class SumOfNmultipication {
    public static void main(String[] args) {
        // wap in java to calculate the sum of the numbers occuring
        // to the multiplication table of n.
        System.out.println("Enter the number to find the sum table");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        System.out.printf("The sum of %d table is ", n);
        //for(int i = 0; i<10; i++) -> goes from i=0 to i=9
        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }
        System.out.println(sum);
    }
}
