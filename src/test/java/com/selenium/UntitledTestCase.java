package com.selenium;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UntitledTestCase {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.trivago.com/");
        driver.findElement(By.id("horus-querytext")).click();
        driver.findElement(By.id("horus-querytext")).clear();
        driver.findElement(By.id("horus-querytext")).sendKeys("santa catarina");
        driver.findElement(By.xpath("//li[@id='suggestion-7914803']/div/span")).click();
        driver.findElement(By.xpath("//section[@id='js-fullscreen-hero']/div/form/div/div[2]/div/div[3]/button/span/span[2]/span")).click();
        driver.findElement(By.xpath("//section[@id='js-fullscreen-hero']/div/form/div[2]/div/div/ul/li/button/span/span/span[2]")).click();
        driver.findElement(By.xpath("//section[@id='js-fullscreen-hero']/div/form/div/div/div/div/div[2]/button")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
