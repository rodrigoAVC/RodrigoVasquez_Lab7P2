package rodrigovasquez_lab7p2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class Carpeta {

    private String nombre, link;
    ArrayList<Archivo> archivos = new ArrayList();
    ArrayList<Carpeta> carpetas = new ArrayList();

//    private final long serialVersionUID = 234324324234L;
    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
//        return nombre + ": [Link ->" + link + ']' + " [Archivos ->" + archivos + ']' + " [Carpetas ->" + carpetas + ']';
        return nombre;
    }

    //Metodos de Admin
}
