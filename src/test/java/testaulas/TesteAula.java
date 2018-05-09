package testaulas;

import testlogin.myFirstTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TesteAula {

    static WebDriver driver;
   // static WebDriver driver2;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mateus G\\Desktop\\geckodriver.exe");
        driver = (WebDriver) new FirefoxDriver();
        //driver2 = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
        //driver2.get("https://atlantis.isti.cnr.it:5000/courses");
    }
    


    /*@Test
    public void testLoginCorrectStudent()
    {
        TesteAulaAux pag = PageFactory.initElements(driver, TesteAulaAux.class);
        
        pag.loga();
        pag.preencheDados("student1@gmail.com", "pass");
        pag.acessaLoginModal();

        //WebElement ddd;
        //assertNotNull(ddd);
    }*/
    
    @Test
    public void testLoginCorrectTeacher()
    {
        TesteAulaAux pag = PageFactory.initElements(driver, TesteAulaAux.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "Pass12345");
        pag.acessaLoginModal();
        pag.acessaCurso();

        //assertNotNull(ddd);
    }
}