package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-452555590%3A1678243142407627&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHf8F80ivArmroKxjAlDsBcmReEXHacdEIc-tngu0TuqAyIJ-GgWVkQXuID0JvJmx_Lui3LhOA");

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            driver.switchTo().window(window);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")) {
                break;
            }
        }
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);

    }
}
