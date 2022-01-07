public class MultidimensionalStringTwo {

	public static void main(String[] args) {
		String line = "1,4,3,2,3,7,5,6,9\n"+
                "8,6,3,7,3,7,5,6,9\n"; 
		
		
		String[] strArray = line.split("\n");
		for (int i = 0; i < strArray.length; i++) {
		    // Remove any beginning and ending braces and any white spaces
			strArray[i] = strArray[i].replace("\n", ",");
			//System.out.print(strArray[i] + ", ");
		}
		
		// Get the number of columns in a row
		int numberOfColumns = strArray[0].split(",").length;
		String arra[][] = new String[strArray.length][numberOfColumns];
		for(int i =0; i<arra.length; i++) {
			arra[i] = strArray[i].split(",");
		}
		
		// Setup your matrix
		int[][] matrix = new int[strArray.length][numberOfColumns];
		

		// Populate your matrix
		for (int a = 0; a < matrix.length; a++) {
			for(int i = 0; i < matrix[a].length; ++i) {
				matrix[a][i] = Integer.parseInt(arra[a][i]);
				//System.out.println(strArray[i]);
			}
		    //matrix[i] = strArray[i].split(",");
		}
		
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j< matrix[i].length; j++) {
				System.out.print(matrix[i][j]+", ");
			}
			System.out.println();
		}
		int temp;
		  for(int i=0; i<matrix.length; i++) {
		         for (int j = i+1; j < matrix[i].length; j++) {
		        	 for(int k=0; k<matrix.length; k++) {
				         for (int p = k; p < matrix[i].length-1; p++) {
				 			if(matrix[k][p]<matrix[k][p+1]) {
				 				temp = matrix[k][p];
				 				matrix[k][p] = matrix[k][p+1];
				 				matrix[k][p+1] = temp;
				 			}
				 		 }
				      }
		 		 }
		      }
		  System.out.println("Sorted Descending Order: ");
		  for(int i =0; i<matrix.length; i++) {
				for(int j =0; j< matrix[i].length; j++) {
					System.out.print(matrix[i][j]+", ");
				}
				System.out.println();
			}
		
	}
	

}
