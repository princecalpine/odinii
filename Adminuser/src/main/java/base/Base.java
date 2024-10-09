package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\admin\\eclipse-workspace\\Adminpanel\\src\\main\\java\\base\\config.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

            // Enable headless mode for Chrome
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Headless mode
            options.addArguments("--disable-gpu"); // Disables GPU acceleration
            options.addArguments("--window-size=1920,1080"); // Optional: set screen size
            driver = new ChromeDriver(options);

        } else if (browserName.equals("firefox")) {
            // Enable headless mode for Firefox
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless"); // Headless mode
            driver = new FirefoxDriver(options);

        } else if (browserName.equals("IE")) {
            // IE code
        }
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
    }
}
