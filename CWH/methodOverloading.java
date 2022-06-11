public class methodOverloading {
    static void too(){
        System.out.println("Good morning sir!");
    }
    static void too(int a){
        System.out.println("Good morning "+ a +" Sir! ");
    }
    static void too(int a, int b){
        System.out.println("Good morning "+ a + " sir!");
        System.out.println("Good morning "+ b+ " sir!");
    }
    private static void change(int a) {
        a = 98;
    }

    private static void change2(int [] arr) {
        arr[0] = 98;
    }// reference(copy) is passed //object is changed
    static void jokes(){
        System.out.println("i have done calulator project in 3 days...");
    }
    public static void main(String[] args) {
        //jokes();
        int [] marks = {52, 79, 59, 98, 65, 99};
        //case 1 ->> changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("the value of x after running chage: "+ x);

        //changing the array:
        change2(marks);
        System.out.println("Thr value is a X after running is: "+ marks[0]);
        //method overloading
        too(20);
        too();
        too(2,3);
        //arguments are actual
        //method overloading cannot be performed by changing the return type of methods.
        }



        //Note: In case of arrays the reference is passed. Same is the case for object passing to methods.

}
