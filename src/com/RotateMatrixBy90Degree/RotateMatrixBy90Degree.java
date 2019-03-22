package com.RotateMatrixBy90Degree;

public class RotateMatrixBy90Degree {

	//static int[][] matrix;
	
	public RotateMatrixBy90Degree() {
		// TODO Auto-generated constructor stub
		
		int[][] matrix= {
				   {1,  2,  3,  4},
				    {5,  6,  7,  8},
				    {9,  10, 11, 12},
				    {13, 14, 15, 16},
				    {17, 18, 19, 20}
				
		};
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RotateMatrixBy90Degree();
		 System.out.println("Original Matrix :");
		  printMatrix(matrix);
	
	}

	
	 private static void printMatrix(int[][] matrix){
		  for (int i = 0; i < matrix.length; i++) {
		   for (int j = 0; j < matrix[0].length; j++) {
		    System.out.print(matrix[i][j] + "   "); 
		   }
		   System.out.println();
		  }
		 }
		
	
	//Rotate Matrix to 90 degree toward Right(clockwise)
	private int[][]  rotateMatrixBy90DegreeClockwise(int[][] matrix){
		
		  int totalRowsOfRotatedMatrix=	matrix[0].length; //Total columns of Original Matrix
		  
		
		  int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix
		  
		  int[][] rotatedMatrix=new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];
		  for(int i=0;i<matrix.length;i++) {
			  for(int j=0;j<matrix[0].length;j++) {
				  
				  rotatedMatrix[j][(totalColsOfRotatedMatrix-1)-i]=matrix[i][j];
				  
				  
			  }
		  }
		  return rotatedMatrix;
		  
		
	}
	
	
	
	
}
