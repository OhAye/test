package com.Ceridian.com;


import org.apache.poi.common.usermodel.Hyperlink;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * Created by Saahme on 26/07/2016.
 */
public class ExcelUtils {

    int randomInt;
    String theCount;
    Workbook workbook;

    public String[] readLoginInformation() {
        String ex[] = new String[100];
        try {
            File file = new File("C:/Users/saahme/Documents/filepath.xls");
//            FileInputStream fileInputStream = new FileInputStream("C:/Users/saahme/Documents/filepath.xls");
            Workbook workbook = WorkbookFactory.create(file);
            Sheet worksheet = workbook.getSheetAt(0);
            Row row1 = worksheet.getRow(1);
            Cell cellA3 = row1.getCell(0);
            ex[0] = new BigDecimal(cellA3.getNumericCellValue()).toPlainString();


            DataFormatter formatter = new DataFormatter();
            Row row2 = worksheet.getRow(1);
            Cell cellB3 = row2.getCell(1);
            ex[1] = formatter.formatCellValue(cellB3);
//            ex[1] = cellB3.getStringCellValue();

            Row row3 = worksheet.getRow(1);

            Cell cellC2 = row3.getCell(2);
            Hyperlink h = cellC2.getHyperlink();
            ex[2] = h.getAddress();

            System.out.println("A3: " + ex[0]);
            System.out.println("B3: " + ex[1]);
            System.out.println("C2: " + ex[2]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }


        return ex;

    }

    public String[] readNewHireData() {
        String ex2[] = new String[100];

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            File file = new File("C:/Users/saahme/Documents/filepath.xls");

            workbook = WorkbookFactory.create(file);
            Sheet worksheet = workbook.getSheetAt(1);

//            Row rowCount = worksheet.getRow(1);
//            Cell count = rowCount.getCell(11);
//            theCount =  new BigDecimal(count.getNumericCellValue()).toPlainString();

            Row row1 = worksheet.getRow(randomInt);
            Cell firstName = row1.getCell(0);
            ex2[0] = firstName.getStringCellValue();

            Row row2 = worksheet.getRow(randomInt);
            Cell lastName = row2.getCell(1);
            ex2[1] = lastName.getStringCellValue();

            Row row3 = worksheet.getRow(randomInt);
            Cell startDate = row3.getCell(2);
            ex2[2] = String.valueOf(sdf.format(startDate.getDateCellValue()));

            Row row4 = worksheet.getRow(randomInt);
            Cell NINumbers = row4.getCell(3);
            ex2[3] = NINumbers.getStringCellValue();

            Row row5 = worksheet.getRow(randomInt);
            Cell DOB = row5.getCell(4);
            ex2[4] = String.valueOf(sdf.format(DOB.getDateCellValue()));

            Row row6 = worksheet.getRow(randomInt);
            Cell addressLine = row6.getCell(5);
            ex2[5] = addressLine.getStringCellValue();

            Row row7 = worksheet.getRow(randomInt);
            Cell postCode = row7.getCell(6);
            ex2[6] = postCode.getStringCellValue();

            Row row8 = worksheet.getRow(randomInt);
            Cell serviceDate = row8.getCell(7);
            ex2[7] = String.valueOf(sdf.format(serviceDate.getDateCellValue()));

            Row row9 = worksheet.getRow(randomInt);
            Cell holidayStartDate = row9.getCell(8);
            ex2[8] = String.valueOf(sdf.format(holidayStartDate.getDateCellValue()));

            Row row10 = worksheet.getRow(randomInt);
            Cell annualSalary = row10.getCell(9);
            ex2[9] = String.valueOf(annualSalary.getNumericCellValue());

            Row row11 = worksheet.getRow(randomInt);
            Cell hoursPerWeek = row11.getCell(10);
            ex2[10] = String.valueOf(hoursPerWeek.getNumericCellValue());

//            Row rowCount2 = worksheet.getRow(1);
//            Cell count2 = rowCount2.getCell(11);
//            count2.setCellValue(theCount + 1);



            System.out.println("DOB is: " + ex2[4]);
            System.out.println("AddressLine is: " + ex2[5]);
            System.out.println("Postcode is: " + ex2[6]);
            System.out.println("Service Date is: " + ex2[7]);
            System.out.println("Holiday Date is: " + ex2[8]);
            System.out.println("Annual Salary is: " + ex2[9]);
            System.out.println("Hour Per Week is: " + ex2[10]);
            System.out.println("Count is " + theCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return ex2;
    }

    public void writeToExcel() {
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            FileOutputStream fos = new FileOutputStream("C:/Users/saahme/Documents/filepath.xls");
            HSSFSheet worksheet2 = workbook.getSheetAt(1);
            HSSFRow rowCount = worksheet2.getRow(1);
            HSSFCell cellL2 = rowCount.createCell(12);
            cellL2.setCellValue(theCount + 1);
            workbook.write(fos);

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    public int randomInt() {
        Random rg = new Random();
        for (int idx = 1; idx <= 7; ++idx) {
            randomInt = rg.nextInt(7);
        }
        System.out.println(randomInt);
        return randomInt;
    }


}



