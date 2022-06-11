class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i; //this.id also used..
    }

}
public class access_modifier {
    public static void main(String[] args) {
        MyEmployee gokul = new MyEmployee();
//        gokul.id = 65;
//        gokul.name ="ErrorGamingNepal"; --> Throws an error due to private access modifier.
        gokul.setName("ErrorGamingNepal");
        System.out.println(gokul.getName());
        gokul.setId(233);
        System.out.println(gokul.getId());
    }
}
