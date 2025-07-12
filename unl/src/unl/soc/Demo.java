package unl.soc;

import java.util.Scanner ;
public class Demo {
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter n integer: ");
//		int x = s.nextInt()	;
//		System.out.println("you entered "+ x);
//		
	
		
		System.out.println("You entered "+ args.length +"Arguments : ");
		for (int i = 0 ; i < args.length ; i++) {
			int two = 2 ;
			int result = Integer.parseInt(args[i] );
		//	System.out.println(args[i] + "*" + two + "=" + result );
		// same as before using printf
			
			System.out.printf("%s * %d = %d\n",args[i],two,result);
		}
		
	}
	
	

}
