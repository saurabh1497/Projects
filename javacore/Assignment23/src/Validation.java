
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Validation {
	public static boolean validateAge(java.util.Date birth) throws ParseException {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = sdf.parse("02-02-2018");
		@SuppressWarnings("deprecation")
		int diff = (currentDate.getYear()-birth.getYear());
		if(diff>18) {
			return true;
			}
		else {
			return false;
		}
		}
	
public static boolean validateName(String name) {
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		if(!(Character.isLetter(c))) {
			return false;
		}
		}
		return true;
	}


public static boolean validateMobileNumber(String num) {
	int sum = 0;
	if(num.length()==1) {
		if(Integer.parseInt(num)==1) {
			return true;
		}
		else {
			return false;
		}
	}
	else {
		for(int i=0;i<num.length();i++) {
			char a = num.charAt(i);
			int n = Character.getNumericValue(a);
			sum+=n;
		}
	}
	return validateMobileNumber(Integer.toString(sum));
}
	
}
	
	