package Controllers;

import Vista.UIADMIN;

public class ControllerAdmin {
    private final UIADMIN adminVista;

    public ControllerAdmin(Vista.UIADMIN adminVista) {
        this.adminVista = adminVista;
        this.adminVista.setVisible(true);
    }
}
