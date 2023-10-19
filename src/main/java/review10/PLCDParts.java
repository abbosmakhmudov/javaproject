package review10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PLCDParts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver p=new ChromeDriver();

        p.get("https://www.phonelcdparts.com/customer/account/login/");
        p.manage().window().maximize();
        WebElement email = p.findElement(By.id("email"));
        Thread.sleep(2000);
        email.sendKeys("seyco5515@gmail.com");
        Thread.sleep(2000);
        WebElement password = p.findElement(By.id("pass"));
        password.sendKeys("Seyfi555");
        Thread.sleep(2000);
        WebElement loginBtn=p.findElement(By.name("send"));
        loginBtn.click();
        p.get("https://www.phonelcdparts.com/iphone-11-lcd-assembly-with-plate-incell-qv7");
        WebElement add11=p.findElement(By.id("product-addtocart-button"));
        add11.click();
        add11.click();
        add11.click();






    }
}
