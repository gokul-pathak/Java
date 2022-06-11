class Rectangle {
        double width, height;
        String color;

    Rectangle() {
        height = width = 0.0;
        color = "red";

    }
    Rectangle(double h, double w, String c){
        height = h; width = w; color = c;
    }
    public void SetHeight(double h) {height = h;}
    public void setWidth(double w){width = w;}
    public void setColor(String c){color = c;}

    public double getHeight(){return height;}
    public double getWidth(){return width;}
    public String getColor(){return color;}
    public double getArea(){return height*width;}
    public double getPerimeter(){return 2*(height+width);}



    }
public class RectangleUser {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(20.5, 42.7, "red");
        System.out.println("Area: " + r2.getArea());
    }
}

