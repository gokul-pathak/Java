import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//        System.out.println("Loop done");

        //A for loop is usually used to execute a piece of code for specific
        // number of times.

        //print odd numbers
        //2n = even numbers = 0,2,4,6,8.....
        //2n+1 = odd numbers = 1,3,5,7,9......

        /*
        * 1. decrementing for loop
        * for(int i=5; i!=0; i--;){
        * System.out.println(i);
        * }
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int num = scan.nextInt();
        System.out.println("\n Odd numbers from 1 to "+ num);
//        int num= 3;
        for (int i = 0; i < num; i++){
//            System.out.println(2*i+1);
            if(i%2!=0){//if i%2 is not equal to zero, the number is odd
                System.out.println(i);
            }
        }
        System.out.println("Thanks for using our application....done");
    }
}
