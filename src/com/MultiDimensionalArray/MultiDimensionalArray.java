package com.MultiDimensionalArray;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = new int[5][];
		
		
/*		for(int row=0;row<b.length;row++) {
			for(int col=0;col<b[row].length;col++) {
				b[row][col]=row*col;
			}
		}*/
		
		
		for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                b[row][col] = row * col;
                System.out.print(b[row][col] + "\t");
            }
            System.out.println();
        }
	}

}
