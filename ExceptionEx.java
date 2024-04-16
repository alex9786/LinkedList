/**
 * 
 */
package linkedList;

public class ExceptionEx {
  void cell()throws ArrayIndexOutOfBoundsException  {
	  int num[]= {10,15,20};
	  num[5]=25;
	  System.out.println(num.length);
  }
  void disply() {
	 
	try{  
	  cell();
   } catch(ArrayIndexOutOfBoundsException s) {
	System.out.println("Exception-->"+s);	
	}  
  }
 
  void main() {
	  try {
	//  int a=12/0;
	 // System.out.println(a);
	  throw  new ArithmeticException ();
    }catch(ArithmeticException ae){
    	System.out.println("Exception"+ae);
    }
  
}
	public static void main(String[] args) {
  ExceptionEx obj = new  ExceptionEx();
	obj.disply();	 
	obj.main();
		
		
		
	}

}
