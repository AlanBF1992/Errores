import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        super();
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        //TODO
        File directorio = new File("src/ficheros");
        File archivo = new File(directorio,getNombreVenta());
        if (!directorio.exists()) {
            try {
                if (archivo.createNewFile()) {
                    int fecha = Integer.parseInt(getFechaVenta());
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);

                    bw.write(vehiculo.getPatente());
                    bw.write(cliente.getEdad());
                    bw.write(fecha);
                    bw.write(getNombreVenta());
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
