package Arrays.Assignments_1;

import java.util.ArrayList;
import java.util.List;

public class _5_PascalsII {

	public static List<Integer> generate(int rows){
		
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<rows+1;i++) {
                list.add(1);
                for(int j=i-1;j>0;j--) {
                    list.set(j, list.get(j-1)+list.get(j));
                }
        }
        return list;
	}
	
	public static void main(String[] args) {
		generate(4); // 
	}
}
