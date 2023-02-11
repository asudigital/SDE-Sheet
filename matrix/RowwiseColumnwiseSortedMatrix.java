package matrix;

public class RowwiseColumnwiseSortedMatrix {

	public static void main(String[] args) {

   int matrix[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};  
    
  boolean isSearched =searchMatrix(matrix ,30);
  System.out.println(isSearched);
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {

	      int start =0;
	      int mid = 0;
	      for(int i=0; i<matrix.length;i++)
	      {
	        int end= matrix[i].length-1;
	          while(start <= end)
	          {
	               mid = (start + mid)/2;              
	              if(matrix[i][mid] == target)
	              return true;
	              else if(matrix[i][mid] > target)
	              end = end-1;
	              else
	              start = mid +1;
	          }
	      } 
	      return false; 
	    }

}
