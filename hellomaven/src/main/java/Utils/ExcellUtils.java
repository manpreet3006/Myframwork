package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcellUtils {
	
	@Test
	public  static void readFromExcel() throws IOException{
		
		FileInputStream fis = new FileInputStream(" ");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Approved");
		
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext()){
			Row row = rows.next();
			Iterator<Cell> cells = row.iterator();
		while(cells.hasNext()){
				Cell cell = cells.next();
				int type = cell.getCellType();
				switch(type){
				 case 4:
	                  System.out.print(cell.getBooleanCellValue() + "\t\t");
	                  break;
	              case 0:
	                  System.out.print(cell.getNumericCellValue() + "\t\t");
	                 
	                  break;
	              case 1:
	                  System.out.print(cell.getStringCellValue() + "\t\t");
	                  break;
	              case Cell.CELL_TYPE_BLANK:
	            	  
	           	  break;
				
				}
		}

			System.out.println();
			
		}
		
		
		}
}
	

	
