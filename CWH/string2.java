import java.util.Locale;

public class string2 {
    public static void main(String[] args) {
        String name = "Gokul";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "        Gokul       ";
        System.out.println(nonTrimmedString);
        String trimmedstring = nonTrimmedString.trim();

        System.out.println(nonTrimmedString.trim());
        System.out.println(trimmedstring);

        System.out.println(name.substring(2));//int start
        System.out.println(name.substring(1,4)); //gokul 0,1,2,3,4
        System.out.println(name.replace('l','i'));
        System.out.println(name.replace("kul","pul"));
        System.out.println(name.startsWith("Go"));
        System.out.println(name.endsWith("ul"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("ok"));
        String modifiedName = "goocoolcool";
        System.out.println(modifiedName.indexOf("cool"));
        System.out.println(modifiedName.indexOf("cool",4));
        System.out.println(modifiedName.lastIndexOf("cool", 4));
        System.out.println(name.equals("Gokul"));
        System.out.println(name.equalsIgnoreCase("gOkUl"));
        System.out.println("I \tam \\escape sequence \"double quote\"");


    }
}
