class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class accmodiexe {
    public static void main(String[] args) {

        //circle radius and perimeter

        //problem 1
        cylinder myclinder = new cylinder();
        myclinder.setHeight(12);
        int h = myclinder.getHeight();
        System.out.println(h);

        myclinder.setRadius(13);
        System.out.println(myclinder.getRadius());
        //problem 2
    }
}
