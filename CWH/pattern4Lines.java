import java.util.Scanner;
public class pattern4Lines {
    public static void main(String[] args) {
        //ex-1--------------------------
//        int n = 4;
        System.out.println("To print pattern \n\tEnter the number of lines:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=n; i>0; i--){ //decrement
            for(int j = 0; j<i; j++){ //increment
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
