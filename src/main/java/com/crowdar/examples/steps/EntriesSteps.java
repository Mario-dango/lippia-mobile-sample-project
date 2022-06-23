package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.EntriesService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class EntriesSteps extends PageSteps {
    @And("El usuario hace click en el boton de agregado de entidad")
    public void elUsuarioAgregaEntrada(){
        EntriesService.agregarEntrada();
    }

    @And("^El usuario agrega las (.*) horas desde la vista (.*)$")
    public void elUsuarioAgregaHora(Integer hours, String lugar){
        EntriesService.agregarHora(hours, lugar);
    }

    @And("^El usuario agrega los (.*) minutos desde la vista (.*)$")
    public void elUsuarioAgregaMinutos(Integer minutes, String lugar){
        EntriesService.agregarMinutos(minutes, lugar);
    }

    @And("El usuario presiona el botón para guardar")
    public void guardarLosDatosDeEntrada(){
        EntriesService.guardarEntrada();
    }

    @Then("El usuario vuelve al dashboard visualizando la nueva entrada")
    public void confirmarGuardadoDeEntrada(){
        EntriesService.confGuardadoEntrada();
    }

    @And("El usuario presiona el botón para descartar los cambios")
    public void descartaLosDatosDeEntrada(){
        EntriesService.descartarEntrada();
    }

    @Then("El usuario presiona el botón de confirmación para descartar los cambios")
    public void confirmarDescarteDeEntrada(){
        EntriesService.confDescarteEntrada();
    }

    @And("El usuario hace click en donde está la fecha abreviada")
    public void agregadoDeFechaEntrada(){
        EntriesService.clickEnDondeEstaLaFecha();
    }

    @And("^El usuario agrega las (.*) horas desde el (.*)$")
    public void elUsuarioAgregaHoraCalendario(Integer hours, String lugar){
        EntriesService.agregarHora(hours, lugar);
    }

    @And("^El usuario agrega los (.*) minutos desde el (.*)$")
    public void elUsuarioAgregaMinutosCalendario(Integer hours, String lugar){
        EntriesService.agregarMinutos(hours, lugar);
    }

    @And("^El usuario agrega el (.*) año desde el calendario$")
    public void elUsuarioAgregaElAnioCalendario(Integer anio){
        EntriesService.agregarYear(anio);
    }

    @And("^El usuario agrega el (.*) mes desde el calendario$")
    public void elUsuarioAgregaElMesCalendario(Integer mes){
        EntriesService.agregarMes(mes);
    }

    @And("^El usuario agrega el (.*) día desde el calendario$")
    public void elUsuarioAgregaElDiaCalendario(Integer dia){
        EntriesService.agregarDay(dia);
    }
}
