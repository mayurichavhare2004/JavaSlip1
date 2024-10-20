package array;
class Point {

protected int x, y;

// Default constructor

public Point() {

x = 0;

y = 0;

}

// Parameterized constructor

public Point(int x, int y) {

this.x = x;

this.y = y;

}

// Display method

public void display() {

System.out.println("Point: (" + x + ", " + y + ")");

}

}

class ColorPoint extends Point {

private String color;

// Parameterized constructor

public ColorPoint(int x, int y, String color) {

super(x, y);

this.color = color;

}

// Display method

@Override

public void display() {

System.out.println("ColorPoint: (" + x + ", " + y + "), Color: " + color);

}

}

class Point3D extends Point {

private int z;

// Parameterized constructor

public Point3D(int x, int y, int z) {

super(x, y);

this.z = z;

}

// Display method

@Override

public void display() {

System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");

}

}
public class Main2 {

public static void main(String[] args) {

Point point = new Point(2, 3);

ColorPoint colorPoint = new ColorPoint(4, 5, "Red");

Point3D point3D = new Point3D(1, 2, 3);

point.display();

colorPoint.display();

point3D.display();

}

}

