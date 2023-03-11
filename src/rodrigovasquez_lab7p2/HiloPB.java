package rodrigovasquez_lab7p2;

import javax.swing.JProgressBar;

public class HiloPB implements Runnable{
    private JProgressBar progressBar;
    private int sec;
    private boolean pb;

    public HiloPB() {
    }

    public HiloPB(JProgressBar progressBar, int sec, boolean pb) {
        this.progressBar = progressBar;
        this.sec = sec;
        this.pb = pb;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public boolean isPb() {
        return pb;
    }

    public void setPb(boolean pb) {
        this.pb = pb;
    }

    @Override
    public String toString() {
        return "HiloPB{" + "sec=" + sec + ", pb=" + pb + '}';
    }

    @Override
    public void run() {
        
    }
    
    
}
