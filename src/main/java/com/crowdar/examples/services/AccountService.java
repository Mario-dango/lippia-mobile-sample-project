package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AccountConstants;

public class AccountService {

    public static void clickOnMenu() {
        MobileActionManager.click(AccountConstants.BTN_MENU_ACCOUNT);
    }

    public static void isVisibleMenuOptions() {
        MobileActionManager.isVisible(AccountConstants.TIME_TRACKER_MENU_ACCOUNT);
    }

    public static void clickOnOptionsMenu(String option) {
        if (option.equals("Logout")) {
            MobileActionManager.click(AccountConstants.LOGOUT_MENU_ACCOUNT);
        }
        if (option.equals("Settings")) {
            MobileActionManager.click(AccountConstants.SETTINGS_MENU_ACCOUNT);
        }
    }

    public static void verificDarkModeOff() {
        String darkModeStatus = MobileActionManager.getText(AccountConstants.DARK_MODE_SLIDE);
        if (darkModeStatus.equals("OFF")){
            System.out.println("Se encuentra desactivado el modo Oscuro");
        }
        if (darkModeStatus.equals("ON")){
            System.out.println("Se encuentra activado el modo Oscuro");
            MobileActionManager.click(AccountConstants.DARK_MODE_SLIDE);
        }
    }

    public static void clickOnConfirmLogout(){
        MobileActionManager.click(AccountConstants.BTN_CONFIRMATION_LOGOUT);
    }

    public static void setDarkModeOn() {
        MobileActionManager.click(AccountConstants.DARK_MODE_SLIDE);
    }

    public static void backToDashboard() {
        MobileActionManager.click(AccountConstants.TIME_TRACKER_MENU_ACCOUNT);
    }
}
