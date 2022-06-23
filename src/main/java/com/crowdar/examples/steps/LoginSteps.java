package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class LoginSteps extends PageSteps {

    @Given("Tener instalado la aplicación en el dispositivo")
    public void isHomeLoginPageVisible() {
        LoginService.pantallaDeInicioCargada();
    }
    @Given("Abrir la aplicación en el dispositivo")
    public void verificaEstarEnPaginaInicio() {
        LoginService.pantallaDeInicioCargada();
    }

    @When ("^El usuario ingresa con correo registrado '(.*)'$")
    public void toPutEmail(String correo) {
        LoginService.putCorreo(correo);
    }

    @And ("^El usuario ingresa la clave asociada a la cuenta '(.*)'$")
    public void toPutPassword(String password) {
        LoginService.putClave(password);
    }
    @And ("^El usuario hace click en el boto de '(.*)'$")
    public void toClickLoginButton(String label) {
        LoginService.clickOn(label);
    }

    @Then("Se muestra el dashboard correspondiente a la cuenta")
    public void isDashBoardVisible() {
        LoginService.seVisualizaEtiqueta("Add time entry");
    }

    @Then("^Se visualiza el menu '(.*)'$")
    public void seVisualizaEtiqueta(String label) {
        LoginService.seVisualizaEtiqueta(label);
    }

}
