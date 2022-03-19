package WarmupPracticeSet_III;

public class _9_AddDigits {

	public static int addDigits(int num) {
		int res = 0;
        while (num > 0) {
            res += num % 10;
            num = num / 10;
            
            if (num == 0 && res > 9) {
                num = res;
                res = 0;  
            }    
        }     
        return res;
	}
}
