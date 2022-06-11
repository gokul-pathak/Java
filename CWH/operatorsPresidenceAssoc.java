public class operatorsPresidenceAssoc {
    public static void main(String[] args) {
        System.out.println("1. Precedence & Associativity ");
        //Precedence & Associativity
        int a = 6 * 5 - 34 / 2;
        /*
        Highest precedence goes to * and /. They are evaluated on the basis of left to right associativity
        * =30-34/2
        * =30-17
        * =13
        * */

        int b = 60 / 5 - 34 *2;
        /*
        * 12 - 34 * 2
        * 12 - 68
        * = - 56
        * */
        System.out.println(a);
        System.out.println(b);

        //qn 1
        System.out.println("-------------------------");
        int x = 6;
        int y= 1;
        int k = x * y/2;  //qn= x-y/2
        System.out.println(k);

        //qn 2
        System.out.println("---q2"); // qn=g^2-4lm/2l actual qn = b^2-4ac/2a
        int g = 0, l = 10, m = 0;
        int r = (g*g - 4*l*m)/(2*l);
        System.out.println(r);
    }
}
