package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public OneToolPage LoginTo1Tool() {
        return new OneToolPage(driver);
    }


}
