import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myFirstTest {
    @FindBy(id="firstName")
    private WebElement nome;

    @FindBy(id="lastName")
    private WebElement sobrenome;

    @FindBy(id="accountDetailsNext")
    private WebElement botao;

    private WebDriver driver;

    public myFirstTest(WebDriver driver)
    {
        this.driver = driver;
    }

    public myFirstTest preencheDados(String nome, String sobrenome)
    {
        this.nome.sendKeys(nome);
        this.sobrenome.sendKeys(sobrenome);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void loga()
    {
        botao.click();
    }
}
