package testcursosalunos;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcursos.TesteCursosAux;

public class TesteCursosAlunosAux {
    
    @FindBy(id = "input-attender-multiple")
    private WebElement textoAlunos;
    
    @FindBy(id =  "input-attender-separator")
    private WebElement textoSeparador;
    
    @FindBy(id = "put-modal-btn")
    private WebElement botaoConfirmaAluno;
    
    @FindBy(id = "input-attender-simple")
    private WebElement emailAluno;
    
    @FindBy(id = "add-attenders-icon")
    private WebElement adicionarAluno;
    
    @FindBy(id = "md-tab-label-0-4")
    private WebElement abaEdicao;
    
    @FindBy(id = "md-tab-label-1-1")
    private WebElement abaMultiplo;
    
    @FindBy(css ="div[class='col l6 m7 s7 valign course-title']")
    List<WebElement> listCourses;
    
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
    
    public TesteCursosAlunosAux(WebDriver driver) {
        this.driver = driver;
    }

    public TesteCursosAlunosAux preencheDados(String nome, String sobrenome) {
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
    
    public void adicionarAluno()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("student2@gmail.com");
        botaoConfirmaAluno.click();
    } 
        public void adicionarAlunoNaoCadastrado()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("teste1111@teste.com");
        botaoConfirmaAluno.click();
    }  
        
    public void adicionarAlunoTurmaExistente()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("student1@gmail.com");
        botaoConfirmaAluno.click();
    }
    
    public void adicionarAlunoMultiplo()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        abaMultiplo.click();
        textoSeparador.sendKeys(",");
        textoAlunos.sendKeys("student1@gmail.com,student2@gmail.com");
        botaoConfirmaAluno.click();    
    }
    
    public void adicionarAlunoVazio()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("");
        botaoConfirmaAluno.click();
    }
        public void adicionarAlunoComEmailIncorreto()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("teste@teste");
        botaoConfirmaAluno.click();
    }
    
        public void adicionarAlunoSemEmail()
    {
        driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();
        driver3 = (WebDriver) new FirefoxDriver();
        driver3.close();
        abaEdicao.click();
        adicionarAluno.click();
        emailAluno.sendKeys("teste");
        botaoConfirmaAluno.click();
    }
}
