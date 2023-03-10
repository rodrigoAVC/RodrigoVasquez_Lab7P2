package rodrigovasquez_lab7p2;

import javax.swing.JTree;

/**
 *
 * @author Rui
 */
public class adminCarpetasPrincipales {
    private JTree jt_miUnidad, jt_destacados, jt_papelera;

    public adminCarpetasPrincipales(JTree jt_miUnidad, JTree jt_destacados, JTree jt_papelera) {
        this.jt_miUnidad = jt_miUnidad;
        this.jt_destacados = jt_destacados;
        this.jt_papelera = jt_papelera;
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
