package test_package;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Assignment4
{
    public static void main(String[] args) throws Exception
    {
        //NOTE: You require an excel sheet in your C: Drive called "ExcelTest" within a folder called "ExcelData"
        //WRITE EXCEL SHEET
        File source = new File("C:\\ExcelData\\ExcelTest.xlsx");

        FileInputStream filesource = new FileInputStream(source);

        XSSFWorkbook wb = new XSSFWorkbook(filesource);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        //column of usernames
        for (int i = 0; i < 4; i++)
        {
            sheet1.getRow(i).createCell(0).setCellValue("Username" + (i + 1));
        }

        //column of passwords
        for (int i = 0; i < 4; i++)
        {
            sheet1.getRow(i).createCell(1).setCellValue("Password" + (i + 1));
        }

        //columm of random numbers
        for (int i = 0; i < 4; i++)
        {
            //generate random number from 1000-9999
            int randomNum = (int)(Math.random() * (9999 - 1000 + 1) + 1000);
            sheet1.getRow(i).createCell(2).setCellValue(Integer.toString(randomNum));
        }

        try {
            //whenever you want to write, you have to use FileOutputStream
            FileOutputStream fileOut = new FileOutputStream(source);
            wb.write(fileOut);
        } catch (Exception e) {
            // catch block
            e.printStackTrace();
        }

        //READS EXCEL SHEET

        for (int i = 0; i < 4; i++)
        {
            String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
            String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
            String data3 = sheet1.getRow(i).getCell(2).getStringCellValue();
            System.out.println(data1 + " " + data2 + " " + data3);
        }

        wb.close();

    }
}
