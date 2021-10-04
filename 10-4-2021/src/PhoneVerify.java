import java.util.Scanner;

public class PhoneVerify {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String phoneNum = userInput.nextLine();
		
		System.out.println(phoneCheck(phoneNum));
	}
	
	public static boolean phoneCheck(String phoneNum) {
		int sum = 0;
		int checkDigit = Character.getNumericValue(phoneNum.charAt(phoneNum.length()-1));
		
		if(phoneNum.length() > 19 || phoneNum.length() < 14) {
			return false;
		}
		
		phoneNum = phoneNum.substring(0, phoneNum.length()-1);
		
		StringBuilder phoneNum2 = new StringBuilder(phoneNum);
		
		phoneNum2.reverse();
		
		for (int i = 0; i < phoneNum2.length(); i++) {
			if (i % 2 == 0) {
				sum += Character.getNumericValue(phoneNum2.charAt(i));
				continue;
			}
			int place = Character.getNumericValue(phoneNum2.charAt(i));
			place *= 2;
			while (place > 0) {
				sum += place % 10;
				place /= 10;
			}
		}
		
		if (10 - (sum % 10) == checkDigit) {
			return true;
		}
		
		
		return false;
	}

}
