import org.w3c.dom.ls.LSOutput;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("Phone is ringing.......");
    }
    public void vibrate(){
        System.out.println("Phone is vibrating.......");
    }
    public void callFriend(){
        System.out.println("Dialling to friend someone.......");
    }

}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
class Rectangle1{
    int len, bed;
    public int area(){
        return len*bed;
    }
    public int perimeter(){
        return 2*(len + bed);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy.");
    }
    public void run(){
        System.out.println("Running from the enemy.");
    }
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
}
class circles{
    float fie = 3.14159f, r;
    public float area(){
        return fie*r*r;
    }
    public float perimeter(){
        return 2*fie*r;
    }
}
public class OOB_basic_problems {
    public static void main(String[] args) {
        //problem 1
        Employee1 gopal = new Employee1();
        gopal.setName("Error world");
        gopal.salary = 2500;
        System.out.println(gopal.getSalary());
        System.out.println(gopal.getName());

        System.out.println("-------------Problem two-----------");
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.callFriend();

        System.out.println("-----------Problem three----------");
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        System.out.println("-------------------Problem four----------------------");
        Rectangle1 rec = new Rectangle1();
        rec.len = 2;
        rec.bed = 2;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

        System.out.println("------------Problem five-------------");
        TommyVecetti player1= new TommyVecetti();
        player1.fire();
        player1.hit();
        player1.fire();

        System.out.println("-----------Problem six------------");
        circles ci = new circles();
        ci.r=2;
        System.out.println(ci.area());
        System.out.println(ci.perimeter());

    }

}
