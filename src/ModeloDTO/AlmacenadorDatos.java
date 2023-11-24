package ModeloDTO;

import java.util.Map;

public class AlmacenadorDatos<T extends Buscable>{
    private Map<Integer, T> lista;

    public Map<Integer, T> getLista() {
        return lista;
    }

    public void setLista(Map<Integer, T> lista) {
        this.lista = lista;
    }

    
    
    
}
