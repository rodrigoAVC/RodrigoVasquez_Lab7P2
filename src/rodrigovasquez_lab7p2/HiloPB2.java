package rodrigovasquez_lab7p2;

import javax.swing.JProgressBar;

/**
 *
 * @author Rui
 */
public class HiloPB2 extends Thread{
    private JProgressBar pb2;
    private double peso;

    public HiloPB2() {
    }

    public HiloPB2(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    @Override
    public void run() {
        pb2.setMaximum((int) peso / 10);
        while(pb2.getMaximum() ) {
            
        }
    }
    
    
}
