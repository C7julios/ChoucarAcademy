package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.UtestData;
import co.com.choucair.certificacion.proyectobase.questions.RespuestaRegistroUtest;
import co.com.choucair.certificacion.proyectobase.tasks.AbrirPagina;
import co.com.choucair.certificacion.proyectobase.tasks.RegistroUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que brandon quiere registrarse en la pagina de Utest$")
    public void queBrandonQuiereRegistrarseEnLaPaginaDeUtest() throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(AbrirPagina.thePage());
    }

    @When("^el ingresa los datos en el formulario de Utest$")
    public void elIngresaLosDatosEnElFormularioDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUtest.onThePage(
                utestData.get(0).getStrPrimerNombre(),
                utestData.get(0).getStrApellido(),
                utestData.get(0).getStrCorreo(),
                utestData.get(0).getStrMesNacimiento(),
                utestData.get(0).getStrDiaNacimiento(),
                utestData.get(0).getStrAnoNacimiento(),
                utestData.get(0).getStrContrasena()));

    }
    @Then("^el mensaje de registro exitoso aparece en pantalla$")
    public void elMensajeDeRegistroExitosoApareceEnPantalla(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RespuestaRegistroUtest.toThe(utestData.get(0).getStrMensaje())));
    }
}

