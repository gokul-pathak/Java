import java.util.Scanner;
public class TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user: ");
        Scanner sc = new Scanner(System.in); //system.in -> read from the keyboard object
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();



//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a + b;
//        float sum = a + b;

//        System.out.println("The sum of these numbers is ");
//        System.out.println(sum);
//        boolean b1= sc.hasNextInt();
//        System.out.println(b1);
        String str = sc.nextLine();   //sc.nextLine read full line &&& sc.next read only a word
        System.out.println(str);

    }
}
