package Slip5;


	class Point { 
	    int x; 
	    int y; 
	    public Point() { 
	        x = 0; 
	        y = 0;} 
	    public Point(int x, int y) { 
	        this.x = x; 
	        this.y = y;} 
	    public void display() { 
	        System.out.println("Coordinates: (" + x + ", " + y + ")");}} 
	class ColorPoint extends Point { 
	    String color; 
	    public ColorPoint(int x, int y, String color) { 
	        super(x, y);  
	        this.color = color;} 
	    @Override 
	    public void display() { 
	        super.display();  
	        System.out.println("Color: " + color);}} 
	public class Main { 
	    public static void main(String[] args) { 
	        Point point1 = new Point(); 
	        System.out.println("Point 1:"); 
	        point1.display(); 
	        Point point2 = new Point(3, 4); 
	        System.out.println("\nPoint 2:"); 
	        point2.display(); 
	        ColorPoint colorPoint = new ColorPoint(5, 6, "Red"); 
	        System.out.println("\nColor Point:"); 
	        colorPoint.display();}} 


