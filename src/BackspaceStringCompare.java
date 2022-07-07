
public class BackspaceStringCompare {

	public static boolean backspaceCompare(String s, String t) {
int i = s.length() - 1, j = t.length() - 1, sskips = 0, tskips = 0;
		
		// checking from reverse whether the both string point to same char after backspace
		while(i >= 0 || j >= 0) {
			// checking #:backspace for s
			while(i >= 0) {
				if(s.charAt(i) == '#') {
					sskips++; i--;
				}
				else if(sskips > 0) {
					sskips--; i--;
				}
				else break; // no other backspace stopped at valid char
			}
			
			// checking for string t
			while(j >= 0) {
				if(t.charAt(j) == '#') {
					tskips++; j--;
				}
				else if( tskips > 0) {
					tskips--; j--;
				}
				else break;
			}
			// when i, j are both >= 0 and chars not equals then false
			if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            // if comparing char v/s empty
            // if both are >= 0 then true
            if((i >= 0) != (j >= 0)) return false;
			i--;j--;
		}
		return true;
	}
}
