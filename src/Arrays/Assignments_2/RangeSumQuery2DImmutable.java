package Arrays.Assignments_2;

public class RangeSumQuery2DImmutable {
	private int[][] matrix;

    public RangeSumQuery2DImmutable(int[][] matrix) {
		this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
		for(int i = row1 ; i <= row2 ; i++) {
			for(int j = col1; j <= col2 ; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
    }
}
