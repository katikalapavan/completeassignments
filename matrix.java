package com.day5;

public class matrix {

	public static void main(String[] args) {
		final int[][] matrix = {
		         { 1, 2, 3 },
		         { 4, 5, 6 }
		        
		      };
		      for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
		            System.out.print(matrix[i][j] + " ");
		         }
		         System.out.println(); //change line on console as row comes to end in the matrix.
		      }
		      final int[][] matrix1 = {
				         { 2, 2, 2 },
				         { 2, 2, 2 }
				        
				      };
				      for (int k = 0; k < matrix.length; k++) { //this equals to the row in our matrix.
				         for (int l = 0; l < matrix[k].length; l++) { //this equals to the column in each row.
				        	// System.out.print("matrix2\n"); 
				            System.out.print(matrix[k][l] + " ");
				         }
				         System.out.println(); //change line on console as row comes to end in the matrix.
				      }
		   }
	}


