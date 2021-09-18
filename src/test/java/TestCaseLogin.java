import com.sun.xml.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseLogin {

    @Test
    public void loginUser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");

        //need to write code for mouse hover to point to sign in

        WebElement signele=driver.findElement(By.cssSelector(".myntraweb-sprite.desktop-iconUser.sprites-headerUser"));

        Actions actsign=new Actions(driver);
        actsign.moveToElement(signele).perform();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".desktop-linkButton")).click();

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7892758014");
        driver.findElement(By.cssSelector(".submitBottomOption")).click();
       Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Password']")).click();
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test@123");
        driver.findElement(By.cssSelector("button:nth-child(1)")).click();
    }
}
