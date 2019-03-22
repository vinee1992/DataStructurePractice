package comPermutationOfString;

public class PermutationOfString {

	static int len=0;
	   public static void permutation(String input){
	          permutation("", input);
	   }
	
	private static void permutation(String s, String i) {
		// TODO Auto-generated method stub
		
		
		if(i.isEmpty()) {
			System.err.println(s+i);
		}else {
			
			for(int j=0;j<i.length();j++) {
				
				permutation(s+i.charAt(j),i.substring(0, j)+i.substring(j+1,i.length()));
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("vin");
	

	}

}
