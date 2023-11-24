package Controllers;

import ModeloDAO.ArchivoHashMap;
import ModeloDAO.Persistente;
import ModeloDTO.AlmacenadorDatos;
import ModeloDTO.Informacion;
import Vista.UIADMININFORMACION;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerAdminInfo implements ActionListener
{
    private final UIADMININFORMACION vistaAdminInfo;
    private final Persistente info_dao;
    private DefaultTableModel tabla;
    
    Informacion info_o;
    
    public ControllerAdminInfo(UIADMININFORMACION vistaAdminInfo)
    {
        this.vistaAdminInfo = vistaAdminInfo;
        
        // action listeners
        this.vistaAdminInfo.buscarBTN.addActionListener(this);
        this.vistaAdminInfo.crearBTN.addActionListener(this);
        this.vistaAdminInfo.eliminarTutoBTN.addActionListener(this);
        this.vistaAdminInfo.todosBTN.addActionListener(this);
        this.vistaAdminInfo.updateBTN.addActionListener(this);
        this.vistaAdminInfo.editarBTN.addActionListener(this);
        
        this.vistaAdminInfo.setVisible(true);
        info_dao = new ArchivoHashMap<Informacion>("info.dat");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        tabla = (DefaultTableModel) vistaAdminInfo.tablaInfo.getModel();
        
        if (e.getSource() == vistaAdminInfo.todosBTN) {
            AlmacenadorDatos infos = info_dao.consultarTodos();
            Map<Integer, Informacion> infos_datos;
            infos_datos = infos.getLista();
            
            tabla.setRowCount(0);
            
            for (Map.Entry<Integer, Informacion> entrada : infos_datos.entrySet()) {
                        info_o = (Informacion) entrada.getValue();
                        tabla.addRow(new Object[]{info_o.getIdentificacion(), info_o.getNombre(), info_o.getFecha()});
            }
        }
        
        if (e.getSource() == vistaAdminInfo.buscarBTN) {
            info_o = (Informacion) info_dao.leer(Integer.parseInt(vistaAdminInfo.buscarField.getText()));
            tabla.setRowCount(0);
            
            if (info_o != null)
                tabla.addRow(new Object[]{info_o.getIdentificacion(), info_o.getNombre(), info_o.getFecha()});
        }
        
        if (e.getSource() == vistaAdminInfo.editarBTN) {
            int selected_row = vistaAdminInfo.tablaInfo.getSelectedRow();
            
            if (selected_row != -1) {
                Object o = tabla.getValueAt(selected_row, 0);

                if (null != o) {
                    info_o = (Informacion) info_dao.leer(Integer.parseInt(o.toString()));
                    vistaAdminInfo.IDField.setText(String.valueOf(info_o.getIdentificacion()));
                    vistaAdminInfo.nombreField.setText(info_o.getNombre());
                    vistaAdminInfo.infoField.setText(info_o.getInformacion());
                } else {
                    JOptionPane.showMessageDialog(null, "Tutorial no existente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un tutorial para ver.");
            }
        }
        
        if (e.getSource() == vistaAdminInfo.eliminarTutoBTN) {
            int selected_row = vistaAdminInfo.tablaInfo.getSelectedRow();
            
            if (selected_row != -1) {
                Object o = tabla.getValueAt(selected_row, 0);

                if (null != o) {
                    info_dao.eliminar(Integer.parseInt(o.toString()));
                    tabla.removeRow(selected_row);
                } else {
                    JOptionPane.showMessageDialog(null, "Tutorial no existente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un tutorial para ver.");
            }
        }
        
        if (e.getSource() == vistaAdminInfo.crearBTN) {
            info_o = new Informacion();
            
            info_o.setIdentificacion(Integer.parseInt(vistaAdminInfo.IDField.getText()));
            info_o.setNombre(vistaAdminInfo.nombreField.getText());
            info_o.setInformacion(vistaAdminInfo.infoField.getText());
            
            if (1 == info_dao.crear(info_o))
                JOptionPane.showMessageDialog(null, "Tutorial creado exitosamente");                
            else 
                JOptionPane.showMessageDialog(null, "Tutorial existente");                                
        }
        
        if (e.getSource() == vistaAdminInfo.updateBTN) {
            info_o = new Informacion();
            
            info_o.setIdentificacion(Integer.parseInt(vistaAdminInfo.IDField.getText()));
            info_o.setNombre(vistaAdminInfo.nombreField.getText());
            info_o.setInformacion(vistaAdminInfo.infoField.getText());
            
            if (1 == info_dao.actualizar(info_o))
                JOptionPane.showMessageDialog(null, "Tutorial actualizado exitosamente");                                
            else
                JOptionPane.showMessageDialog(null, "Tutorial no existente");                                
        }
    }
}
