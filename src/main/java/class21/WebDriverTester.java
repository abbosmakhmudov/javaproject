package class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver d:arr) {
            d.openBrowser();
            d.loadURL("amazon.com");
            d.performTesting();
            d.close();
        }
    }
}
