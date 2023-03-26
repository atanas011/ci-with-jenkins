package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new EdgeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}