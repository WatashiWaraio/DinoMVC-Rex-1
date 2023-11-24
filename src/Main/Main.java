package Main;

import Controllers.ControllerAdmin;
import Controllers.ControllerLogin;
import Controllers.ControllerAdminUsers;
import Controllers.ControllerTutoriales;
import Controllers.ControllerUser;
import Vista.UIADMIN;
import Vista.UIADMINUSUARIOS;
import Vista.UILOGIN;
import Vista.UITUTORIALES;
import Vista.UIUSER;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ControllerLogin(new UILOGIN());
    }
    
}