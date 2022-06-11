import java.util.Scanner;
public class kmTOmiles {
    public static void main(String[] args) {
        float sum = 0;
        System.out.println("Calculator to convert Kilometer to Miles");
        System.out.println("Please enter digits to convert to miles");
        Scanner scan = new Scanner(System.in);
        float f1 = scan.nextFloat();
        sum = f1*0.621371f;
        System.out.println(sum);

    }
}
