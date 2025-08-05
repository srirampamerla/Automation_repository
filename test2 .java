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
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        driver.manage().window().setSize(new Dimension(1936, 1048));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.cssSelector("[data-test='username']")).click();
        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).click();
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();

        // Wait for inventory items
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".inventory_item")));

        // Validate inventory elements
        assert driver.findElements(By.cssSelector(".inventory_item")).size() > 0;
        assert driver.findElements(By.cssSelector(".inventory_item_name")).size() > 0;
        assert driver.findElements(By.cssSelector(".inventory_item_price")).size() > 0;
        assert driver.findElements(By.cssSelector(".btn_inventory")).size() > 0;

        // Double-click on backpack item
        WebElement backpack = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']"));
        new Actions(driver).doubleClick(backpack).perform();

        // Add first two items to cart
        driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_primary")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .btn_primary")).click();

        // Proceed to checkout
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        driver.findElement(By.linkText("CHECKOUT")).click();
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
    }
}
