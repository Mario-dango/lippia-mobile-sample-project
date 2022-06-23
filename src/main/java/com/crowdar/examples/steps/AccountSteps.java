package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.AccountService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class AccountSteps extends PageSteps {

    @And("El usuario hace click en el boton del menu lateral superior izquierdo")
    public void clickEnMenuHamburguesa(){
        AccountService.clickOnMenu();
    }

    @And("El usuario verifica que el menu despliege las opciones de la cuenta")
    public void verificaOpcionesDelMenu(){
        AccountService.isVisibleMenuOptions();
    }

    @And("El usuario clickea la opción de confirmar el cierre de su sesión")
    public void clickEnOpcionDelMenu(){
        AccountService.clickOnConfirmLogout();
    }

    @And("^El usuario clickea la opción (.*) del mismo menu$")
    public void clickEnOpcionDelMenu(String option){
        AccountService.clickOnOptionsMenu(option);
    }

    @And("El usuario verifica que esta desactivado el modo oscuro")
    public void verificaOpcionesDeModoOscuro(){
        AccountService.verificDarkModeOff();
    }

    @And("El usuario activa modo oscuro")
    public void activaModoOscuro(){
        AccountService.setDarkModeOn();
    }

    @Then("El usuario vuelve al dashboard visualizando en modo oscuro")
    public void vuelveAlDashboard(){
        AccountService.backToDashboard();
    }

    @Then("El usuario verifica que vuelve a la ventana para ingresar las credenciales de la cuenta para logearse")
    public void vuelveAlLogin(){
        LoginService.pantallaDeInicioCargada();
    }
}
