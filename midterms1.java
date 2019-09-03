/**
 * @(#)midterms1.java
 *
 * midterms1 application
 *
 * @author 
 * @version 1.00 2019/9/3
 */
 import java.util.Scanner;
 import java.util.Date;
 import java.util.Calendar;
 import java.util.GregorianCalendar;
 import java.text.SimpleDateFormat;
public class midterms1 {
    
    public static void main(String[] args) throws Exception  {
    	
    	Scanner sc = new Scanner(System.in);
    	Date date = new Date();
    	SimpleDateFormat format=new SimpleDateFormat("dd-M-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	System.out.print("Input Date; ");
    	String input_date = sc.nextLine();
    	Date dte = format.parse(input_date);
    	
    	System.out.print(dte);
    	
    	String input_bday = "8-19-2000";
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	System.out.print("MY age: " + age);
    	
    }
}
