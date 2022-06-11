import java.util.Scanner;
public class Hellouser {
    public static void main(String[] args) {
        //q3
        System.out.println("What is your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(" Hello "+ name + " Have a good day!! ");
    }
}
