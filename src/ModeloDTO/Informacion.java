package ModeloDTO;

import java.awt.image.BufferedImage;
import java.time.LocalTime;

public class Informacion extends Buscable {
    private String tipo;
    private BufferedImage imagenSoporte;
    private String informacion; 
    private LocalTime fecha;  
    
    public Informacion()
    {
        fecha = LocalTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BufferedImage getImagenSoporte() {
        return imagenSoporte;
    }

    public void setImagenSoporte(BufferedImage imagenSoporte) {
        this.imagenSoporte = imagenSoporte;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
