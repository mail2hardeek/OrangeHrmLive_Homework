package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser { // Class
    static String browser = "Edge";

    static WebDriver driv;

    static String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";  // creating string variable to store the website link

    public static void main(String[] args) { //Main method
        if (browser.equalsIgnoreCase("Chrome")) { // Conditions applied for which browser to open
            driv = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")) { // Conditions applied for which browser to open
            driv = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) { // Conditions applied for which browser to open
            driv = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Safari")) { // Conditions applied for which browser to open

        } else {
            System.out.println("Browser not found"); //Print the statement if browser not found
        }
        driv.get(Url); //Calling the url
        driv.manage().window().fullscreen(); // full screen to be open
        System.out.println("Tittle : " + driv.getTitle()); ////Print tittle
        System.out.println("Current URL : " + driv.getCurrentUrl()); //Print Current URL
        System.out.println("Page Source : " + driv.getPageSource()); //Print Page Source
        WebElement username = driv.findElement(By.name("username")); // Email address request by using element
        username.sendKeys("Admin"); //to send the command to print the email address in the email address field
        WebElement password = driv.findElement(By.name("password")); // Password request by using element
        password.sendKeys("Admin123"); //to send the command to print the email address in the email address field
        driv.close(); //Close the Browser
    }


}
