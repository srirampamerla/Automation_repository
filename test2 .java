package org.testng;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        js = ( HashMap<>();
        driver.manage().window().setSize(new Dimension(1536, 1048));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() {
        driver.get("https://www.saucedemo.com/");
        
        // Login
        driver.findElement(By.cssSelector("[data-test='username']")).click();
        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).click();
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();

        // Wait for inventory items to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".inventory_item")));

        // Validate presence of elements
        List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
        assert items.size() > 0 : "No inventory items found";

        List<WebElement> itemNames = driver.findElements(By.cssSelector(".inventory_item_name"));
        assert itemNames.size() > 0 : "No item names found";

        List<WebElement> itemPrices = driver.findElements(By.cssSelector(".inventory_item_price"));
        assert itemPrices.size() > 0 : "No item prices found";

        List<WebElement> addButtons = driver.findElements(By.cssSelector(".btn_inventory"));
        assert addButtons.size() > 0 : "No add-to-cart buttons found";

        // Double-click on a specific item
        WebElement backpack = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']"));
        Actions builder = new Actions(driver);
        builder.doubleClick(backpack).perform();
    }
}
