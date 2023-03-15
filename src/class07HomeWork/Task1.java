package class07HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
//        System.out.println(table.getText());

        List<WebElement> names = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]"));

        for (WebElement name : names) {
            System.out.println(name.getText());
        }

    }
}
