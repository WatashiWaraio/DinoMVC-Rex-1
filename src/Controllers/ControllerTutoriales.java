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
        
        this.vistaTutoriales.setVisible(true);
        info_dao = new ArchivoHashMap<Informacion>("info.dat");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == vistaTutoriales.todosBTN) {
            AlmacenadorDatos infos = info_dao.consultarTodos();
            Map<Integer, Informacion> infos_datos = infos.getLista();
            
            tabla.setColumnCount(infos_datos.size());
            
            for (Map.Entry<Integer, Informacion> entrada : infos_datos.entrySet()) {
                        info_o = (Informacion) entrada.getValue();
                        tabla.addRow(new Object[]{info_o.getIdentificacion()});
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