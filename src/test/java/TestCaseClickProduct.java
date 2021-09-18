import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseClickProduct {


    @Test
    public void productClick() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        WebElement menelement=driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Actions actMen=new Actions(driver);
        actMen.moveToElement(menelement).perform();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".desktop-categoryLink[href='/men-sweatshirts']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement womelement=driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        WebElement womenelement=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));

        Actions actWomen=new Actions(driver);
        actMen.moveToElement(womenelement).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/women-jeans']")).click();
        Thread.sleep(2000);

        driver.close();




    }
}
