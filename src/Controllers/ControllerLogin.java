package Controllers;

import ModeloDAO.Persistente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ModeloDTO.Usuario;
import Vista.UILOGIN;

public class ControllerLogin {
    
    private final UILOGIN login;
    private final Persistente user_dao;
    private Usuario funciones;

    public ControllerLogin(UILOGIN login, Persistente user_dao) {
        this.login = login;
        this.user_dao = user_dao;
        this.login.loginbtn.addActionListener((ActionListener) this);
        this.login.setVisible(true);
    }
    
    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent  e){
        if(e.getSource() == login.loginbtn){
    
        }
        
        
    }
    
    
    
}
