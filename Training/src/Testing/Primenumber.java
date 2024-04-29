package Testing;

public class Primenumber {
	
	public void primenumber1(int n) {
		
	
		  int i,m=0,c=0;      
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     c=1;      
		     break;      
		    }      
		   }      
		   if(c==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		} 
  public static void main(String[] args) {
	
	  Primenumber obj = new Primenumber();
	  obj.primenumber1(13);
	  obj.primenumber1(4);
}
}
