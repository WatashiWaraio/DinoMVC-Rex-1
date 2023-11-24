package ModeloDAO;


import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import ModeloDTO.AlmacenadorDatos;
import ModeloDTO.Buscable;

public class ArchivoHashMap<T extends Buscable> implements Persistente
{

    private AlmacenadorDatos<T> datos = new AlmacenadorDatos<>();

    private FileOutputStream fos;
    private ObjectOutputStream oos;

    private final String nombre_archivo;

    public ArchivoHashMap(String nombre_archivo)
    {
        this.nombre_archivo = nombre_archivo;
        try {
            File archivo = new File(nombre_archivo);
            archivo.createNewFile();

            FileInputStream fis = new FileInputStream(archivo);
            if (0 != fis.available()) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                datos.setLista((HashMap<Integer, T>) ois.readObject());
                ois.close();
            } else {
                datos.setLista(new HashMap<>());
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int crear(Buscable b)
    {
        T dato = (T) b;
        int success = 1;

        if (null == datos.getLista().get(dato.getIdentificacion())) {
            datos.getLista().put(dato.getIdentificacion(), dato);
            updateDAO();
        } else {
            success = 0;
        }

        return success;
    }

    @Override
    public Buscable leer(int identificacion)
    {
        return (Buscable) datos.getLista().get(identificacion);
    }

    @Override
    public int actualizar(Buscable b)
    {
        T dato = (T) b;
        int success = 1;

        if (datos.getLista().remove(dato.getIdentificacion(), dato)) {
            datos.getLista().put(dato.getIdentificacion(), dato);
            updateDAO();
        } else {
            success = 0;
        }

        return success;
    }

    @Override
    public int eliminar(int identificacion)
    {
        int success = 1;

        if (null == datos.getLista().remove(identificacion)) {
            success = 0;
        } else {
            updateDAO();
        }

        return success;
    }

    @Override
    public AlmacenadorDatos consultarTodos()
    {
        return datos;
    }

    public void updateDAO()
    {
        try {
            fos = new FileOutputStream(nombre_archivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(datos.getLista());
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
