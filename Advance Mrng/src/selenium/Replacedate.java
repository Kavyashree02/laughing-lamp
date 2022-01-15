package selenium;

import java.util.Date;

public class Replacedate {

		public static void main(String[] args) 
		{
			Date date = new Date();
			String dateString = date.toString();
			String currentdate = dateString.replaceAll(":", "-");
			System.out.println(currentdate);
	}

}
