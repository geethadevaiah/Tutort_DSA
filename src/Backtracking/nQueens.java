package Backtracking;
import java.util.ArrayList;
import java.util.List;
public class nQueens {
    public static List<List<String>> solveNQueens(int n) {
    	int[][] queens = new int[n][n];
    	List<List<String>> res = new ArrayList<>();
    	solveNQueensUtil(queens, 0, res);
    	return res;
    }
    public static void solveNQueensUtil(int[][] queens, int r, List<List<String>> res) {
    	if(r == queens.length) {
    		res.add(formatNQueensResult(queens));
    		return;
    	}
    	for(int i = 0 ; i < queens.length ; i++) {
    		if(isSafe(queens, r, i)) {
    			queens[r][i] = 1;
    			solveNQueensUtil(queens, r+1, res);
    			queens[r][i] = 0;
    		}
    	}
    }
    public static boolean isSafe(int[][] queens, int r, int c) {
    	for(int i = 0 ; i < r ;i++)  if(queens[i][c] == 1) return false;//checking if the row is already having a queen
    	for(int i = r, j = c ; i>= 0 && j >= 0 ; i--,j--) if(queens[i][j] == 1) return false;
    	for(int i = r, j = c ; i>= 0 && j<queens.length; i--,j++)	if(queens[i][j] == 1) return false;
    	return true;
    }
    public static List<String> formatNQueensResult(int[][] queens){
    	List<String> result = new ArrayList<>();
    	for(int i = 0 ; i < queens.length ; i++) {
    		StringBuilder sb = new StringBuilder();
    		for(int j = 0 ; j < queens.length ; j++) 
    			sb.append(queens[i][j] == 0 ? "." :"Q");
    		result.add(sb.toString());
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	solveNQueens(4);
	}
}
