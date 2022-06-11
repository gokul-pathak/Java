import jdk.swing.interop.SwingInterOpUtils;

public class logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For Logical OR...");
        boolean a1 = true;
        boolean b1 = true;
        boolean c1 = true;
        if (a1 || b1 || c1) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical NOT.....");
        boolean a2 = true;
        boolean b2 = true;
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
