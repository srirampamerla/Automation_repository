import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class TestTest {
    private WebDriver driver;
    private Map<String, Object> vars;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        vars = new HashMap<>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() {
        driver.get("https://example.com"); // Replace with your actual test URL

        driver.findElement(By.cssSelector("[data-test='continue-shopping']")).click();
        driver.findElement(By.cssSelector("[data-test='inventory-container']")).click();

        WebElement element = driver.findElement(By.cssSelector("[data-test='inventory-container']"));

        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
    }
}


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.HashMap;
import java.util.Map;

public class Test1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() {
        driver.get("https://example.com"); // Replace with your actual test URL

        // Interact with elements using data-test attributes
        driver.findElement(By.cssSelector("[data-test='continue-shopping']")).click();
        driver.findElement(By.cssSelector("[data-test='inventory-container']")).click();

        // Perform double-click action
        WebElement element = driver.findElement(By.cssSelector("[data-test='inventory-container']"));
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
    }
}


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.HashMap;
import java.util.Map;

public class Test1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() {
        driver.get("https://example.com"); // Replace with your actual test URL

        // Interact with elements using data-test attributes
        driver.findElement(By.cssSelector("[data-test='continue-shopping']")).click();
        driver.findElement(By.cssSelector("[data-test='inventory-container']")).click();

        // Perform double-click action
        WebElement element = driver.findElement(By.cssSelector("[data-test='inventory-container']"));
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
    }
}

