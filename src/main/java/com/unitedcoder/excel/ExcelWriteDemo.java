package com.unitedcoder.excel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        List<String> gradeReports=new ArrayList<>();
        //CS101 Grade Report
        gradeReports.add("FirstName,LastName,Subject,Grade,Status");
        gradeReports.add("Jason,Smith,CS101,80,Passed");
        gradeReports.add("Mike,Johnson,CS101,90,Passed");
        gradeReports.add("Smith,Jack,CS101,65,Failed");
        gradeReports.add("Shaun,Norman,CS101,95,Passed");
       //add testing automation 102 grade report
        gradeReports.add("Jason,Smith,Testing102,70,Passed");
        gradeReports.add("Mike,Johnson,Testing102,60,Failed");
        gradeReports.add("Smith,Jack,Testing102,75,Passed");
        gradeReports.add("Shaun,Norman,Testing102,95,Passed");
        String filename="doc/gradereport"+getCurrentDateTime()+".xlsx";
        excelUtility.writeExcelFileMultipleCells(filename,"Class_Grade",gradeReports);
    }

    public static String getCurrentDateTime()
    {
        //
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
        return formatter.format(localDateTime);
    }
}
