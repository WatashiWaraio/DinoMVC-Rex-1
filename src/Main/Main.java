package Main;

import Controllers.ControllerLogin;
import Controllers.ControllerAdminUsers;
import Vista.UIADMINUSUARIOS;
import Vista.UILOGIN;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new controladorAdminUsuarios(new adminUsuariosVista());
        new ControllerLogin(new UILOGIN());

    }
    
}
