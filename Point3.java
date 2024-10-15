package Slip9;

// Java program to create a point 3D 
	// object and display its coordinates
	// and find its distance from origin
	
	public class Point3 {
 
	 
	    // Main Method
	    public static void main(String args[])
	    {
	 
	        // Create a point3D object
	        Point3 point3d_1 = new Point3(20.0f, 50.0f, 70.0f);
	 
	        double x, y, z;
	 
	        // get the coordinates of the point
	        x = point3d_1.getX();
	        y = point3d_1.getY();
	        z = point3d_1.getZ();
	 
	        // display the coordinates of the point
	        System.out.println("x coordinate = " + x 
	                            + ", y coordinate = "
	                            + y + ", z coordinate = " + z);
	 
	        // print its distance from origin
	        System.out.println("Distance From Origin = "
	                     + point3d_1.distance(0, 0, 0));
	    }
	}

