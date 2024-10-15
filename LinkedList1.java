package Slip13;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1 {
 public static void main(String[] args) {
 LinkedList<String> fruitList = new LinkedList<>();
 fruitList.add("Apple");
 fruitList.add("Banana");
 fruitList.add("Guava");
 fruitList.add("Orange");
 Iterator<String> iterator = fruitList.iterator();
 while (iterator.hasNext()) {
 System.out.println(iterator.next());}}}


