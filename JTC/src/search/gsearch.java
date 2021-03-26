package search;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsearch {

	public static void main(String[] args) throws Exception {
				
		System.setProperty("webdriver.chrome.driver","/home/imuons/Desktop/Jars and Files/Jars/chromedriver_linux64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
				
		//driver.findElement(By.name("q")).click();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter to search");
		
		String s=sc.nextLine();
		
		driver.findElement(By.name("q")).sendKeys(s);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(5500);
		
		driver.close();

	}

}
