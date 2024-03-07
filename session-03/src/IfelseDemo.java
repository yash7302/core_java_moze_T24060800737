import java.util.Scanner;

public class IfelseDemo {
    public int getMaxNum (int i1, int i2)
    {
    	if (i1>i2)
    		  return i1;
    	else
    		return i2;
    	
    }
    public static void main (String[] args) {
    	IfelseDemo d= new IfelseDemo ();
    	Scanner s= new Scanner (System.in);
    	System.out.println("Enter any Two Numbers = ");
    	int a = s.nextInt ();
    	int b = s.nextInt ();
    	
    	int max = d.getMaxNum(a, b);
    	System.out.println("Maximum of "+a+" and "+b+" = " + max);
    	}
    
   }

