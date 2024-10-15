package Slip7;


	import java.util.Hashtable;

	public class HashTableCreation {
	    public static void main(String args[]) {
	        
	      // Create a Hashtable of String keys and Integer values
	        Hashtable<String, Integer> hashtable = new Hashtable<>();

	        // Adding elements to the Hashtable
	        hashtable.put("One", 1);
	        hashtable.put("Two", 2);
	        hashtable.put("Three", 3);
	        
	        // Displaying the Hashtable elements
	        System.out.println("Hashtable Elements: " + hashtable);
	    }
	}

