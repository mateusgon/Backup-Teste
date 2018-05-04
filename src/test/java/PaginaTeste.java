
import testlogin.myFirstTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class PaginaTeste {

    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "/ice/Downloads/geckodriver");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
    }

    @Test
    public void test()
    {
        myFirstTest pag = PageFactory.initElements(driver, myFirstTest.class);
        
        pag.loga();
        pag.preencheDados("student1@gmail.com", "pass");
        pag.acessaLoginModal();
        //WebElement ddd;
        //assertNotNull(ddd);
    }
}
