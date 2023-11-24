package ModeloDTO;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Informacion extends Buscable {
    private String nombre;
    private BufferedImage imagenSoporte;
    private String informacion; 
    private LocalDateTime fecha;  
    
    public Informacion()
    {
        fecha = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    public String getFecha()
    {
        return fecha.format(DateTimeFormatter.ISO_DATE);
    }
}
