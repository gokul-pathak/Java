public class gradeSystemCheat {
    public static void main(String[] args) {
        //wap in java to encrypt a grade adding 8 to it. Decrypt it to show the correct grade.
        System.out.println("Before cheat");
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //Decrypting the grade
        System.out.println("After cheat");
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
