package com.sopitas.tests;

import com.sopitas.pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    public WebDriver driver;
    public HomePage home;
    public Properties props;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        home = new HomePage(driver);

    }
    @After
    public void after() {
        driver.quit();
    }
}
