package ModeloDTO;

import java.awt.image.BufferedImage;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Informacion extends Buscable {
    private String nombre;
    private BufferedImage imagenSoporte;
    private String informacion; 
    private LocalTime fecha;  
    
    public Informacion()
    {
        fecha = LocalTime.now();
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
        return fecha.format(DateTimeFormatter.RFC_1123_DATE_TIME);
    }
}
