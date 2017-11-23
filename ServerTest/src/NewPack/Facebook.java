package NewPack;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	 static WebDriver driver;
	 WebElement select;
    int i=1;
   
//   public int main1(){
//	   return 1+2;
//   }
    public static void main(String[] args) throws InterruptedException,
	IOException {

		ChromeOptions options = new ChromeOptions(); // Remove Browser
														// notification alert
														// pop-ups
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"D:/Vinay/Chromedriver/chromedriver_win32/chromedriver.exe");

		// .....Login..........//

		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("hello");
		
		driver.findElement(By.id("email")).sendKeys("angl.stanvi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("SBK_sabakuch@1234");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		// For Friend List excessive
		System.out.println("new HELLO");
		
		WebElement ele=driver.findElement(By.cssSelector("div#appsNav ._bui._3-96._5pyq  li:nth-child(4)"));
		//System.out.println(ele.getText());
		ele.click();
	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".uiHeader.uiHeaderPage .clearfix.uiHeaderTop .rfloat._ohf .uiHeaderActions a:nth-child(2)")).click();
		Thread.sleep(2000);
		String frndlist=driver.findElement(By.cssSelector("div._70k ._6_7.clearfix li:nth-child(3) span:nth-child(1)")).getText();
		System.out.println("Total Friend =" +frndlist);
		Thread.sleep(2000);
		String[] NAME= new String[Integer.parseInt(frndlist)];
		
	
	
		
		for(int i=1; i<=Integer.parseInt(frndlist);i++){
			//int a=i+1;
			NAME[i]=driver.findElement(By.cssSelector("div._5h60._30f  "
					+ "ul.uiList._262m._4kg "
					+ "li:nth-child("+i+") "
					+ ".clearfix._5qo4  "
					+ ".clearfix._42ef div:nth-child(2) ._6a ._6a._6b .fsl.fwb.fcb  a:nth-child(1)")).getText();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,30)", "");
			System.out.println(NAME[i]);
			Thread.sleep(1000);
		}
		
		
//		System.out.println(name.getAttribute("class"));
//		System.out.println(name.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		File src = new File("D:\\Vinay\\id_password.xlsx"); // Login detail
//		FileInputStream FIS = new FileInputStream(src);
//		XSSFWorkbook WB = new XSSFWorkbook(FIS);
//		XSSFSheet sheet = WB.getSheetAt(0);
//		int rowcount = sheet.getLastRowNum();
//		System.out.println("Total no of Rows-" + rowcount);
//		int j = 0;
//		for (j = 0; j <= rowcount; j++) {
//			int L = 0;
//			String url = sheet.getRow(j).getCell(L).getStringCellValue();
//		    WebElement email=	driver.findElement(By.id("email"));
//		    email.clear();
//		    email.sendKeys(url);
//			
//			L++;
//			String url1 = sheet.getRow(j).getCell(L).getStringCellValue();
//			Thread.sleep(2000);
//			WebElement pass=driver.findElement(By.id("pass"));
//			pass.clear();
//			pass.sendKeys(url1);
//			Thread.sleep(3000);
//			driver.findElement(By.id("loginbutton")).click();
//			Thread.sleep(5000);
//             driver.findElement(By.id("userNavigationLabel")).click();
//             Thread.sleep(3000);
//            driver.findElement(By.cssSelector("div#BLUE_BAR_ID_DO_NOT_USE ._54ng  "
//            		+ ".uiScrollableArea.fade.uiScrollableAreaWithShadow "
//            		+ " .uiScrollableAreaWrap.scrollable  .uiScrollableAreaBody  "
//            		+ ".uiScrollableAreaContent  ul._54nf > li:nth-child(12) a._54nc  ")).click();
//	        Thread.sleep(5000);
	    
		//div:nth-child(5)  ul._54nf   li:nth-child(9 a._54nc
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		File src1 = new File("D:\\Vinay\\Task.xlsx");  // Read group name
//
//		FileInputStream FIS1 = new FileInputStream(src1);
//		XSSFWorkbook WB1 = new XSSFWorkbook(FIS1);
//		XSSFSheet sheet1 = WB1.getSheetAt(0);
//		int rowcount1 = sheet1.getLastRowNum();
//		System.out.println("Total no of Rows-" + rowcount1);
//		int i = 0;
//		for (i = 0; i <= rowcount1; i++) {
//			Thread.sleep(2000);
//
//			driver.findElement(By.linkText("Share")).click(); // Click on share
//			Thread.sleep(6000);
//			driver.findElement(By.cssSelector("#js_2c")).click();
//					
//					
//			for (String winHandle1 : driver.getWindowHandles()) {
//				driver.switchTo().window(winHandle1);
//			}
//			Thread.sleep(2000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			//if (i == 0) {
//
//				driver.findElement(By.linkText("Tag people")).click();
//				Thread.sleep(4000);
//
//				File src2 = new File("D:\\Vinay\\tanvifrnd.xlsx"); // Read groupname 
//																	
//				FileInputStream FIS2 = new FileInputStream(src2);
//				XSSFWorkbook WB2 = new XSSFWorkbook(FIS2);
//				XSSFSheet sheet2 = WB2.getSheetAt(0);
//				int rowcount2 = sheet2.getLastRowNum();
//				System.out.println("Total no of Rows-" + rowcount2);
//
//				int a = 0;
//
//				for (a = 0; a <= rowcount2; a++) {
//					int y = 0;
//					String tag1 = sheet2.getRow(a).getCell(y)
//							.getStringCellValue();
//					WebElement val = driver.findElement(By
//							.xpath("//input[@aria-label='Who are you with?']")); // enter
//																					// frnd
//																					// name
//					val.sendKeys(tag1);
//					Thread.sleep(2000);
//					val.sendKeys(Keys.ENTER);
//					Thread.sleep(2000);
//
//				}
//				driver.findElement(
//						By.cssSelector("._2g61._4jy0._4jy3._4jy1._51sy.selected._42ft"))
//						.click();
////				Thread.sleep(5000);
//			} else if (i == 1) {
//				File src2 = new File("D:\\Vinay\\groupname.xlsx"); // Read group
//																	// name
//
//				FileInputStream FIS2 = new FileInputStream(src2);
//				XSSFWorkbook WB2 = new XSSFWorkbook(FIS2);
//				XSSFSheet sheet2 = WB2.getSheetAt(0);
//				int rowcount2 = sheet2.getLastRowNum();
//				System.out.println("Total no of Rows-" + rowcount2);
//				for (int j = 0; j < rowcount2; j++) {
//					int k = 0;
//					String url1 = sheet2.getRow(j).getCell(k)
//							.getStringCellValue();
//					Thread.sleep(3000);
//					driver.findElement(
//							By.cssSelector("#js_2c"))
//							.click();
//					Thread.sleep(2000);
//					driver.findElement(By.linkText("Share in a group")).click();
//					Thread.sleep(1000);
//					WebElement ele = driver
//							.findElement(By.id("audience_group"));//
//					ele.sendKeys(url1);
//					Thread.sleep(6000);
//					ele.sendKeys(Keys.DOWN);
//					ele.sendKeys(Keys.ENTER);
//					System.out.println("Select group");
//					Thread.sleep(3000);
//					driver.findElement(By.linkText("Share")).click();
//					Thread.sleep(2000);
//					driver.findElement(
//							By.xpath("html/body/div[1]/div[2]/div[3]/div/div/div/ul/li[2]/a/span/span"))
//							.click();
//					Thread.sleep(2000);
//					for (String winHandle1 : driver.getWindowHandles()) {
//						driver.switchTo().window(winHandle1);
//					}
//					driver.findElement(
//							By.cssSelector(".img.sp__V4jPhVCZqe.sx_84d00e"))
//							.click();

				//}
		//	}

		//}

		// .........Facebook Home page.....//

		// driver.findElement(By.name("xhpc_message")).sendKeys("hiiiiiiii");
		// Thread.sleep(2000);
		// driver.findElement(By.linkText("Tag friends")).click();
		// Thread.sleep(1000);
		// WebElement tag= driver.findElement(By.id("js_3pu"));
		// tag.sendKeys("AAkash Thakur");
		// tag.sendKeys(Keys.ENTER);

		// ...........Group Post......................

		// driver.navigate().to("https://www.facebook.com/groups/303181993439743/");
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		//
		//
		// driver.findElement(By.name("xhpc_message_text")).sendKeys(" https://www.facebook.com/sabakuchdotcom/photos/a.932768906765522.1073741828.931158036926609/1583985244977215/?type=3&theater/");
		// Thread.sleep(2000);
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("window.scrollBy(0,50)", "");
		// Thread.sleep(3000);
		// for(String winHandle : driver.getWindowHandles()){
		// driver.switchTo().window(winHandle);
		// }
		//
		//
		// driver.findElement(By.cssSelector("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft")).click();
		// Thread.sleep(3000);
		//
		// System.out.println("Group Post Successfully");

		// .............Time Line post......................//

		// Thread.sleep(2000);
		// driver.navigate().to("https://www.facebook.com/profile.php?id=100015142839965");
		// Thread.sleep(4000);
		// JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		// jse1.executeScript("window.scrollBy(0,500)", "");
		//
		// for(String winHandle : driver.getWindowHandles()){
		// driver.switchTo().window(winHandle);
		// }
		// driver.findElement(By.name("xhpc_message_text")).sendKeys("sabakuch");
		// Thread.sleep(3000);
		//
		// Thread.sleep(3000);
		//
		// driver.findElement(By.cssSelector("._2vwi._51y3")).click();
		//
		// Thread.sleep(2000);
		//
		// WebElement ele= driver.findElement(By.id("js_1vf"));
		// ele.sendKeys("AAkash Thakur");
		// ele.sendKeys(Keys.ENTER);
		// driver.findElement(By.cssSelector("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft")).click();

	//}
}


}