public class do_while_loop {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        //This loop is similar to a while loop except the fact that
        // it is generated to execute at least once.
        int b = 10;
        do{
            System.out.println(b);
            b++;
        }while(b<5);
        System.out.println("Loop done");
        //while checks the condition and executes the code
        // whereas do-while excutes the code and then checks the condition.
    }
}
