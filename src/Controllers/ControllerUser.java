
package Controllers;

import Vista.UIADMINUSUARIOS;
import Vista.UIUSER;
import Vista.UITUTORIALES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerUser {

    private UIUSER vista;

    public ControllerUser(UIUSER vista) {
        this.vista = vista;
        this.vista.tutosBTN.addActionListener(new TutorialesListener());
        this.vista.setVisible(true);
    }

    
    private class TutorialesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           vista.setVisible(false);
           new ControllerTutoriales(new UITUTORIALES(),vista);  
             
        }
    }
}
