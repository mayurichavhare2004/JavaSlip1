package Slip12;
import java.io.*;
class SeriesMain{
 
    // Main driven Program
    public static void main(String args[])
        throws IOException
    {
        // Declaring and initializing holding current sum
        int sum = 0;
 
        // Declaring VARIABLE holding term
        // Initializing to random value
        // to show output
        int n = 4;
 
        System.out.println("Enter number of terms:" + n);
 
        // For-loop for Iterating from 1 and Nth term
        for (int i = 1; i <= n; i++) {
 
            // finding square of current term and updating
            // current sum
            sum += (i * i);
        }
 
        // Printing final sum i.e
        // last updated current sum
        System.out.println("Sum for entered N terms:"
                           + sum);
    }
}
