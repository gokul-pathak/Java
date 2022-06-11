import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find out factorial:");
        int num = scan.nextInt();
        while(i<=num){
            fact = fact*=i;
            i++;//increment i by 1
        }
        System.out.println("\n\t Factorial of " + num + " is: " + fact);

        //what is factorial n = n*n-1*-2......1
        //5!= 5*4*3*2*1
    }

//     do {
//        fact = fact * i;
//        i++;
//    } while( i <= num );
}
