package Login;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i500636\\Downloads\\Drivers\\chromedriver\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://goo.gl/RVdKM9");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title of the page " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URL of the page " + url);

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Roshni");

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Thakre");

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("123456789");

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Bangalore");

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("Thakre.123@gmail.com");


        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));

        System.out.println("size of options in dropdown " + dropdown.getOptions().size());             // Number of options in dropdown

        List<WebElement> options = dropdown.getOptions();

        for (WebElement e : options) {
            System.out.print(e.getText());
        }

        dropdown.selectByIndex(2);

        WebElement radmale = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));


        System.out.println(radmale.isDisplayed());
        System.out.println(radmale.isEnabled());
        System.out.println(radmale.isSelected());

        radmale.click();

        System.out.println(radmale.isSelected());


        driver.findElement(By.xpath("//label[contains(text(),'Sunday')]")).click();

        driver.findElement(By.xpath("//label[contains(text(),'Saturday')]")).click();

        driver.findElement(By.linkText("Software Testing Tutorials")).click();

        Thread.sleep(3000);

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Software Testing Tool")).click();

        Thread.sleep(3000);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();


        driver.quit();                      // close all open window

        // driver. close();                   // close current open window


    }
}