import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculadoraStepdefs {
    Calculadora calculadora;
    int resultado;

    @Given("^Criar uma calculadora$")
    public void criarUmaCalculadora() {
        calculadora = new Calculadora();
    }

    @When("^escrever (\\d+) ([-+*/]) (\\d+)$")
    public void escrever(int arg0, char arg1, int arg2) {
        resultado = calculadora.calculo(arg0, arg2, arg1);
    }

    @Then("^devo receber um resultado (\\d+)$")
    public void devoReceberUmResultado(int arg0) {
        Assert.assertEquals(resultado, arg0);
    }
}
