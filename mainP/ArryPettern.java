package mainP;

public class ArryPettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  int i,j,k,m,n;
  //////////  For loop STart ///////////////
  for(i=0;i<=10;i++) {
	  if (i<5) {
		    for(m=5;m>i;m--) {
			  System.out.print(" ");
		    }
		    System.out.print("*");
	        for(k=0;k<i;k++) {
		     System.out.print("**");
	        }
	   System.out.println();
	  }
	  
	  else { 
		   for(n=5;n<i;n++) {
			  System.out.print(" "); 
		   }
		   
	       for(j=10;j>i;j--) {
		      System.out.print("**");
	       }
	       System.out.print("*");
	   System.out.println();
	   
	  }	  
  }
  
  //////////// For loop END  /////////////////
 }

}
