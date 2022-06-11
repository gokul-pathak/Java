import org.w3c.dom.ls.LSOutput;

public class Practice_methods {
    static void multiplication(int n){
        for(int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n, i, n*i );
        }
    }
    static void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1_rec(int n){

        if(n>0){
            pattern1_rec(n-1);
                for(int i =0; i<n; i++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
    /*
    * pattern1_rec(3)
    * pattern1_rec(2)+ 3 times star and new line
    * pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    * pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    * */
    static void pattern2(int n){
        for (int i=n; i>0; i--){ //decrement
            for(int j = 0; j<i; j++){ //increment
                System.out.print("*");
            }
            System.out.println("\n");
        }
        }
    /*
    * sum(n) = 1+ 2 + 3 ........ + n;
    * sum(n) = 1 + 2 + 3 ....... + (n - 1) + n;
    * sum(n) = sum(n-1) + n;
    * sum(3) = 3 + sum(2);
    * sum(3) = 3 + 2 + sum(1);
    * sum(3) 3+2+1;
    * */
    static int sumRec(int n){
        //base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==1 || n == 2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        // example/practise 1
        System.out.println("Multiplication table of 7 is given below: ");
        multiplication(7);

        //example/ problem 2
        System.out.println("The pattern of 9 is: ");
        pattern1(9);

        //example/problem 3
        System.out.println("Example of sum in methods");
        int c = sumRec(3);
        System.out.println(c);

        //example/ problem 4
        System.out.println("The pattern of 2 is: ");
        pattern2(6);

        //question no . 5
        // fibonacci series - 0 ,1, 1, 2, 3, 5, 8, 13, 21, 34
        int result = fib(7);
        System.out.println(result);

        //question no. 8
        System.out.println("The pattern using reseursion: ");
        pattern1_rec(9);
    }




}
