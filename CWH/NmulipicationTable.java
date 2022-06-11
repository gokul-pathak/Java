import java.util.Scanner;
public class NmulipicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number to find multipilication table: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //for(int i = 0; i<10; i++) -> goes from i=0 to i=9
        for (int i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);

        }
    }
}
