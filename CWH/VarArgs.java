public class VarArgs {
//    static int sum(int a, int b){
//        return a+ b;
//    }
//    static int sum(int a, int b, int c){
//        return a+ b+c;
//    }
    static int sum(int x, int...arr){
        //available as int [] arr;
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Varargs");

        System.out.println("The sum of 4 + 5: "+sum(4,5));
        System.out.println("The sum of: "+sum(2));
        System.out.println("The sum of 4 + 5 + 3: "+sum(4,5, 3));
        System.out.println("The sum of 4 + 5 + 3 + 4 + 5: "+sum(4,5, 3,4,5));
    }
}
