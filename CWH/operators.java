public class operators {
    public static void main(String[] args) {
        System.out.println("1. Arithemtic Operator");
        int a = 4;
        int b = 6 + a;
        int c= 6% a; //Module operator
        System.out.println(b);
        System.out.println(c);
        //8.655 % 2.5 --> returns decimal reminder

        System.out.println("2. Assignment Operators");
        int g = 9;
        int p = 2;
        g += 3; //add 3 in g
        p *=2;
        System.out.println(g);
        System.out.println(p);

        System.out.println("3. Comparison Operators");
        System.out.println(6==8); //64<5
        System.out.println(2<5);

        System.out.println("4. logical operators");
        System.out.println(64 > 5 && 69 > 88); //to be answer true all condition must be true
        System.out.println(64 > 5 || 69 > 88);

        System.out.println("5. Bitwise operators");
        System.out.println(2&3);

    }
}
