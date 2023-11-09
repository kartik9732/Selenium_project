package Excel_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_class {
	private static final String WorkbookFactory = null;

	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel_practice/Parctice_Automation.xlsx");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
}

	public static String getExcelData(String First_excel_code, int row, int cell ) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./Excel_practice/Parctice_Automation.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		book.getSheet(First_excel_code);
		
		
		

		return null;
	}

}
