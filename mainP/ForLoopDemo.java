package mainP;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      -----------  ODD - EVEN  -----------------
		
//		int num;
//		for (num=10;num>0;num--) {
//			System.out.println("number is :" +num);
//			if(num%2==0) {
//				System.out.println(""+num+" is even number.");
//			}
//			else {
//				System.out.println(""+num+" is odd number.");
//			}
//		}
		
//      -------  PRIME - NON PRIME  ------------
		
		int num;
		boolean isPrime;
		num = 13;
		if (num<2) 
			isPrime = false;
		else
			isPrime = true;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				isPrime = false;
					break;
			}
			isPrime = true;
		}
		if(isPrime == false) {
			System.out.println(""+num+" is NON prime.");
		}
		else {
			System.out.println(""+num+" is prime.");

		}
	}

}
