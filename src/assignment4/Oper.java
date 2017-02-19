		// to perform different operation
package assignment4;

public class Oper {

	public static void main(String[] args) {
		//initialization of a and b
		int a=20,b=10;
		a=--a;
		System.out.println(a);
		//post increment
		a=a--;
		System.out.println(a);
		b=a-- - --a;;
				
        System.out.println(b);
		System.out.println(a);
		
		System.out.println("the value if a here is "+a);
	    int c=a--;
		System.out.println("the value of c is " +c);
		int d=b>>2;
		System.out.println("the valve of d is " +d); 
		int e=a&b;
		System.out.println("the value of e is " +e);
		
		

	}

}
