package seleniumdemo;


import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo20_excel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		File fexcel= new File("C:\\CSTS\\selenium training\\Test1.xls");
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		writebook.createSheet("firstsheet", 0);// 0 means first sheet in excel
		WritableSheet writesheet=writebook.getSheet(0);
		Label data = new Label(0,0,"Hi"); // 1st row 1st column 0 0 stands for and in that Hi
		writesheet.addCell(data);	
		
		Label data1 = new Label(0,1,"Hello"); // 1st row 2nd column 0 1 stands for and in that Hello
		writesheet.addCell(data1);	
		
		writebook.createSheet("secondsheet", 1);
		WritableSheet writesheet1=writebook.getSheet(1);
		Label text = new Label(0,4,"Manipal"); //first row 5th column
		writesheet1.addCell(text);	
		Label text1 = new Label(1,0,"Selenium"); //second row 1st column
		writesheet1.addCell(text1);
		
		writebook.write();
		writebook.close();
		
		Workbook workbook=Workbook.getWorkbook(new File("C:\\CSTS\\selenium training\\Test1.xls"));
		Sheet sheet=null;
		int noofsheets=workbook.getNumberOfSheets();
		
		Cell cell1=null;
		for(int p=0;p<noofsheets;p++)
		{
		sheet=workbook.getSheet(p);
		String name = sheet.getName();
		int noofrows=sheet.getRows();
		int noofcolumns=sheet.getColumns();
		System.out.println("Data present in row: "+ noofrows+ "\n" +"Data present in column: " + noofcolumns);
		System.out.println("Data present in sheet: " + name);
		for(int i=0;i<noofrows;i++)
		{
			for (int j=0;j<noofcolumns;j++)
			{
				cell1=sheet.getCell(j,i);
				if (cell1.getContents().length()>0)
				{
					System.out.println(cell1.getContents());
				}
			}
		}
		
		}
		workbook.close();

	}

}
