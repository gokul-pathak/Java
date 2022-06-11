import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name = new String("gokul");
        System.out.println(name);

        //next
        String bname = "pathak";
        System.out.println(bname);


        //next
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and b is %f ", a, b);
        System.out.format("\nThe value of a is %d and b is %.2f ", a, b);//to show limited decimal point %8.2f, %.2f, etc

        //next
        System.out.println("\n\nEnter a string: ");
        Scanner scan = new Scanner(System.in);
        String st = scan.next(); //scan.nextLine();
        System.out.println(st);

    }
}
