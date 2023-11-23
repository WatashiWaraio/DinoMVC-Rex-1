package Controllers;

import Vista.UILOGIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ModeloDAO.ArchivoHashMap;
import ModeloDTO.Usuario;

public class ControllerLogin implements ActionListener{
    
    private UILOGIN VistaLogin;
    private Usuario usuario;

    public ControllerLogin(UILOGIN VistaLogin) {
        this.VistaLogin = VistaLogin;
        this.VistaLogin.loginbtn.addActionListener((ActionListener)this);

        this.VistaLogin.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VistaLogin.loginbtn) {
            
            String identificacion = VistaLogin.UsuarioField.getText();
            char[] Contrasena = VistaLogin.contraseñaField.getPassword();
            
            
            
            
        }
        
    }
    
    
    
}
