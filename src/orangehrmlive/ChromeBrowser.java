package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser { // class
    public static void main(String[] args) { //main method declared
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; // creating string variable to store the website link
        WebDriver driver = new ChromeDriver(); //responsible to open the Chrome browser
        driver.get(url);
        System.out.println("Tittle: " + driver.getTitle()); //Print tittle
        System.out.println("Current URL : " + driver.getCurrentUrl()); //Print Current URL
        System.out.println("Page Source : " + driver.getPageSource()); //Print Page Source

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.name("username")); //declared variable for email
        username.sendKeys("Admin");//to send the command to print the email address in the email address field
        WebElement password = driver.findElement(By.name("password")); // declared variable for password
        password.sendKeys("admin123"); //to send the command to print the password in the password field
       driver.close(); //Close the Browser

    }
}
