package unl.cse;



public class Demo {
	
	public static void main(String args[]) {

		//FizzBuzz :
		//print numbers 1 to 100
		// except : if the number is divisible by 3 then print "fizz"
		// if the number is divisible by 5 then print "buzz"
		// if divisible by both * 3 and 5 print "fizzbuzz"
		
		for(int i = 1 ; i < 100 ; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("fizzbuzz %d\n",i);
				
			}
			else if ( i % 3 == 0) {
				System.out.printf("fizz %d\n",i);
			}
			else if ( i % 5 == 0) {
				System.out.printf("buzz %d\n",i);
			}
			
			
			
		}
		
		
	}

}
