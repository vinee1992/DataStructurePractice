package com.FindMissingNumberFromArray;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// missing items 0,1,3,5,7,9,10
		int[] i= {2,4,4,6,6,3,7,0};
// i will create one more array	  
		
		//register array=== r[0], r[1] r[2], r[3],r[4], r[5],r60], r[7] so on...
		//i=2,4,4,6
		//r[2]=1,r[4]=1,r[6]=1...those have 0 are  missing
		
		int[] register= new int[i.length];
		
		for(int p : i) {
			register[p] = 1;
		}
		
		
		System.out.println("Missing terms");
		for(int j =1; j<register.length;j++) {
			if(register[j]==0)
				System.out.println(j);
			
		}
	}

}
