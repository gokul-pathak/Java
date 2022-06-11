import javax.security.auth.Subject;
import java.util.Scanner;

class tSubject{
    int max = 100;
    int obtdm;
}
public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("*********Percentage Calculator******");
        tSubject s1 = new tSubject();
        System.out.println("Please Enter your English marks");
        Scanner scan = new Scanner(System.in);
        s1.obtdm = scan.nextInt();

        tSubject s2 = new tSubject();
        System.out.println("Please Enter your Nepali marks");
        s2.obtdm = scan.nextInt();

        tSubject s3 = new tSubject();
        System.out.println("Please Enter your Science marks");
        s3.obtdm = scan.nextInt();

        tSubject s4 = new tSubject();
        System.out.println("Please Enter your Social Std. marks");
        s4.obtdm = scan.nextInt();

        tSubject s5 = new tSubject();
        System.out.println("Please Enter your HPE marks");
        s5.obtdm = scan.nextInt();

        tSubject s6 = new tSubject();
        System.out.println("Please Enter your OPT Maths marks");
        s6.obtdm = scan.nextInt();

        tSubject s7 = new tSubject();
        System.out.println("Please Enter your OPT Education marks");
        s7.obtdm = scan.nextInt();

        tSubject s8 = new tSubject();
        System.out.println("Please Enter your Maths marks");
        s8.obtdm = scan.nextInt();

        int totalobtd = (s1.obtdm + s2.obtdm + s3.obtdm + s4.obtdm + s5.obtdm + s6.obtdm + s7.obtdm + s8.obtdm);
        int percentage = (totalobtd*100/800);
        System.out.println("Your total percentage is " + percentage);

    }
}
