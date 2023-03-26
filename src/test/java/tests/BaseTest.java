package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    String browser = System.getProperty("browser");

    @BeforeTest
    public void setUp() {
        if (browser != null && !browser.equals("")) {
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Invalid option - defaulting to Edge");
                browser = "Edge";
                driver = new EdgeDriver();
            }
        } else {
            browser = "Edge";
            driver = new EdgeDriver();
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}