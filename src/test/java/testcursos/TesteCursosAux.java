package testcursos;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testaulas.TesteAulaAux;

public class TesteCursosAux {
    
    @FindBy(id = "send-info-btn")
    private WebElement BotaoAdicionarAlterarInfo;
    
    @FindBy(className = "ql-editor")
    private WebElement nomeClasse;
    
    @FindBy(id = "md-tab-label-0-0")
    private WebElement abaEdicao;
    
    @FindBy(css ="div[class='col l6 m7 s7 valign course-title']")
    List<WebElement> listCourses;
    
    @FindBy (id = "edit-course-info")
    private WebElement editInfCurso;
    
    @FindBy (id = "input-post-course-name")
    private WebElement nomeCurso;
    
    @FindBy (id = "add-course-icon")
    private WebElement botaoCurso;
    
    @FindBy (id = "submit-post-course-btn")
    private WebElement confirmaCurso;
    
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "signUpButton")
    private WebElement botao;

    @FindBy(id = "log-in-btn")
    WebElement botaoLogin;

    private WebDriver driver;
    private WebDriver driver2;
    private WebDriver driver3;
    
    public TesteCursosAux(WebDriver driver) {
        this.driver = driver;
    }

    public TesteCursosAux preencheDados(String nome, String sobrenome) {
        this.email.sendKeys(nome);
        this.password.sendKeys(sobrenome);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void loga() {
        driver.findElement(By.linkText("Log in")).click();
    }

    public void acessaLoginModal() {
        botaoLogin.click();
    }
    
    public void criaCurso()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        botaoCurso.click();
        nomeCurso.sendKeys("Teste Automatizado 1");
        confirmaCurso.click();
    }
    
    public void criarCursoNomesIguais()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        botaoCurso.click();
        nomeCurso.sendKeys("Teste Automatizado 1");
        confirmaCurso.click();
        botaoCurso.click();
        nomeCurso.sendKeys("Teste Automatizado 1");
        confirmaCurso.click();
    }
    
    public void criarCursoInvalidoSemTexto()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        botaoCurso.click();
        nomeCurso.sendKeys("");
        confirmaCurso.click();
    }
    
    public void criarCursoInvalidoSomenteNumeros()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        botaoCurso.click();
        nomeCurso.sendKeys("1111111");
        confirmaCurso.click();
    }
    
    public void criarCursoInvalidoSomenteAcento()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        botaoCurso.click();
        nomeCurso.sendKeys("´´~~");
        confirmaCurso.click();
    }
    
    public void adicionarInformacaoCurso()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        editInfCurso.click();
        nomeClasse.sendKeys("Esta é uma inclusao");
        BotaoAdicionarAlterarInfo.click(); 
    }
    
    public void editarInformacaoCurso()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        editInfCurso.click();
        nomeClasse.sendKeys("Esta é uma alteração");
        BotaoAdicionarAlterarInfo.click();
    }
}
