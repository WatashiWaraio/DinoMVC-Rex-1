package Controllers;


import ModeloDAO.Persistente;
import Vista.UILOGIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ModeloDAO.ArchivoHashMap;
import ModeloDTO.Usuario;
import Vista.UIADMIN;
import Vista.UIUSER;
import java.util.Objects;

public class ControllerLogin implements ActionListener{
    
    private final UILOGIN VistaLogin;
    
    public  ControllerLogin(UILOGIN VistaLogin) {
        this.VistaLogin = VistaLogin;
        this.VistaLogin.loginbtn.addActionListener((ActionListener)this);

        this.VistaLogin.setVisible(true);
    }
    
     public void OnLoginActionPerformend(){
         
            
            Persistente archivoHashMap = new ArchivoHashMap("user.dat");

            Usuario usuarioEncontrado = (Usuario) archivoHashMap.leer(Integer.parseInt(VistaLogin.UsuarioField.getText()));
            Boolean contrasenaIgual = Objects.equals(usuarioEncontrado.getContrasena(), VistaLogin.contraseñaField.getText());


           if(contrasenaIgual){
               if(Objects.equals(usuarioEncontrado.getTipo(), "Administrador")){
                  System.out.println("Mostrar pantalla Admin");
                  new ControllerAdmin(new UIADMIN());
                  VistaLogin.setVisible(false);
               }
           if(Objects.equals(usuarioEncontrado.getTipo(), "Usuario")){
                System.out.println("Mostrar pantalla usuario");
               new ControllerUser(new UIUSER());
               VistaLogin.setVisible(false);
            }
        }   
      }     
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== VistaLogin.loginbtn){
            
            OnLoginActionPerformend();
        }
    }
}           
            

    
    
  
    

   
    

