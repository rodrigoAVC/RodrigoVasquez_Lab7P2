package rodrigovasquez_lab7p2;

import java.util.Random;

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
        char caracter;
        for (int i = 0; i < 10; i++) {
            int random = new Random().nextInt((3-1)+1)+1;
            switch(random) {
                case 1:
                    int random1 = new Random().nextInt((122-97)+1)+97;
                    caracter = (char) random1;
                    link += caracter;
                    break;
                case 2:
                    int random2 = new Random().nextInt((90-65)+1)+65;
                    caracter = (char) random2;
                    link += caracter;
                    break;
                case 3:
                    int random3 = new Random().nextInt((57-48)+1)+48;
                    caracter = (char) random3;
                    link += caracter;
                    break;
            }
        }
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
        return name;
    }
    
    
}
