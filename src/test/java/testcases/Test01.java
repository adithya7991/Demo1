package testcases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test01 {
	
	WebDriver dri;
  @Test
  public void test() {
	  
	  dri.get("https://www.google.com/");
	  
  }
  

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  dri = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  dri.quit();
  }

  
}
