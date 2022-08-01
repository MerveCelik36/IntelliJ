package Syntax.Utility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String,String>> read(String path)     {
        FileInputStream fileInputStream=null;
        // we will store the data of cells in the map and will store those maps in a list
        List<Map<String,String>> excelData=new ArrayList<>();
        try{
            fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            //how many rows contain the data in a sheet
            int noOfRows=sheet.getPhysicalNumberOfRows();

            //this map will hold the data for rows
            LinkedHashMap<String,String> rowData;
            //Contains all the keys that we will use in a map
            Row headerRow=sheet.getRow(0);
            for (int i = 1; i < noOfRows; i++) {
                Row dataRow=sheet.getRow(i);
                rowData=new LinkedHashMap<>();
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

        }catch (IOException io){
            System.out.println("Please check the file at this path it might have a different name or might not be present path = "+path);
            io.printStackTrace();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            try{
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            }catch (IOException ioException){
                System.out.println("Something went wrong while closing the file");
            }


        }


        return excelData;
    }
}
