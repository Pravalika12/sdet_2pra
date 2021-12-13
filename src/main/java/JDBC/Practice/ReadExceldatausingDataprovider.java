package JDBC.Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.VTiger.genericutil.IAutoConstants;

public class ReadExceldatausingDataprovider {
	public int getLastRow(String sheetname) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath1);
		Workbook workbook =WorkbookFactory.create(fis);

		return workbook.getSheet(sheetname).getLastRowNum();
	}
	public String selectValueFromDD(String sheetname,int cvalue,String DDValue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath1);
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sh=workbook.getSheet(sheetname);
		int lastrow=getLastRow(sheetname);
		String value="Null";
		for(int i=0;i<=lastrow;i++)
		{
			value=sh.getRow(i).getCell(cvalue).getStringCellValue();
			if(value.equalsIgnoreCase(DDValue))
			{
				break;
			}
			
		}
		return value;
	}
}
