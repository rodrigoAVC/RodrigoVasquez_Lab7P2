package rodrigovasquez_lab7p2;

/**
 *
 * @author Rui
 */
public class Archivo {
    private String name, link, extension;
    private double size;

    public Archivo() {
    }

    public Archivo(String name, String link, String extension, double size) {
        this.name = name;
        this.link = link;
        this.extension = extension;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name + "" + extension + " - " + size;
    }
    
    
}
