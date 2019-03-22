package com.StringRotation;

public class StringRotationByConcatention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "abcd";
        String rotated = "dabc";
        
        boolean isRotated = isRotated(test, rotated);
        
        System.out.printf("Is '%s' is rotation of '%s' : %b %n", rotated, test,
                isRotated);
	}
	
	public static boolean isRotated(String str,String rotated) {
		boolean isRotate=false;
		
		if(str==null || rotated==null) {
			return isRotate;
		
		}else if(str.length() != rotated.length()) {
			return isRotate;
		}else {
			String conct=str+str;
			
			isRotate=	conct.contains(rotated);
		}
		
		return isRotate;
	}

}










