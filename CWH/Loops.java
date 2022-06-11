public class Loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("using loops");
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("Done while loop");
//if the condition never becomes false the while loop keeps getting
                    // executed. Such a loop is known as infinite loop.
//        while(true){
//            System.out.println(" I am an infinite.");
//        }

    }
}
