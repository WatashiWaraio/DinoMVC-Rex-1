package Controllers;

import Vista.UIADMIN;
import Vista.UIADMININFORMACION;
import Vista.UIADMINUSUARIOS;
import Vista.UITUTORIALES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAdmin {

    private final UIADMIN vista;

    public ControllerAdmin(UIADMIN vista) {
        this.vista = vista;
        this.vista.iniciobtn.addActionListener(new InicioListener());
        this.vista.tutosBTN.addActionListener(new TutorialesListener());
        this.vista.adminInfoBTN.addActionListener(new AdminInfoListener());
        this.vista.adminUsuarioBTN.addActionListener(new AdminUsuariosListener());
        
        this.vista.setVisible(true);
    }

    private class InicioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UIADMIN inicio = new UIADMIN();
            inicio.setVisible(true);
            vista.setVisible(false);
        }
    }

    private class TutorialesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UITUTORIALES tutoriales = new UITUTORIALES();
            tutoriales.setVisible(true);
            vista.setVisible(false);
        }
    }

    private class AdminInfoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UIADMININFORMACION adminInfo = new UIADMININFORMACION();
            adminInfo.setVisible(true);
            vista.setVisible(false);
        }
    }

    private class AdminUsuariosListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            UIADMINUSUARIOS adminUsuarios = new UIADMINUSUARIOS();
            adminUsuarios.setVisible(true);
            vista.setVisible(false);
        }
    }
}
