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
        this.vista.tutosBTN.addActionListener(new TutorialesListener());
        this.vista.adminInfoBTN.addActionListener(new AdminInfoListener());
        this.vista.adminUsuarioBTN.addActionListener(new AdminUsuariosListener());
        
        this.vista.setVisible(true);
    }

    

    private class TutorialesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           vista.setVisible(false);
           new ControllerTutoriales(new UITUTORIALES(),vista);  
        }
    }

    private class AdminInfoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          // new ControllerAdminInfo(new UIADMININFORMACION());
        }
    }

    private class AdminUsuariosListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            new ControllerAdminUsers(new UIADMINUSUARIOS());
        }
    }
}
