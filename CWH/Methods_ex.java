public class Methods_ex {

    static int logic(int x, int y){ //static
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x+y)*5;
        }
//        x = 566; //no change
        return z;
    }
    static int mySum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a  = 5;
        int b = 7;
        int c;
        int c1, cg;

        //method invocation using object creation
//        Methods_ex obj = new Methods_ex();
//        c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(a +" "+ b);
        int a1 = 2;
        int b1 = 1;
        c1 = logic(a1 ,b1);

        System.out.println("c: "+c);
        System.out.println("c1: " + c1);
//        c1 = obj.logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);


    }
}
