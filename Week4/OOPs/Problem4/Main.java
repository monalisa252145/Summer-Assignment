import java.util.Scanner;


class Box {

    protected double length;
    protected double breadth;

    
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    private double height;

    
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    
    public double volume() {
        return length * breadth * height;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter Height: ");
        double height = sc.nextDouble();

       
        Box box = new Box(length, breadth);

       
        Box3D box3d = new Box3D(length, breadth, height);

        System.out.println("\nArea = " + box.area());
        System.out.println("Volume = " + box3d.volume());

        sc.close();
    }
}
