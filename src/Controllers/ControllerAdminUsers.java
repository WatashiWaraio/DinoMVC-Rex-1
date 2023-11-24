package Controllers;

import ModeloDAO.Persistente;
import ModeloDTO.Usuario;
import Vista.UIADMINUSUARIOS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ModeloDAO.ArchivoHashMap;

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
        }    
            
        
        if(e.getSource() == vistaAdminUsuario.searchbtn){
           
            int id = Integer.parseInt(vistaAdminUsuario.BuscarField.getText());
            usuario = (Usuario) usuario_dao.leer(id);

            if(null != usuario){
                model.addRow(new Object[]{id, usuario.getNombre(), usuario.getEdad()});
            }else {
               JOptionPane.showMessageDialog(null, "Usuario No Existe");
            }
        }
        
        if (e.getSource() == vistaAdminUsuario.EliminarUsuarioBTN) {
                int selectedRow = vistaAdminUsuario.TablaUsers.getSelectedRow();

            if (selectedRow != -1) { // Verifica si hay una fila seleccionada
                int idToDelete = Integer.parseInt(vistaAdminUsuario.TablaUsers.getValueAt(selectedRow, 0).toString());
                usuario_dao.eliminar(idToDelete);
                ((DefaultTableModel) vistaAdminUsuario.TablaUsers.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con Exito.");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un usuario para eliminar.");
            }
        }
    }

}                   