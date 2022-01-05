package com.indra.steps_definitions;


import com.indra.actions.DateActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class DateSteps {
    @Managed
    WebDriver driver;
    DateActions dateActions = new DateActions(driver);

    @Given("^el usuario selecciona un mes y dia del anio por defecto$")
    public void elUsuarioSeleccionaUnMesYDiaDelAnioPorDefecto() {
        dateActions.open();
        dateActions.openCalendar();
    }

    @When("^el usuario selecciona un mes y dia aleatorio$")
    public void elUsuarioSeleccionaUnMesYDiaAleatorio() {
    }

    @Then("^el sisteme deberia mostrar el calendario correctamente$")
    public void elSistemeDeberiaMostrarElCalendarioCorrectamente() {
    }
}
