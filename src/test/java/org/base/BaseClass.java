package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.POM.FbLoginPojo;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
	}

	public static String pageTitle() {
		String Title = driver.getTitle();
		return Title;
	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement s) {
		s.click();
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}

	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", element);
	}

	// To Read The Excel Sheet Values And Print In Console
	public static void excelRead(String sheetName, int rowNum, int CellNum) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet MySheet = wb.getSheet("Datas");
		Row r = MySheet.getRow(rowNum);
		Cell c = r.getCell(CellNum);
		int cellType = c.getCellType();

		String value = "  ";
		if (cellType == 1) {
			c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			s.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String.valueOf(l);
		}
	}

	// To createNewExcelFile In Excel Sheet
	public static void createNewExcelFile(int rowNum1, int cellNum1, String writeData) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Datas");
		Row newRow = newSheet.createRow(rowNum1);
		Cell newCell = newRow.createCell(cellNum1);
		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	// To CreateNewCell In Excel Sheet
	public static void createNewCell(int creRow1, int creCell1, String newData) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.getSheet("Datas");
		Row r = s.createRow(creRow1);
		Cell c = r.createCell(creCell1);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	// To CreateCell In Excel Sheet
	public static void createCell(int rowNum2, int cellNum2, String NewData) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(rowNum2);
		Cell newCell = r.createCell(cellNum2);
		newCell.setCellValue(NewData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	// To CreateRow In Excel Sheet
	public static void createRow(int creRow2, int creCell2, String NewData) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.createRow(creRow2);
		Cell c = r.createCell(creCell2);
		c.setCellValue(NewData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	// To upadateDataToParticuarCell
	public static void upadateDataToParticuarCell(int getTheRow, int getTheCell, String existingData,
			String writeNewData) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	// To Write The Value in ExcelSheet Codes here given
	public static void main3(String[] args) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet NewSheet = w.createSheet("Datas");
		Row newRow = NewSheet.createRow(0);
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue("DataDriven");
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	// To launch a Browser with Logn Details
	public static void main4(String[] args) {
		launchBrowser();
		launchUrl("https://staging3-akes.nexquare.io/nexquare/");
		windowMaximize();
		WebElement email = driver.findElement(By.id("email"));
		passText("Selenium", email);
		WebElement passwoerd = driver.findElement(By.id("pass"));
		passText("8667203428", passwoerd);
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

	// To Launch Browser with simple Coding
	public static void main6(String[] args) {
		launchBrowser();
		launchUrl("https://staging3-akes.nexquare.io/nexquare/");
		windowMaximize();
		FbLoginPojo f = new FbLoginPojo();
		passText("Selenium", f.getEmail());
		passText("inmakes", f.getPassword());
		
		driver.navigate().refresh();
		passText("Pushparaj", f.getEmail());
		passText("Pushparaj", f.getPassword());
	}
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void EndDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@BeforeClass
	private void LaunchTheBrowser() {
	  launchBrowser();
	  windowMaximize();
	}
	@AfterClass
	private void CloseTheBrowser() {
		System.out.println("CloseTheBrowser...");

	}
	//Hard Assert Mathod Below 1st FB Login with TestNG
	public void Tc1111() {
		System.out.println("Test Case 1");
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
		driver.manage().window().maximize();
		String title = pageTitle();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pushparajsivakumar2@gmail.com");

		Assert.assertTrue(title.contains("facebook"), "check your page title");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Inmakes");
	}
	//Soft Assert Mathod Below 1st FB Login with TestNG
	public void Tc366() {
		System.out.println("Test Case 3");
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
		driver.manage().window().maximize();
		String title = pageTitle();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("SeleniumInmakes@gmail.com");

		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "check your page title");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Inmakes");
	}
	//Priority 
	@Test(priority = 7)
	private void Tc111() {		
		System.out.println("Test Case 7 ");
		launchBrowser();
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
	}
	//Data Provider Syntax for Values
	@DataProvider(name = "Sample Data") 
	private Object[][] data() {
		return new Object[][] { { "abc@gmaill.com", "3632698" }, { "selenium@gmail.com", "8y8ehehds" },
				{ "inmakes@gmail.com", "augiuq8qj" }, { "48sam@gmail.com", "jasbjkgDSB" }, };

	}
	//Data Provider in Test Case
	@Test(dataProvider = "Sample Data")
	private void Tc333(String em, String pass) {
		System.out.println("Test Case 35");
		driver.get("https://staging3-akes.nexquare.io/nexquare/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	}
	
}
