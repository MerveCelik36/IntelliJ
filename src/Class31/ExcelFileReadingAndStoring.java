package Class31;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReadingAndStoring {
    public static void main(String[] args) throws IOException {
        String path="Files/SDETBatch13.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //how many rows contain the data in a sheet
        int noOfRows=sheet.getPhysicalNumberOfRows();
        // we will store the data of cells in the map and will store those maps in a list
        List<Map<String,String>> excelData=new ArrayList<>();
        //this map will hold the data for rows

        //Contains all the keys that we will use in a map
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i < noOfRows; i++) {
            Row dataRow=sheet.getRow(i);
            HashMap<String,String>  rowData=new HashMap<>();
            //how many cells contain the data in a dataRow
            int noOfCells=dataRow.getPhysicalNumberOfCells();
            /*
            below loop prints all the data from cells in a single line
             */
            for (int j = 0; j < noOfCells; j++) {
                //headerRow.getCell(j).toString() will us cell values from dataRow 0 one by one

                String key=headerRow.getCell(j).toString();
                //dataRow.getCell(j).toString() getting the data from all cells one by one for each dataRow
                String value=dataRow.getCell(j).toString();
                rowData.put(key,value);
            }
            excelData.add(rowData);
        }
        System.out.println(excelData);
        fileInputStream.close();

    }
}
