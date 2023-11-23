package Controllers;

import Vista.UIUSER;

public class ControllerUser {
    private final UIUSER userVista;

    public ControllerUser(Vista.UIUSER userVista) {
        this.userVista = userVista;
        this.userVista.setVisible(true);
    }
}
