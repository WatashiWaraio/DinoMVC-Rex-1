package ModeloDAO;

import ModeloDTO.AlmacenadorDatos;
import ModeloDTO.Buscable;

public interface Persistente
{
    public int crear(Buscable b);
    public Buscable leer(int identificacion);
    public int actualizar(Buscable b);
    public int eliminar(int identificacion);
    public AlmacenadorDatos consultarTodos(); 
}
