package com.sgtesting.exceldemo.assignment1;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerNamesFirstSheet10Row {

	public static void main(String[] args) {
		writeFlowerNames();
	}
	private static void writeFlowerNames()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flower1");
			
			cell=row.createCell(1);
			cell.setCellValue("Flower2");
			
			cell=row.createCell(2);
			cell.setCellValue("Flower3");
			
			cell=row.createCell(3);
			cell.setCellValue("Flower4");
			cell=row.createCell(4);
			cell.setCellValue("Flower5");
			cell=row.createCell(5);
			cell.setCellValue("Flower6");
			cell=row.createCell(6);
			cell.setCellValue("Flower7");
			cell=row.createCell(7);
			cell.setCellValue("Flower8");
			cell=row.createCell(8);
			cell.setCellValue("Flower9");
			cell=row.createCell(9);
			cell.setCellValue("Flower10");
			cell=row.createCell(10);
			cell.setCellValue("Flower11");
			cell=row.createCell(11);
			cell.setCellValue("Flower12");
			cell=row.createCell(12);
			cell.setCellValue("Flower13");
			cell=row.createCell(13);
			cell.setCellValue("Flower14");
			cell=row.createCell(14);
			cell.setCellValue("Flower15");
			cell=row.createCell(15);
			cell.setCellValue("Flower16");
			cell=row.createCell(16);
			cell.setCellValue("Flower17");
			cell=row.createCell(17);
			cell.setCellValue("Flower18");
			cell=row.createCell(18);
			cell.setCellValue("Flower19");
			cell=row.createCell(19);
			cell.setCellValue("Flower20");	
				
			fout=new FileOutputStream("E:\\SG\\FlowerNames.xlsx");
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
