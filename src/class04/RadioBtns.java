package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnabled = maleBtn.isEnabled();
        System.out.println("the radio button male is enabled " + isEnabled);
        boolean isDisplayed = maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed " + isDisplayed);
        boolean isSelected = maleBtn.isSelected();
        System.out.println("the radio button male is selected " + isSelected);

        if (!isSelected) {
            maleBtn.click();
        }

        isSelected = maleBtn.isSelected();
        System.out.println("the radio button male is selected " + isSelected);


    }
}
