package com.sgtesting.exceldemo.assignment1;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VegitabelNamesDiagnal {

	public static void main(String[] args) {
		writeVegitableNames();
	}
	private static void writeVegitableNames()
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
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Vegitable1");
			
			row=sh.createRow(1);
			cell=row.createCell(1);
			cell.setCellValue("Vegitable2");
			row=sh.createRow(2);
			cell=row.createCell(2);
			cell.setCellValue("Vegitable3");
			row=sh.createRow(3);
			cell=row.createCell(3);
			cell.setCellValue("Vegitable4");
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("Vegitable5");
			row=sh.createRow(5);
			cell=row.createCell(5);
			cell.setCellValue("Vegitable6");
			row=sh.createRow(6);
			cell=row.createCell(6);
			cell.setCellValue("Vegitable7");
			row=sh.createRow(7);
			cell=row.createCell(7);
			cell.setCellValue("Vegitable8");
			row=sh.createRow(8);
			cell=row.createCell(8);
			cell.setCellValue("Vegitable9");
			row=sh.createRow(9);
			cell=row.createCell(9);
			cell.setCellValue("Vegitable10");
			row=sh.createRow(10);
			cell=row.createCell(10);
			cell.setCellValue("Vegitable11");
			row=sh.createRow(11);
			cell=row.createCell(11);
			cell.setCellValue("Vegitable12");
			row=sh.createRow(12);
			cell=row.createCell(12);
			cell.setCellValue("Vegitable13");
			row=sh.createRow(13);
			cell=row.createCell(13);
			cell.setCellValue("Vegitable14");
			row=sh.createRow(14);
			cell=row.createCell(14);
			cell.setCellValue("Vegitable15");
			row=sh.createRow(15);
			cell=row.createCell(15);
			cell.setCellValue("Vegitable16");
			row=sh.createRow(16);
			cell=row.createCell(16);
			cell.setCellValue("Vegitable17");
			row=sh.createRow(17);
			cell=row.createCell(17);
			cell.setCellValue("Vegitable18");
			row=sh.createRow(18);
			cell=row.createCell(18);
			cell.setCellValue("Vegitable19");
			row=sh.createRow(19);
			cell=row.createCell(19);
			cell.setCellValue("Vegitable20");
			
			fout=new FileOutputStream("E:\\SG\\VegitableNames.xlsx");
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
