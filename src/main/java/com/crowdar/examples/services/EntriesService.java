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

        if (donde.equals("start del calendario")){
            MobileActionManager.click(EntriesConstants.START_TIME);
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
        if (donde.equals("end del calendario")){
            MobileActionManager.click(EntriesConstants.END_TIME);
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

    public static void agregarFecha(String date) {
        DateTimeFormatter date_now = DateTimeFormatter.ofPattern("dd MM yyyy");
        String[] fecha_actual = date_now.format(LocalDateTime.now()).split(" ");
        String[] fecha = date.split(" ");

        switch (fecha[1]){
            case "January": fecha[1] = "01";
            case "February": fecha[1] = "02";
            case "March": fecha[1] = "03";
            case "April": fecha[1] = "04";
            case "May": fecha[1] = "05";
            case "June": fecha[1] = "06";
            case "July": fecha[1] = "07";
            case "August": fecha[1] = "08";
            case "September": fecha[1] = "09";
            case "October": fecha[1] = "10";
            case "November": fecha[1] = "11";
            case "December": fecha[1] = "12";
            /*
            case 2: fecha[1] = "February";
            case 3: fecha[1] = "March";
            case 4: fecha[1] = "April";
            case 5: fecha[1] = "May";
            case 6: fecha[1] = "June";
            case 7: fecha[1] = "July";
            case 8: fecha[1] = "August";
            case 9: fecha[1] = "September";
            case 10: fecha[1] = "October";
            case 11: fecha[1] = "November";
            case 12: fecha[1] = "December";
             */
        }
        while (MobileActionManager.isVisible(EntriesConstants.DAY_ENTRY, date)){
            if (Integer.parseInt(fecha[2]) > Integer.parseInt(fecha_actual[2])){
                MobileActionManager.click(EntriesConstants.NEXT_MONTH_ENTRY);
            }
            if (Integer.parseInt(fecha[2]) < Integer.parseInt(fecha_actual[2])){
                MobileActionManager.click(EntriesConstants.PREVIOUS_MONTH_ENTRY);
            }
            if (Integer.parseInt(fecha[1]) > Integer.parseInt(fecha_actual[1])){
                MobileActionManager.click(EntriesConstants.PREVIOUS_MONTH_ENTRY);
            }
            if (Integer.parseInt(fecha[1]) < Integer.parseInt(fecha_actual[1])){
                MobileActionManager.click(EntriesConstants.NEXT_MONTH_ENTRY);
            }
        }
        MobileActionManager.click(EntriesConstants.DAY_ENTRY, fecha[0]+fecha[1]+fecha[2]);
    }
}