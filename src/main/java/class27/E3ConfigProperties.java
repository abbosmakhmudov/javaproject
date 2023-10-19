package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public static void main(String[] args) throws IOException {
        String url=getProperty("URL");
        String userName=getProperty("userName");
        String password=getProperty("password");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement usernameField=driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys(userName);

        WebElement passwordField=driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);
        
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        driver.quit();

    }
    public static String getProperty(String propKey) throws IOException {
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        //return the value of the propety that we provide in the parameter
        String value=prop.getProperty(propKey);
        return value;
    }
}
