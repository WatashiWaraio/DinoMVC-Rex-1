package Controllers;


import Vista.UIADMIN;
import Vista.UITUTORIALES;
import Vista.UIUSER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerTutoriales implements ActionListener{

    private final UITUTORIALES tutoriales;
    private  UIUSER frame;
    private  UIADMIN frame2;
    
    public ControllerTutoriales(UITUTORIALES tutoriales,UIUSER frame) {
        this.tutoriales = tutoriales; 
        this.frame= frame;
        this.tutoriales.setVisible(true);
        this.tutoriales.iniciobtn.addActionListener(this);
        
    }
    
     public ControllerTutoriales(UITUTORIALES tutoriales,UIADMIN frame2) {
        this.tutoriales = tutoriales; 
        this.frame2= frame2;
        this.tutoriales.setVisible(true);
        this.tutoriales.iniciobtn.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == tutoriales.iniciobtn){
            tutoriales.setVisible(false);
            if(frame != null)
                 frame.setVisible(true);
            else
                frame2.setVisible(true);
        }
    }  
}
