package class08HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

        for (int i = 0; i < columns.size(); i++) {
            String text = columns.get(i).getText();
            if (text.equalsIgnoreCase("52121A")) {
                System.out.println(text);
                System.out.println("The id is located at the row number " + (i + 1));

                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();

            }
        }


    }
}
