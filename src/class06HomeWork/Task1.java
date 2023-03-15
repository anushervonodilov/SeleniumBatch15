package class06HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//button[text()=\"Start\"]"));
        startButton.click();
        WebElement finishButton = driver.findElement(By.xpath("//div[@id='finish']//h4"));
        finishButton.click();

        if (finishButton.getText().equalsIgnoreCase("Hello World!")) {
            System.out.println(finishButton.getText() + " Is being displayed");
        } else {
            System.out.println(finishButton.getText() + " Is being not displayed");
        }

    }
}
