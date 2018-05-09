package testcursosalunos;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import testcursos.TesteCursosAux;

public class TesteCursosAlunos {
        
    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mateus G\\Desktop\\geckodriver.exe");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
    }
    
    @Test
    public void testLoginCorrectTeacher()
    {
        TesteCursosAlunosAux pag = PageFactory.initElements(driver, TesteCursosAlunosAux.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "Pass12345");
        pag.acessaLoginModal();
        // >>> Adiciona aluno, caso ele não esteja no curso <<< pag.adicionarAluno();
        // >>> Não deverá adicionar alunos, adicionar aluno não cadastrado <<< pag.adicionarAlunoNaoCadastrado();
        // >>> Não deverá adicionar aluno, pois já está na turma <<< pag.adicionarAlunoTurmaExistente();
        // >>> Adiciona aluno em grupo, dois alunos não existentes. Caso exista um ou os dois não existam, 
        // ele adicionará somente o que não existe ou nenhum <<< pag.adicionarAlunoMultiplo();
        // >>> Não deverá ser possível adicionar os alunos nos casos a seguir 
        // pag.adicionarAlunoVazio();
        // pag.adicionarAlunoComEmailIncorreto();
        // pag.adicionarAlunoSemEmail();
    }
}
