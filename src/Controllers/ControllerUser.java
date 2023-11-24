
package Controllers;

import Vista.UIUSER;
import Vista.UITUTORIALES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerUser {

    private UIUSER vista;

    public ControllerUser(UIUSER vista) {
        this.vista = vista;
        this.vista.iniciobtn.addActionListener(new InicioListener());
        this.vista.tutosBTN.addActionListener(new TutorialesListener());
        this.vista.setVisible(true);
    }

    private class InicioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UIUSER inicio = new UIUSER();
            inicio.setVisible(true);
        }
    }

    private class TutorialesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UITUTORIALES tutoriales = new UITUTORIALES();
            tutoriales.setVisible(true);
        }
    }
}
