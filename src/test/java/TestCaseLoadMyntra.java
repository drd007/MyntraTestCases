import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCaseLoadMyntra {

 
        @Test
                public void loadMyntra()
    {

            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.myntra.com/");
            System.out.println(driver.getTitle());
        driver.close();

        }






    }

