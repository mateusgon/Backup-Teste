
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class PaginaTeste {

    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "/ice/Downloads/geckodriver");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
    }

    @Test
    public void test()
    {
        myFirstTest pag = PageFactory.initElements(driver, myFirstTest.class);
        pag.preencheDados("Cassioooooo", "Coringao");
        pag.loga();
        //WebElement ddd;
        //assertNotNull(ddd);
    }
}
