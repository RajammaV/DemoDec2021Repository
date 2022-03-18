package com.sgtesting.exceldemo.assignment1;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityNameFirstSheet5ThColumn {

	public static void main(String[] args) {
		 writeCityNames();
	}
	private static void writeCityNames()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentails");
			row=sh.createRow(0);
			cell=row.createCell(4);
			cell.setCellValue("CityName1");
			
			row=sh.createRow(1);
			cell=row.createCell(4);
			cell.setCellValue("CityName2");
			
			row=sh.createRow(2);
			cell=row.createCell(4);
			cell.setCellValue("CityName3");
			
			row=sh.createRow(3);
			cell=row.createCell(4);
			cell.setCellValue("CityName4");
			
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("CityName5");
			
			row=sh.createRow(5);
			cell=row.createCell(4);
			cell.setCellValue("CityName6");
			
			row=sh.createRow(6);
			cell=row.createCell(4);
			cell.setCellValue("CityName7");
			
			row=sh.createRow(7);
			cell=row.createCell(4);
			cell.setCellValue("CityName8");
			
			row=sh.createRow(8);
			cell=row.createCell(4);
			cell.setCellValue("CityName9");
			
			row=sh.createRow(9);
			cell=row.createCell(4);
			cell.setCellValue("CityName10");
			
			row=sh.createRow(10);
			cell=row.createCell(4);
			cell.setCellValue("CityName11");
			
			row=sh.createRow(11);
			cell=row.createCell(4);
			cell.setCellValue("CityName12");
			
			row=sh.createRow(12);
			cell=row.createCell(4);
			cell.setCellValue("CityName13");
			
			row=sh.createRow(13);
			cell=row.createCell(4);
			cell.setCellValue("CityName14");
			
			row=sh.createRow(14);
			cell=row.createCell(4);
			cell.setCellValue("CityName15");
			
			row=sh.createRow(15);
			cell=row.createCell(4);
			cell.setCellValue("CityName16");
			
			row=sh.createRow(16);
			cell=row.createCell(4);
			cell.setCellValue("CityName17");
			
			row=sh.createRow(17);
			cell=row.createCell(4);
			cell.setCellValue("CityName18");
			
			row=sh.createRow(18);
			cell=row.createCell(4);
			cell.setCellValue("CityName19");
			
			row=sh.createRow(19);
			cell=row.createCell(4);
			cell.setCellValue("CityName20");
			
			fout=new FileOutputStream("E:\\SG\\CityNames.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
