public class BreakAndContinue {
    public static void main(String[] args) {
        //break and continue using loops
//bbbbbbbbbbbbbrrrrrrrrrrrreeeeeeeeeeeaaaaaaaaaaakkkkkkkkkkkkkkk---------------------------
        //for loop--------------------

//        for (int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("GP");
//            if(i==2){
//                System.out.println("Ended");
//                break;
//            }
//        }
        //while loop-----------------------------------------------
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            System.out.println("GP");
//            if (i == 2) {
//                System.out.println("Ended");
//                break;
//            }
//            i++;
//        }



        //do-while loop-----------------------------------------------
//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("GP");
//            if (i == 2) {
//                System.out.println("Ended");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ended here.");


//cccccccccooontinueeeeeeeee-----------------------------------------------------
//        for (int i = 0; i<50; i++){
//            if(i==2){
//                System.out.println("Ended the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("gp");
//        }


//------------------------------------------------------------------------------------------
        int i =0;
        do{
            i++;
            if(i==2){
                System.out.println("End the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("gp");
        }while(i<5);
        System.out.println("Loop ends here!!");
    }
}
