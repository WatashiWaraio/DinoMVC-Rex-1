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
        // TODO code application logic here
        new ControllerAdminUsers(new UIADMINUSUARIOS());
       //new ControllerLogin(new UILOGIN());
       // new ControllerUser(new UIUSER());
        //new ControllerAdmin(new UIADMIN());
        //new ControllerTutoriales(new UITUTORIALES());  
        
    }
    
}