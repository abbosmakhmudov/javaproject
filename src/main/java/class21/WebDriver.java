package class21;

public abstract class WebDriver {

    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void close();
}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Openning the Google Chrome Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL "+url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on Chrome");

    }

    @Override
    void close() {
        System.out.println("Closing browser");
    }
}
class FirefoxDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Openning the Firefox Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL "+url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on Firefox");
    }

    @Override
    void close() {
        System.out.println("Closing browser");
    }
}
