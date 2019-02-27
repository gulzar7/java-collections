//Write a program to format date as example "21-March-2016"


import java.text.SimpleDateFormat;
import java.util.Date;
class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MMMMM-yyyy");
		System.out.println(format.format(date));
	}
}