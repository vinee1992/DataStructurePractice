package com.RotateMatrixBy90Degree;

public class NQueenProblemAlgo {

	
	final int N=4;
	
	void printSol(int board[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(" "+board[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
	boolean isSafe(int b[][],int row,int col) {
		int i,j;
		for(i=0;i<col;i++) {
			if(b[row][i]==1)
				return false;
			
			
		}
		 /* Check upper diagonal on left side */
		
		for(i=row,j=col;i>=0&&j>=0;i--,j--) {
			 if (b[i][j] == 1) 
	                return false;
		}
		
		for(i=row,j=col;j>=0&&i<N;i++,j--) {
			  if (b[i][j] == 1) 
	                return false; 
		}
		return true;
		
	}
	
	boolean solveNQutil(int board[][], int col) {
	    if (col >= N) 
            return true;
	    
	    
	    for (int i = 0; i < N; i++) {
	    	
	    	
	    	if(isSafe(board, i, col)) {
	    		
	    		 board[i][col] = 1;
	    	      if (solveNQutil(board, col + 1) == true) 
	                    return true; 
	  
	    	      board[i][col] = 0;
	    	}
	    }
	    
	    return false;
	    
	}
	
    boolean solveNQ() 
    { 
        int board[][] = {{0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0} 
        }; 
  
        if (solveNQutil(board, 0) == false) 
        { 
            System.out.print("Solution does not exist"); 
            return false; 
        } 
  
        printSol(board); 
        return true; 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    NQueenProblemAlgo Queen = new NQueenProblemAlgo(); 
        Queen.solveNQ(); 
	}

}
