/**
 * 
 */
package linkedList;
import java.util.*;
public class checkElement {

	public static void main(String[] args) {
		
 LinkedList l= new LinkedList();		
	l.add(7);
	l.add(3);
	l.add(6);
	l.add(4);
	l.add(25);
System.out.println(l);	
	
/*****Write a Java program to check if
	 a particular element exists in a linked list*****/	
		
	if(l.contains(5)) {
		System.out.println("5 present in list");
	}else if(l.contains(4)){
		System.out.println("4 is present in list");
	}else {
		System.out.println("number is not present");
	} 
	
/*****Write a Java program to convert a 
	          linked list to an array list.*****/
	
	List al= new ArrayList(l);	
	for(Object num:al ){	
	System.out.print(" " +num);
	}	
	 System.out.println();
/****Write a Java program 
       to compare two linked lists.	******/
	LinkedList l1= new LinkedList();
	 l1.add("Alex");
	 l1.add("RAghu");
	 l1.add("Hari");
	 l1.add("Tamil");
	 l1.add("Siva");
 System.out.print(" " +l1);	 
 System.out.println(); 	
	
 LinkedList l2= new LinkedList();
	 l2.add("Alex");
	 l2.add("RAghu");
	 l2.add("Hari");
	 l2.add("Tamil");
	 l2.add("Siva");
 System.out.print(" " +l2);	  	
  	System.out.println();
	LinkedList l3= new LinkedList();
	for(Object ch:l1)
	l3.add(l2.contains(ch)?"yes":"No");
	System.out.println(l3);
	
 }
}
