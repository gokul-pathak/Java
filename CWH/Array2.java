public class Array2 {
    public static void main(String[] args) {
//        int [] marks2 = {98,69,86,98};
//        System.out.println(marks2.length);
//        float [] marks = {19.3f,89.69f,66.55f,20.33f};
//        System.out.println(marks[0]);
//        String [] students = {"Ram","Shyam","Gopal"};
//        System.out.println(students.length);
        int [] points ={98, 45, 99, 80, 69};
        System.out.println(points.length);

        //displaying the array (naive way)
        System.out.println("Printing using naive way:");
        System.out.println(points[0]);
        System.out.println(points[1]);
        System.out.println(points[2]);
        System.out.println(points[3]);
        System.out.println(points[4]);

        //displaying the array(for loop)
        System.out.println("printing using for loop");
        for(int i=0; i<points.length; i++){
            System.out.println(points[i]);
        }

        //displaying the array in reverse order(for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=points.length -1; i>=0; i--){
            System.out.println(points[i]);
        }


        //displaying the array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: points){
            System.out.println(element);
        }




    }
}
