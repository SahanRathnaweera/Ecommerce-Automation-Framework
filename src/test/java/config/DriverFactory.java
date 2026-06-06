package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else{
            throw new RuntimeException("Browser not supported");

        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            // 1. Chrome Options object එකක් සාදා ගැනීම
            ChromeOptions options = new ChromeOptions();

            // 2. බ්‍රවුසර් එකේ Pop-ups සහ Notifications සම්පූර්ණයෙන්ම බ්ලොක් කිරීම
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-ads"); // Google ads සහ වෙනත් බිල්ට්-ඉන් ඇඩ්ස් බ්ලොක් කිරීමට

            // 3. Chrome එකේ Content Settings වෙනස් කර Ads එන එක තවත් සීමා කිරීම
            Map<String, Object> prefs = new HashMap<String, Object>();
            // Popups බ්ලොක් කිරීම (2 කියන්නේ Block)
            prefs.put("profile.default_content_setting_values.popups", 2);
            // Notifications බ්ලොක් කිරීම
            prefs.put("profile.default_content_setting_values.notifications", 2);

            options.setExperimentalOption("prefs", prefs);

            // 4. මෙම ඔප්ෂන්ස් සමඟ බ්‍රවුසර් එක ස්ටාර්ට් කිරීම
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void  quitDriver () {
        if (driver!=null) {
            driver.quit();
            driver=null;
        }


    }

}
