package dummy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateAndTime {

	public static void main(String[] args) {
		//create an obj for data class
		Date dateObj = new Date();
		System.out.println(dateObj);
		//date-->create an obj for SDF Class and pass format as yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		//time-->create an obj for SDF Class and pass format as HH:mm:ss 
		SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf1.format(dateObj));
		System.out.println(date);
	}

}
