package fibonncaiSeriesByRecurssion;

public class FibonncaiSeriesByRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibnci(19));
	}
	
	public  static int fibnci(int n) {
		
		if(n<1)
			throw new IllegalArgumentException("illegagl argument"+n);
		
		if(n==1 || n==2)
			return 1;
		
		return fibnci(n-2) +fibnci(n-1);
	}

}
