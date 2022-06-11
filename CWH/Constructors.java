class MineEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    } //this.name also used..

    public int getId(){
        return id;
    }

    public void setId(int i){
        id=i; //this.id also used..
    }
    public MineEmployee(){
        id= 45;
        name = "My name here";
    }
public MineEmployee(String myName,int myId){
    id= myId;
//    name = "My name here";
    name = myName;
}
public MineEmployee(String myName){
        id = 1;
        name = myName;
}

}

public class Constructors {
    public static void main(String[] args) {
        MineEmployee gopal = new MineEmployee();
//        gopal.id = 45;
//        gopal.name = "hello world";  //throws an error due to private access modifier
//        gopal.setName("Helloworld");
//        gopal.setId(68);
        System.out.println(gopal.getId());
        System.out.println(gopal.getName());
    }
}
