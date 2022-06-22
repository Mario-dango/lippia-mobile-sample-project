package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("Tener instalado la aplicación en el dispositivo")
    public void isHomeLoginPageVisible() {
        LoginService.pantallaDeInicioCargada("Login headline");
    }
    @Given("Abrir la aplicación en el dispositivo")
    public void isHomePageVisible() {
        LoginService.isViewLoaded();
    }

    @When ("^El usuario ingrese con sus credenciales: '(.*)', '(.*)'$")
    public void toDoLogin(String correo, String contrasena) {
        LoginService.doLogin(correo, contrasena);
    }

    @Then("Se muestra el dashboard correspondiente a la cuenta")
    public void isDashBoardVisible() {
        LoginService.pantallaDeInicioCargada("Add time entry");
    }

}
