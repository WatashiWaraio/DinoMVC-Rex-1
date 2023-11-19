package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ModeloDAO.Persistente;
import ModeloDTO.AlmacenadorDatos;
import ModeloDTO.Usuario;
import Vista.UIADMINUSUARIOS;

public class ControllerAdminUsers implements ActionListener {
    
    private final UIADMINUSUARIOS vistaAdminUsuario;
    private final Persistente modeloUsuario;
    private Usuario usuario;

    public ControllerAdminUsers(UIADMINUSUARIOS vistaAdminUsuario, Persistente user_dao) {
        this.vistaAdminUsuario = vistaAdminUsuario;
        this.modeloUsuario = user_dao;
        this.vistaAdminUsuario.ConsultarTodosBTN.addActionListener(this);
        this.vistaAdminUsuario.BuscarBTN.addActionListener(this);
        this.vistaAdminUsuario.ActualizarUsuarioBTN.addActionListener(this);
        this.vistaAdminUsuario.EliminarUsuarioBTN.addActionListener(this);
        
        this.vistaAdminUsuario.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaAdminUsuario.ConsultarTodosBTN){
            int identificacion = Integer.parseInt(vistaAdminUsuario.IDField.getText());
            String nombre = vistaAdminUsuario.NombreField.getText();
            int edad = Integer.parseInt(vistaAdminUsuario.EdadField.getText());
            String contrasena = String.valueOf(vistaAdminUsuario.ContraseñaField.getPassword());
            
            usuario = new Usuario();
            
            usuario.setContrasena(contrasena);
            usuario.setIdentificacion(identificacion);
            usuario.setNombre(nombre);
            usuario.setEdad(edad);
            
            int nuevo = modeloUsuario.crear(usuario);
            
            if(nuevo == 1)
                JOptionPane.showMessageDialog(null, "Usuario Guardado");
            else
                JOptionPane.showMessageDialog(null, "Usuario No Guardado");
        }
        
        if(e.getSource() == vistaAdminUsuario.BuscarBTN){
            
            int id = Integer.parseInt(vistaAdminUsuario.BuscarField.getText());
            AlmacenadorDatos consultar = modeloUsuario.consultarTodos();
            usuario = (Usuario) consultar.getLista().get(id);
            
            if(usuario == null)
                JOptionPane.showMessageDialog(null, "Usuario No Existe");
            else {
               
            }
        }
    }
}


