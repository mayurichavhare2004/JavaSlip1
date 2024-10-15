package slip1;


	import java.util.Iterator;
import java.util.ListIterator;

	public class LinkedListExample {
	    public static void main(String[] args) {
	        // Create a LinkedList
	        java.util.LinkedList<String> ll = new java.util.LinkedList<>();

	        // Add elements to the list
	        ll.add("Red");
	        ll.add("Blue");
	        ll.add("Yellow");
	        ll.add("Orange");

	        // Iterate using Iterator
	        Iterator<String> i = ll.iterator();
	        System.out.println("\nContents of the List using an Iterator:\n");
	        while (i.hasNext()) {
	            String s = i.next();
	            System.out.println(s);
	        }

	        // Iterate using ListIterator
	        ListIterator<String> li = ll.listIterator();
	        System.out.println("\nContents of the List in reverse order using a ListIterator:\n");
	        while (li.hasNext()) {
	            li.next();
	        }
	        while (li.hasPrevious()) {
	            System.out.println(li.previous());
	        }

	        // Add elements at specific positions
	        ll.add(2, "Pink");   // Add element at second position
	        ll.add(3, "Green");  // Add element at third position

	        // Print the list between Blue and Yellow
	        System.out.println("\nList between Blue and Yellow is:");
	        for (int index = 1; index < 3; index++) {
	            System.out.println(ll.get(index));
	        }
	    }
	}

