package WarmupPracticeSet_II;

public class _6_TransposeMatrix {

	public static int[][] transposeMatrix(int[][] matrix){
		int transpose[][] = new int[matrix[0].length][matrix.length];
		
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		return transpose;
	}
 	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		transposeMatrix(mat);
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[0].length ; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
