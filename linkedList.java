/**
 * 
 */
package linkedList;
import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("Alex");
		l1.add("Raghu");
		l1.add("Hari");
		l1.add("Tamil");
		l1.set(3,"JD ");
	
	Collections.shuffle(l1);
	System.out.println(l1);
		
	System.out.println(l1.poll());
		
    Collections.swap(l1,2,2);
	System.out.println(l1);	
	for(Object c1:l1) {
	System.out.print(" " +c1);		
		}
System.out.println();		
	//*****ITERATOR*****//	
 /*  System.out.println("ITERATOR: " );	
   Iterator i = l1.iterator();	
   while(i.hasNext()) {
   System.out.print(" "  +i.next());
 }
System.out.println();
//*****DESCENDING ITERATOR*****	
   System.out.println("DESCENDING ITERATOR: ");
   Iterator di = l1.descendingIterator();	
   while(di.hasNext()) {
   System.out.print(" " +di.next());
}	
		*/
		
		
		
		
 }
}
