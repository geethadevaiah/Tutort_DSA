package Arrays.Assignments_1;

import java.util.ArrayList;
import java.util.List;

public class _4_Pascals {
	
	public static List<List<Integer>> pasc(int rows){
		List<List<Integer>> mainList = new ArrayList<>();
		if(rows == 0) return mainList;
		mainList.get(0).add(1);
		
		for(int i = 1 ; i < rows ; i++) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			List<Integer> prev = mainList.get(i-1);
			for(int j = 1 ; j < i ; j++) {
				list.add(prev.get(j-1) + prev.get(j));
			}
			list.add(1);
			mainList.add(list);
		}
		
		return mainList;
	}
}
