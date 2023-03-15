package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String tableDate = table.getText();
//        System.out.println(tableDate);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row : rows) {
            String rowText = row.getText();
            if (rowText.contains("Google")) {
//                System.out.println(rowText);
            }
        }

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

        for (WebElement column : columns) {
//            System.out.println(column.getText());
        }

        List<WebElement> firstColumns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));

        for (WebElement firstColumn : firstColumns) {
            System.out.println(firstColumn.getText());
        }



    }
}
