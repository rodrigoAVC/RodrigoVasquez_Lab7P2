package rodrigovasquez_lab7p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rui
 */
public class adminBinario extends Thread{
    adminCarpetasPrincipales cosa;

    public adminBinario() {
    }

    public adminBinario(adminCarpetasPrincipales cosa) {
        this.cosa = cosa;
    }

    @Override
    public void run() {
        while (true) {
            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            try {
                File fichero = new File("./archivos.rui");
                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                bw.writeObject(cosa);
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            try {
                Thread.sleep(20000);
            } catch (InterruptedException ex) {

            }
            
        }
    }
    
    
}
