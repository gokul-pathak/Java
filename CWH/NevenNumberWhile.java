import java.util.Scanner;
public class NevenNumberWhile {
    public static void main(String[] args) {
        int sum = 0;
//        int n = 3;
        System.out.println("Enter the number to find first even numbers sum: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("The sum of "+ n +" first even number is: ");
        System.out.println(sum);
        //first 4 even number are - 0,2,4,6
    }
}
