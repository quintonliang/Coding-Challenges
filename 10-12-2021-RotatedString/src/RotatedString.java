import java.util.Scanner;

public class RotatedString {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String one = userInput.nextLine();
		String two = userInput.nextLine();
		
		System.out.println(rotatedString(one, two));

	}
	
	public static boolean rotatedString(String a, String b) {
		char start = a.charAt(0);
		int place = -1;
		
		if (a.length() != b.length()) {
			return false;
		}
		
		for (int i = 0; i < b.length(); i++) {
			if(start == b.charAt(i)) {
				place = i;
				break;
			}
		}
		
		if (place == -1) {
			return false;
		}
		
		String sub = b.substring(0, place);
		String sub2 = b.substring(place, b.length());
		
		String combo = sub2 + sub;
		
		for (int i = 0; i <a.length(); i++) {
			if (a.charAt(i) != combo.charAt(i)) {
				return false;
			}
		}
		
		
		return true;
	}

}
