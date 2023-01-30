package mainP;

public class HelloWorld {
	static int a = 20;
	final int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = Integer.parseInt(args[1]);
		
		if(month == 10) System.out.println("month 10");
		else System.out.println("month other then 10");
		
		var season="";
		
		switch(month) {
		case 10:
		     season = "winter";
		     break;
		     
		}
	}
	
}
