public class Array1 {
    public static void main(String[] args) {
        //classroom of 500 students-> You have to store marks of these students
        /*
        * You have two options.
        * 1. create 500 variables.
        * 2. use arrays(recommended)
        * There are 3 ways to create array in java.
        * 1. Declaration and then memory allocation int [] marks = new int[5];
        * 2. declaration and then memory allocation
        * */
        int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 60;
        marks[3] = 64;
        marks[4] = 84;
        System.out.println(marks[4]);

        //3. Declaration, memory allocation and initialization together;
        int [] marks2 = {98,69,86,98};
    }
}
