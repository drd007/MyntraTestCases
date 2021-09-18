import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestCaseProducts {


    @Test
    public void homeProducts() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        WebElement menelement=driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Actions actMen=new Actions(driver);
        actMen.moveToElement(menelement).perform();

        Thread.sleep(3000);

        WebElement womenelement=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));

        Actions actWomen=new Actions(driver);
        actMen.moveToElement(womenelement).perform();



        Thread.sleep(3000);

        WebElement kidselement=driver.findElement(By.cssSelector(".desktop-main[href='/shop/kids']"));

        Actions actKids=new Actions(driver);
        actMen.moveToElement(kidselement).perform();


        driver.close();


    }
}
