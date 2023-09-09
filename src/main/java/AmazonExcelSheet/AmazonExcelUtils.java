package AmazonExcelSheet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AmazonExcelUtils {
    public String projectpath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public AmazonExcelUtils(String excelPath, String sheetName) {
        try {
            projectpath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectpath + "/Excel/AmazonData.xlsx");
            sheet = workbook.getSheet("Sheet1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        getCellDataString(0, 0);
    }

    public static char[] getCellDataString(int rowNum, int colNum) {
        try {
            String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return new char[0];
    }
}


