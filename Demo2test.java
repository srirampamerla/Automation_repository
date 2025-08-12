package com.cg.webdriver.script1;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsku\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        
//        driver.manage().window().setSize(new Dimension(1536, 1048));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void demo2() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
//        driver.manage().window().setSize(new Dimension(1936,1048));
        driver.manage().window().maximize();       // Login
        System.out.println("**************"+driver.getTitle());
//        if("Swag Labs".equals(driver.getTitle())) {
//        	System.out.println("TRUE");
//        	
//        }
//        else
//        {System.out.println("FALSE");
//    	}
//        assertEquals("Page Title is not s expected","Swag Labs",driver.getTitle());
//        System.out.println("*****************"+driver.getCurrentUrl());
//        System.out.println(driver.findElements(By.tagName("input")).size());
//        System.out.println(driver.getPageSource());
////        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
//        driver.findElement(By.id("user-name")).click();
        
//        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
//        System.out.println(driver.findElements(By.id("id=\"user-name\"")).size());
//        System.out.println(driver.findElements(By.name("id=\"user-name\"")).size());
//        System.out.println(driver.findElements(By.xpath("//input[contains(@class,'form')]")).size());
       
//                WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
//        System.out.println("2 url*****************"+driver.getCurrentUrl());
//        driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-link\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"continue-shopping\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"inventory-container\"]")).click();
//        driver.findElement(By.cssSelector("*[data-test=\"inventory-container\"]")).click();
        
        {
        // Double-click on a specific item
//        WebElement element = driver.findElement(By.cssSelector("*[data-test=\"inventory-container\"]"));
//        Actions builder = new Actions(driver);
//        builder.doubleClick(element).perform();
    }
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");        
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.xpath("//body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.xpath("//body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        WebElement we=driver.findElement(By.name("frame-right"));
        driver.switchTo().frame(we);
        System.out.println(driver.findElement(By.xpath("//body")).getText());

    }
}