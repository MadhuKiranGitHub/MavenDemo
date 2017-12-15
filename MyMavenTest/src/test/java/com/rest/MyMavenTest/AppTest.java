package com.rest.MyMavenTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest
{
   @Test
	public static void test1( )
    {
        System.out.println( "Hello World!" );
    }
   
   @Test
   public void test2() throws InterruptedException{
	   WebDriver driver;
	   System.setProperty("webdriver.gecko.driver", "/Users/madhu/Downloads/geckodriver");
	   driver=new FirefoxDriver();
	   driver.get("http://www.google.com");
	   Thread.sleep(2000);
	   String title = driver.getTitle();
	   assertEquals("Google", title);
	   System.out.println( "titles match" );
	 
	   driver.close();
   }
}


