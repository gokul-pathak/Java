import java.util.Scanner;
public class stringIFelse {

    public static void main(String[] args) {
        //-------------------------------ex-6----------------------
        /*wap in java to find out the type of website from the url
         * .com -> commercial website
         * .org -> organizational website
         * .np -> Nepali website
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the website name: ");
        String website = scan.next();
        if(website.endsWith(".com")){
            System.out.println("This is a Commercial website!!");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is a Organizational website!!");
        }
        else if(website.endsWith(".np")){
            System.out.println("This is a Nepali website!!");
        }
        System.out.println("Thanks for using our application!!!GP");

    }

}
