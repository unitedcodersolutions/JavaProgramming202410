package com.unitedcoder.excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.List;

public class ExcelUtility {
    //write a method to read from an Excel file
    public String readExcelCell(String fileName,String sheetName,int rowNumber, int cellNumber)
    {
        String cellValue=null;
        //read file using file input stream
        FileInputStream excelFile=null;
        try {
            excelFile=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //open the Excel File
        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(excelFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //read work sheet from the excel file
        XSSFSheet sheet=workbook.getSheet(sheetName);
        //get row from the work sheet
        XSSFRow row=sheet.getRow(rowNumber);
        //get the cell value
        if(row==null)
        {
            System.out.println("Empty row; no data is available in the excel sheet");
        }
        else
        {
            XSSFCell cell=row.getCell(cellNumber);
            CellType cellType=cell.getCellType();//read the excel cell type
            switch (cellType){
                case NUMERIC :
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    break;
                default:
                    cellValue=cell.getStringCellValue();
                    break;
            }
        }
        return  cellValue;
    }

    public int getTotalRows(String fileName,String sheetName)
    {
        //read file using file input stream
        FileInputStream excelFile=null;
        try {
            excelFile=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //open the Excel File
        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(excelFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //read work sheet from the excel file
        XSSFSheet sheet=workbook.getSheet(sheetName);
        System.out.println("Total rows: "+sheet.getLastRowNum());
        return  sheet.getLastRowNum();
    }

    public int getTotalCells (String fileName,String sheetName)
    {
        //read file using file input stream
        FileInputStream excelFile=null;
        try {
            excelFile=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //open the Excel File
        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(excelFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //read work sheet from the excel file
        XSSFSheet sheet=workbook.getSheet(sheetName);
        int rowNumber=sheet.getLastRowNum();
        //get row from the work sheet
        XSSFRow row=sheet.getRow(rowNumber);
        int lastCellNumber=row.getLastCellNum();
        //get the cell value
     return  lastCellNumber;
    }
    //write a method for writing to an Excel file
    public void writeExcelFileMultipleCells(String fileName, String sheetName, List<String> contents)
    {
        //define a file to write
        File excelFile=new File(fileName);
        //define a workbook
        XSSFWorkbook workbook=new XSSFWorkbook();
        //add a work sheet to the book
        XSSFSheet sheet= workbook.createSheet(sheetName);
        //define rows in the worksheet
        int numberOfRows=contents.size();
        for(int rowNumber=0;rowNumber<numberOfRows;rowNumber++)
        {
            XSSFRow row=sheet.createRow(rowNumber); //add row to the sheet
            String[] rowContent=contents.get(rowNumber).split(","); //use array to split each row content
            int totalCells=rowContent.length;
            //create cell in the row
            for(int cellNumber=0;cellNumber<totalCells;cellNumber++)
            {
                XSSFCell cell=row.createCell(cellNumber); //create a cell in the current row
                //add value to the cell
                cell.setCellValue(rowContent[cellNumber]); //add cell value to the cell
                if(rowContent[cellNumber].equalsIgnoreCase("passed"))
                {
                    XSSFCellStyle style=workbook.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());//set color to Green
                    style.setFillPattern(FillPatternType.FINE_DOTS);
                    cell.setCellStyle(style);
                }
                else
                {
                        XSSFCellStyle style=workbook.createCellStyle();
                        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());//set color to Green
                        style.setFillPattern(FillPatternType.NO_FILL);
                        cell.setCellStyle(style);
                }
            }

        }
        //define output stream to write to Excel file
        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
