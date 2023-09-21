package resuable;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {


    public static String getDataFromExcel(String sheetName,int rowIndex , int coulumnIndex) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/TestData/TestDataSample.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(rowIndex).getCell(coulumnIndex).getStringCellValue();
    }
}
