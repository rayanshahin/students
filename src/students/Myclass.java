package students;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		List<WebElement> myStudents = driver.findElements(By.tagName("option"));
		driver.findElement(By.xpath("//*[@id=\"selectNow\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Date currentTime = new Date();

		//String myUpdatedate = currentTime.toString();

		//String NewDate = myUpdatedate.replace(":", "-");

		//TakesScreenshot ts = (TakesScreenshot) driver;
	//	File file = ts.getScreenshotAs(OutputType.FILE);

	//	FileUtils.copyFile(file, new File("./ScreenShot_Folder/" + NewDate + ".jpg"));
		
		
		//  for(int i=0; i< myStudents.size();i++) {
			//  myStudents.get(i).getText();
			 // System.out.println(myStudents.get(i).getText());
			//  if(i%2==0) {
			//	  System.out.println(myStudents.get(i).getText());
			//  }
			  
			for(int i=3;i<myStudents.size();i=i+4) {
				myStudents.get(i).click();
				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			}
		 }
		 
		  
		
		  
		  
		  
		 
		  
		
		  
		 // }
		 

	}

