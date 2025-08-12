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

public class Checkbox {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prsku\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        
//        driver.manage().window().setSize(new Dimension(1536, 1048));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void demo2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com"); //instead of get we can TO also
//        driver.manage().window().setSize(new Dimension(1936,1048));   
       driver.manage().window().maximize();
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.findElement(By.linkText("Checkboxes")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
       Thread.sleep(2000);
       System.out.println(driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected());
       System.out.println(driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected());

       
       
       }
}