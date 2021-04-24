package Exercise4;

public class Question1 {

	public static void main(String[] args) {
		double[] Array={11, 12.4 ,12.5, 100, 14.6};
		
		double total=0;
		
	    for(int i=0; i<Array.length; i++) {
	    	
	    	total=total+Array[i];
	    	
	    	double average=total/Array.length;
	    	
	    	System.out.println("the average is: "+ average);
	    	
	    }
	    }
}

	


