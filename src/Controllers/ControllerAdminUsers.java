package Controllers;

import ModeloDAO.Persistente;
import ModeloDTO.Usuario;
import Vista.UIADMINUSUARIOS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ModeloDAO.ArchivoHashMap;
import ModeloDTO.AlmacenadorDatos;
import java.util.Map;

public class ControllerAdminUsers implements ActionListener {
    
    private final UIADMINUSUARIOS vistaAdminUsuario;
   
    private Usuario usuario;
    private final Persistente usuario_dao;
    private String TipoUser;
    

    public ControllerAdminUsers(UIADMINUSUARIOS vistaAdminUsuario) {
        this.vistaAdminUsuario = vistaAdminUsuario;
        this.vistaAdminUsuario.ConsultarTodosBTN.addActionListener((ActionListener)this);
        this.vistaAdminUsuario.CrearUsuarioBTN1.addActionListener((ActionListener)this);
        this.vistaAdminUsuario.searchbtn.addActionListener((ActionListener)this);
        this.vistaAdminUsuario.ActualizarUsuarioBTN.addActionListener((ActionListener)this);
        this.vistaAdminUsuario.EliminarUsuarioBTN.addActionListener((ActionListener)this);
        
        this.vistaAdminUsuario.setVisible(true);
        usuario_dao = new ArchivoHashMap<Usuario>("user.dat");
        
    } 
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        DefaultTableModel model = (DefaultTableModel) vistaAdminUsuario.TablaUsers.getModel();
        if(e.getSource() == vistaAdminUsuario.CrearUsuarioBTN1){
            vistaAdminUsuario.BOTONES.add(vistaAdminUsuario.TipoAdminBTN);
            vistaAdminUsuario.BOTONES.add(vistaAdminUsuario.TipoUserBTN);
            int identificacion = Integer.parseInt(vistaAdminUsuario.IDField.getText());
            String nombre = vistaAdminUsuario.NombreField.getText();
            int edad = Integer.parseInt(vistaAdminUsuario.EdadField.getText());
            String contrasena = String.valueOf(vistaAdminUsuario.ContraseñaField.getPassword());
            
            if(vistaAdminUsuario.TipoAdminBTN.isSelected()){
                TipoUser = "Administrador";
            }else if(vistaAdminUsuario.TipoUserBTN.isSelected()){
                TipoUser = "Usuario";
            }
            
            usuario = new Usuario();
            
            usuario.setContrasena(contrasena);
            usuario.setIdentificacion(identificacion);
            usuario.setNombre(nombre);
            usuario.setEdad(edad);
            usuario.setTipo(TipoUser);
            
            if(usuario_dao.crear(usuario) == 1)
                JOptionPane.showMessageDialog(null, "Usuario Creado Exitosamente");
            else
                JOptionPane.showMessageDialog(null, "Usuario existente");
        }    
            
        
        if(e.getSource() == vistaAdminUsuario.searchbtn){
           
            int id = Integer.parseInt(vistaAdminUsuario.BuscarField.getText());
            usuario = (Usuario) usuario_dao.leer(id);
            
            model.setRowCount(0);

            if(null != usuario)
                model.addRow(new Object[]{id, usuario.getNombre(), usuario.getEdad()});
        }
        
        if (e.getSource() == vistaAdminUsuario.EliminarUsuarioBTN) {
                int selectedRow = vistaAdminUsuario.TablaUsers.getSelectedRow();

            if (selectedRow != -1) { 
                int idToDelete = Integer.parseInt(vistaAdminUsuario.TablaUsers.getValueAt(selectedRow, 0).toString());
                usuario_dao.eliminar(idToDelete);
                ((DefaultTableModel) vistaAdminUsuario.TablaUsers.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con Exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un usuario para eliminar.");
            }
        }
        
        if(e.getSource() == vistaAdminUsuario.ConsultarTodosBTN){
            
            AlmacenadorDatos usuarios = usuario_dao.consultarTodos();
            Map<Integer, Usuario> datos = usuarios.getLista();

            model.setRowCount(0);
           
             for (Map.Entry<Integer, Usuario> entrada : datos.entrySet()) {
                    usuario = (Usuario) entrada.getValue();
                    model.addRow(new Object[]{usuario.getIdentificacion(), usuario.getNombre(), usuario.getEdad()});
                    
                }
        }
        
        if (e.getSource() == vistaAdminUsuario.ActualizarUsuarioBTN) {
            int id = Integer.parseInt(vistaAdminUsuario.IDField.getText());
            String nombre = vistaAdminUsuario.NombreField.getText();
            int edad = Integer.parseInt(vistaAdminUsuario.EdadField.getText());
            String contrasena = String.valueOf(vistaAdminUsuario.ContraseñaField.getPassword());

    
            String TipoUser = "";
                if (vistaAdminUsuario.TipoAdminBTN.isSelected()) {
                    TipoUser = "Administrador";
                 } else if (vistaAdminUsuario.TipoUserBTN.isSelected()) {
                    TipoUser = "Usuario";
                 }

               Usuario usuario = new Usuario();
               usuario.setContrasena(contrasena);
               usuario.setIdentificacion(id);
               usuario.setNombre(nombre);
               usuario.setEdad(edad);
               usuario.setTipo(TipoUser);

            int resultadoActualizacion = usuario_dao.actualizar(usuario);

      
            if (resultadoActualizacion == 1) {
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no existente");
            }
    }   
    
  }

}                   