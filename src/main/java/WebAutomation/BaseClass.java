package WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.opencart.com/");

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Your Store")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        driver.close();


    }

}
