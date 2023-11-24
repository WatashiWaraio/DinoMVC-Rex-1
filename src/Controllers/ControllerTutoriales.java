package Controllers;

import ModeloDAO.ArchivoHashMap;
import ModeloDAO.Persistente;
import ModeloDTO.AlmacenadorDatos;
import ModeloDTO.Informacion;
import Vista.UIADMIN;
import Vista.UITUTORIALES;
import Vista.UIUSER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerTutoriales implements ActionListener
{
    private final UITUTORIALES vistaTutoriales;
    private final Persistente info_dao;
    private final DefaultTableModel tabla;
    private UIUSER frame;
    private UIADMIN frame2;
    
    Informacion info_o;
    
    public ControllerTutoriales(UITUTORIALES vistaTutoriales, UIADMIN frame2) 
    {
        this.tabla = (DefaultTableModel) vistaTutoriales.tablaInfo.getModel();
        this.vistaTutoriales = vistaTutoriales;
        this.frame2 = frame2;
        
        // action listeners
        this.vistaTutoriales.buscarBTN.addActionListener(this);
        this.vistaTutoriales.iniciobtn.addActionListener(this);
        this.vistaTutoriales.todosBTN.addActionListener(this);
        this.vistaTutoriales.mostrarBTN.addActionListener(this);
        
        this.vistaTutoriales.setVisible(true);
        info_dao = new ArchivoHashMap<Informacion>("info.dat");
    }
    
    public ControllerTutoriales(UITUTORIALES vistaTutoriales, UIUSER frame) 
    {
        this.tabla = (DefaultTableModel) vistaTutoriales.tablaInfo.getModel();
        this.vistaTutoriales = vistaTutoriales;
        this.frame = frame;
        
        // action listeners
        this.vistaTutoriales.buscarBTN.addActionListener(this);
        this.vistaTutoriales.iniciobtn.addActionListener(this);
        this.vistaTutoriales.todosBTN.addActionListener(this);
        this.vistaTutoriales.mostrarBTN.addActionListener(this);
        
        this.vistaTutoriales.setVisible(true);
        info_dao = new ArchivoHashMap<Informacion>("info.dat");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == vistaTutoriales.todosBTN) {
            AlmacenadorDatos infos = info_dao.consultarTodos();
            Map<Integer, Informacion> infos_datos = infos.getLista();
            
            tabla.setRowCount(infos_datos.size());
            
            for (Map.Entry<Integer, Informacion> entrada : infos_datos.entrySet()) {
                        info_o = (Informacion) entrada.getValue();
                        tabla.addRow(new Object[]{info_o.getIdentificacion(), info_o.getNombre(), info_o.getFecha()});
            }
        }
        
        if (e.getSource() == vistaTutoriales.buscarBTN) {
            info_o = (Informacion) info_dao.leer(Integer.parseInt(vistaTutoriales.IDField.getText()));
            tabla.setRowCount(1);
            
            if (info_o != null)
                tabla.addRow(new Object[]{info_o.getIdentificacion(), info_o.getNombre(), info_o.getFecha()});
        }
        
        if (e.getSource() == vistaTutoriales.mostrarBTN) {
            int selected_row = vistaTutoriales.tablaInfo.getSelectedRow();
            
            if (selected_row != -1) {
                Object o = tabla.getValueAt(selected_row, 0);

                if (null != o) {
                    info_o = (Informacion) info_dao.leer(Integer.parseInt(o.toString()));
                    JOptionPane.showMessageDialog(null, info_o.getInformacion());
                } else {
                    JOptionPane.showMessageDialog(null, "Tutorial no existente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un tutorial para ver.");
            }
        }
        
        if(e.getSource() == vistaTutoriales.iniciobtn){
            vistaTutoriales.setVisible(false);
            if(frame != null)
                 frame.setVisible(true);
            else
                frame2.setVisible(true);
        }
        
    }
}