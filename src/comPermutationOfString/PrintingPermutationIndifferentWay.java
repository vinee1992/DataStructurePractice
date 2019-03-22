package comPermutationOfString;

import java.util.ArrayList;
import java.util.List;

public class PrintingPermutationIndifferentWay {

	
	
    public static List<String> generatePermutations(String input) {
    	 
        List<String> strList = new ArrayList<String>();
        PrintingPermutationIndifferentWay.permutations("", input, strList);
 
        return strList;
    }
 
	private static void permutations(String ocns, String input, List<String> strList) {
		
		
		if(input.isEmpty())
			strList.add(ocns+input);
		
		for(int i=0;i<input.length();i++) {
			
			permutations(ocns+input.charAt(i), input.substring(0, i)+input.substring(i+1) ,strList
					);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     List<String> output = PrintingPermutationIndifferentWay.generatePermutations("vineet");
	        System.out.println("Result size: "+output.size());
	        output.stream().forEach(System.out::println);
	        System.out.println("------------------");

	}

}
