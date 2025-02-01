package com.unitedcoder.excel;

import com.unitedcoder.configutility.ApplicationConfig;

import java.io.File;

public class ExcelReadDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        ApplicationConfig applicationConfig=new ApplicationConfig();
        String excelFileFolder=applicationConfig.readConfigurationFile("config.properties","excel_file_folder");
        String excelFileName=applicationConfig.readConfigurationFile("config.properties","excel_file_name");
        String fileName=excelFileFolder+ File.separator+excelFileName;
        String amazonUrl=excelUtility.readExcelCell(fileName,"Sheet1",1,1);
        System.out.println(amazonUrl);
        int rows=excelUtility.getTotalRows(fileName,"Sheet1")+1;
        int cols=excelUtility.getTotalCells(fileName,"Sheet1");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                String value=excelUtility.readExcelCell(fileName,"Sheet1",i,j);
                System.out.print(value+ "           ");
            }
            System.out.println();
        }

    }
}
