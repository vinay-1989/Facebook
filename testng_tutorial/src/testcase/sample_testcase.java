package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample_testcase {
//	static WebDriver driver;
//	static WebElement select;
//	@Test(priority=1)
//	public void config(){
//		
//		System.setProperty("webdriver.chrome.driver","D:/Vinay/Chromedriver/chromedriver_win32/chromedriver.exe");
//	    driver = new ChromeDriver();
//		driver.get("https://192.168.2.10/sb/mock_paper/admin/index/");
//		driver.manage().window().maximize();
//}
//	
//	@Test(priority=2)
//	public void login() throws InterruptedException{
//		driver.findElement(By.name("username")).sendKeys("ravi");
//		driver.findElement(By.name("password")).sendKeys("1234");
//		Thread.sleep(1000);
//		Select type=new Select(driver.findElement(By.id("usertype")));
//		type.selectByVisibleText("Admin");
//		driver.findElement(By.id("userlogin")).click();
//		Thread.sleep(3000);
//	}
//
//@Test (priority=3)
//public void selexam() throws InterruptedException{
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if not select any Exam="+"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	Select exam=new Select(driver.findElement(By.id("examlistpaper")));
//	exam.selectByVisibleText("JEE (Main)");
//	Thread.sleep(2000);
//}
//@Test (priority=4)
//public void noquestion() throws InterruptedException{
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if Number of Question field is Blank=" +"  "+ driver.findElement(By.className("error-message")).getText()); // get message
//	driver.findElement(By.id("noofq")).sendKeys("-90");
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if Number of Question is -ve value=" +"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	Thread.sleep(2000);
//	driver.findElement(By.id("noofq")).clear();
//	Thread.sleep(2000);
//	driver.findElement(By.id("noofq")).sendKeys("0");
//	System.out.println("if Numbe of Question is 0 assign="+"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	Thread.sleep(2000);
//	driver.findElement(By.id("noofq")).clear();
//	driver.findElement(By.id("noofq")).sendKeys("90");
//}
//@Test(priority=5)
//public void time(){
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if time field is blank="+"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	driver.findElement(By.id("td")).sendKeys("-60");
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if time field have -ve value="+"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	driver.findElement(By.id("td")).clear();
//	driver.findElement(By.id("td")).sendKeys("fgdfg");
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println("if time field have character value=" +"  "+driver.findElement(By.className("error-message")).getText()); // get message
//	driver.findElement(By.id("td")).clear();
//	driver.findElement(By.id("td")).sendKeys("180");
//	driver.findElement(By.id("makepaper")).click();  // check validation
//}
//@Test(priority=6)
//	public void totalmarks(){
//	driver.findElement(By.id("makepaper")).click();  // check validation
//	System.out.println(driver.findElement(By.className("error-message")).getText()); // get message
//	driver.findElement(By.id("tm")).sendKeys("360");
//}
    @Test
    public static void am(){
    	System.out.println("m");
    }
	@Test
	public static void an(){
		System.out.println("assd");
	}
	@Test
	public static void z(){
		System.out.println("z");
	}
	@Test
	public static void c(){
		System.out.println("c");
	} 
// @Test (priority=2)
// public static void test(){
//	 System.out.println("priority 2");
// }
// @Test (priority=1)
// public static void test1(){
//	 System.out.println("priority 1");
// }
}
