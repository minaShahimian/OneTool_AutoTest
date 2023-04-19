package base;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {


    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

         driver = new ChromeDriver();

        // DDEMO 1TOOL URL:        driver.get("https://my.1tool.com/welcome/logout");

        // DEVELKUNDENMEISTER URL:
        driver.get("https://devel.kundenmeister.com/");


        homePage = new HomePage(driver);
        driver.manage().window().fullscreen();
    }

    @AfterClass
    public void tearDown() {


    }

 /*
    public static void main (String args[]){
       BaseTests tests=new BaseTests();
    tests.setUp();}
 */


}

