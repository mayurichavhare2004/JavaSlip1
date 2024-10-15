package Slip4;
import java.util.Scanner;
public class UpperCase
{

    public static void main(String args[]){

        String str;

        Scanner dr=new Scanner(System.in);

        try {

            System.out.print("Enter Username : ");

            str = dr.nextLine();

            System.out.print("\"Hello, " + str.toUpperCase() + ", nice to meet you!\"");

        } catch (Exception e) {}

    }

}


