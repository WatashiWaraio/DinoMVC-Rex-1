package ModeloDTO;

import java.io.Serializable;

public abstract class Buscable implements Serializable {
    private static final long serialVersionUID = 18L;
    
    private int identificacion;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    
    
}
