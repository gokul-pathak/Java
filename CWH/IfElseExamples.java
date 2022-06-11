import java.util.Scanner;
public class IfElseExamples {
    public static void main(String[] args) {
        //-----------------------ex-1---------------------
//        int a = 11;
//        if(a=11){ //a=11 is a assign operator so that 's why this condition is wrong if the condition was a==11
//                            // this will not give wrong output
//
//        }

        //------------------------ex-2-----------------------------
        byte m1,m2,m3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = scan.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = scan.nextByte();

        System.out.println("Enter your marks in Bio");
        m3 = scan.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("overall percentage is: "+avg);
        if(avg>=40 && m1>=33 && m3>=33){
            System.out.println("Congraulations, You have been passed");
        }
        else{
            System.out.println("Sorry, Please contact to admin section!!");
        }



    }
}
