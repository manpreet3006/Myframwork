package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelutilyread {
	
	@Test
	   public void testM() throws IOException{
		String[][] data = readFromExcel("testExcels.xls");
		 		for(int i =0 ; i< data.length ;i++){
		 			for(int j =0 ; j < data[0].length ; j++){
		 				System.out.print(data[i][j]+"\t");
		 			}
		 			System.out.println();
		 		}
	}
	    String [][] readFromExcel(String testExcels) throws IOException{
	    	String[][]data = null;
	    	File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Datafile\\excels\\"+testExcels);
	    	try{
	    		FileInputStream fis = new FileInputStream(file);
	    		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    		XSSFSheet sheet = workbook.getSheet("Approved");
	    		int rowcount = sheet.getLastRowNum()+1;
	    		int cellcount= sheet.getRow(0).getLastCellNum();
	    		data = new String[rowcount][cellcount];
	    	    int i=0;
	    	    Iterator<Row> rows = sheet.iterator();
	    	    while(rows.hasNext()){
	    	    	int j=0;
	    	    	Row row = rows.next();
	    	    	Iterator<Cell> cells=row.iterator();
	    	    	while(cells.hasNext()){
	    	    		Cell cell=cells.next();
	    	    		if(cell.getCellType()==1){
	    	    			String cellvalue =cell.getStringCellValue();
	    	    			data[i][j]= cellvalue;
	    	    		}
	    	    		j++;
	    	    	}
	    	    	i++;
	    	    }
	    		
	    	}catch(FileNotFoundException e){
	    		e.getStackTrace();
	    	}
			return data;
	    	
	    }
	

}
