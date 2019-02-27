//Write a program to display times in different country format.

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
class TimeDifferentCountryFormat {
	public static void main(String[] args) {
		Date d=new Date();
		for (Locale l:
				Locale.getAvailableLocales()) {
			Locale country = new Locale( l.getLanguage() ,l.getCountry() );
			DateFormat format = DateFormat.getDateInstance (DateFormat.MEDIUM, country);
			System.out.println(format.format(d));
		}
	}
}