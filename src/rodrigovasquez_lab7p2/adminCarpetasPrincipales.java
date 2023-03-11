package rodrigovasquez_lab7p2;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Rui
 */
public class adminCarpetasPrincipales {

    private JTree jt_miUnidad, jt_destacados, jt_papelera;
    ArrayList<Carpeta> descargas = new ArrayList();

    public adminCarpetasPrincipales() {
    }
    
    public adminCarpetasPrincipales(JTree jt_miUnidad, JTree jt_destacados, JTree jt_papelera) {
        jt_miUnidad = new JTree();
        DefaultMutableTreeNode arbol1 = new DefaultMutableTreeNode("Mi Unidad");
        jt_miUnidad.setModel(new DefaultTreeModel(arbol1));
        this.jt_miUnidad = jt_miUnidad;
        jt_destacados = new JTree();
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("Destacados");
        jt_destacados.setModel(new DefaultTreeModel(b));
        this.jt_destacados = jt_destacados;
        jt_papelera = new JTree();
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Papelera");
        jt_papelera.setModel(new DefaultTreeModel(c));
        this.jt_papelera = jt_papelera;
    }

    public ArrayList<Carpeta> getDescargas() {
        return descargas;
    }

    public void setDescargas(ArrayList<Carpeta> descargas) {
        this.descargas = descargas;
    }

    public JTree getJt_miUnidad() {
        return jt_miUnidad;
    }

    public void setJt_miUnidad(JTree jt_miUnidad) {
        this.jt_miUnidad = jt_miUnidad;
    }

    public JTree getJt_destacados() {
        return jt_destacados;
    }

    public void setJt_destacados(JTree jt_destacados) {
        this.jt_destacados = jt_destacados;
    }

    public JTree getJt_papelera() {
        return jt_papelera;
    }

    public void setJt_papelera(JTree jt_papelera) {
        this.jt_papelera = jt_papelera;
    }

    @Override
    public String toString() {
        return "adminCarpetasPrincipales{" + "jt_miUnidad=" + jt_miUnidad + ", jt_destacados=" + jt_destacados + ", jt_papelera=" + jt_papelera + '}';
    }

}
