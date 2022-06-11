public class StringToLowerCase {
    public static void main(String[] args) {
        //exercise 1
        System.out.println("String to lower case");
        String name = " My name is gokul pathak and I am from Nepal.";
        name = name.toLowerCase();
        System.out.println(name);

        //exercise 2
        System.out.println("String to upper case");
        String text = "Hello world this program is written by Programmer gokul pathak.";
        text = text.toUpperCase();
        System.out.println(text);

        //exercise 3
        System.out.println("");
        String letter = "Dear <|name|> Thanks for using our Application.!!";
        letter = letter.replace("<|name|>","Ram");
        System.out.println(letter);

        //exercise 4
        String me = "This string contains       double and triple spaces.";
        System.out.println(me.indexOf("    "));
        System.out.println(me.indexOf("      "));

        //exercise 5
        String me2 = "Dear Ram, \n\tThanks for using our application!!!";
        System.out.println(me2);



    }
}
