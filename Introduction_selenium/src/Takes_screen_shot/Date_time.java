package Takes_screen_shot;

import java.util.Date;

public class Date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		String newdate=date.toString();
		 String newdate2=newdate.replace(' ','_').replace(':','_');
		 System.out.println(newdate2);
		
		

	}

}
