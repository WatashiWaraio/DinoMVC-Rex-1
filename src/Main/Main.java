package Main;

import Controllers.ControllerLogin;
import Controllers.ControllerAdminUsers;
import Controllers.ControllerUser;
import Vista.UIADMINUSUARIOS;
import Vista.UILOGIN;
import Vista.UIUSER;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // new ControllerAdminUsers(new UIADMINUSUARIOS());
       new ControllerLogin(new UILOGIN());
       // new ControllerUser(new UIUSER());
        
    }
    
}