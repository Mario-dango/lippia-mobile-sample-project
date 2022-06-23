package com.crowdar.examples.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntriesConstants;
import org.testng.Assert;

public class EntriesService {

    public static void agregarEntrada() {
        MobileActionManager.click(EntriesConstants.BTN_FLOTANTE_ETNRY);
    }

    public static void agregarHora(Integer horas, String donde) {
        String etiqueta = "";
        if (donde.equals("actual")){
            if (horas < 12) {
                etiqueta = EntriesConstants.INPUT_PLUS_HORA_XPATH;
            }
            else {
                horas = 24 - horas;
                etiqueta = EntriesConstants.INPUT_MINUS_HORA_XPATH;
            }
        }
        if (donde.equals("calendario")){
            if (horas < 12) {
                etiqueta = EntriesConstants.INPUT_DATE_PLUS_HORA_XPATH;
            }
            else {
                horas = 24 - horas;
                etiqueta = EntriesConstants.INPUT_DATE_MINUS_HORA_XPATH;
            }
        }
        for (int i = 0; i < horas; i++) {
            MobileActionManager.click(etiqueta);
        }
    }

    public static void agregarMinutos(Integer minutos, String donde) {
        String etiqueta = "";
        if (donde.equals("actual")){
            if (minutos < 30) {
                etiqueta = EntriesConstants.INPUT_PLUS_MINUTOS_XPATH;
            }
            else {
                minutos = 60 - minutos;
                etiqueta = EntriesConstants.INPUT_MINUS_MINUTOS_XPATH;
            }
        }
        if (donde.equals("calendario")){
            if (minutos < 30) {
                etiqueta = EntriesConstants.INPUT_DATE_PLUS_MINUTOS_XPATH;
            }
            else {
                minutos = 60 - minutos;
                etiqueta = EntriesConstants.INPUT_DATE_MINUS_MINUTOS_XPATH;
            }
        }
        for (int i = 0; i < minutos; i++) {
            MobileActionManager.click(etiqueta);
        }
    }

    public static void guardarEntrada() {
        MobileActionManager.click(EntriesConstants.BTN_FLOTANTE_ETNRY);
    }

    public static void confGuardadoEntrada() {
        MobileActionManager.waitVisibility(EntriesConstants.TIME_ENTRIES_LABEL);
        Assert.assertTrue(MobileActionManager.isVisible(EntriesConstants.TIME_ENTRIES_LABEL));
    }

    public static void descartarEntrada() {
        MobileActionManager.click(EntriesConstants.BTN_DISCARD_ETNRY);
    }

    public static void confDescarteEntrada() {
        MobileActionManager.click(EntriesConstants.BTN_CONFIRM_DISCARD_ETNRY);
    }

    public static void clickEnDondeEstaLaFecha() {
        MobileActionManager.click(EntriesConstants.DATE_ID_ENTRY);
    }

    public static void confirmaNoAgregadoDeEntrada() {
        MobileActionManager.click(EntriesConstants.BTN_CONFIRM_DISCARD_ETNRY);
    }


    public static void agregarYear(Integer year) {
        DateTimeFormatter anio = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("yyyy-> "+anio.format(LocalDateTime.now()));
    }

    public static void agregarMes(Integer mes){
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
        System.out.println("MM-> "+month.format(LocalDateTime.now()));
    }

    public static void agregarDay(Integer dia){
        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
        System.out.println("DD-> "+day.format(LocalDateTime.now()));
    }

}
