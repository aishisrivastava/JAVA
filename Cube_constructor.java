// Cube class volume finding using constructors

public class Cube_constructor {
    double length;
    double breadth;
    double height;

    // default constructor
    public Cube_constructor() {
        length = 10.5;
        breadth = 15.5;
        height = 20.5;
    }

    // parameterized constructor
    public Cube_constructor(double l1, double b1, double h1) {
        length = l1;
        breadth = b1;
        height = h1;
    }

    // parameterized constructor with one parameter
    public Cube_constructor(double side) {
        length = side;
        breadth = side;
        height = side;
    }

    void Cal_volume() {
        double volume = length * breadth * height;
        System.out.println("Volume of rectangle is: " + volume);
    }

    // MAIN METHOD-

    public static void main(String[] args) {
        Cube_constructor obj1 = new Cube_constructor();
        obj1.Cal_volume();

        Cube_constructor obj2 = new Cube_constructor(20.0, 30.0, 40.0);
        obj2.Cal_volume();

        Cube_constructor obj3 = new Cube_constructor(12);
        obj3.Cal_volume();
    }
}
