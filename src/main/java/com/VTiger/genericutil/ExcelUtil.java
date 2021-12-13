package com.VTiger.genericutil;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	/**
	 * @author lenovo
	 * Description:singleton concept
	 */
	private ExcelUtil()
	{
	}
	/**
	 * @author lenovo
	 * Description:creating excel object
	 * @param sheetname
	 * @return
	 */
	public static ExcelUtil objOfExcelUtil()
	{
		ExcelUtil e1=new ExcelUtil();
		return e1;
	}
	/**
	 * @author lenovo
	 * Description:reading data from excel sheet
	 * @param sheetname
	 * @return
	 * @throws Throwable 
	 * 
	 */





	public String readExcelData(String sname,int rnum,int cnum) throws Throwable
	{

		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		String value=workbook.getSheet(sname).getRow(cnum).getCell(rnum).getStringCellValue();
		return value;
	}
	public int getLastRow(String sheetname) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
		Workbook workbook =WorkbookFactory.create(fis);

		return workbook.getSheet(sheetname).getLastRowNum();
	}
	public String selectValueFromDD(String sheetname,int cvalue,String DDValue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
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



