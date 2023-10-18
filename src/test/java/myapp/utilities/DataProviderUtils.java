package myapp.utilities;


import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    //    Data Provider Method to get the employee credentials
    @DataProvider
    public Object[][] employeeCredentialsProvider(){
        Object [][] employeeInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return employeeInfo;
    }
 // Data Provider to get employee credentials from the Excel
    @DataProvider
    public Object[][] excelEmployeeData(){
        String excelPath = "./resources/data_sheet.xlsx";
        String sheetName = "employee_credentials";
        ExcelUtils excelUtils=new ExcelUtils(excelPath,sheetName);
        Object [][] employeeInfo  = excelUtils.getDataArrayWithoutFirstRow();
        return employeeInfo;
    }
}