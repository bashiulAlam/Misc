package com.konasl.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Sabab on 1/21/2020.
 */
public class FileRead {

    public static void readExcelFile() throws FileNotFoundException {

        File file = new File("E:\\IntelliJ Source Projects\\LaoTotoWinnerSelection\\GameNumbers.xlsx");
        FileInputStream fis = new FileInputStream(file);

        /*XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
        Iterator<Row> itr = sheet.iterator();*/
    }
}
