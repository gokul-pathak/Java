import java.util.Scanner;
public class TaxDepartment {
    public static void main(String[] args) {
        //------------------------------------ex-3----------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income in lakhs: ");
        float income = scan.nextFloat();
        float tax = 0;

        if(income <= 2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);

    }
}
